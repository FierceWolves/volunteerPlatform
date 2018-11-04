/*
 * 获取手机验证码
 */
function getIcode() {
	var rs = filter($("#register-phone").val(), 'phone');
	if(!rs['status']) {
		return alert(rs['message']);
	}
	var formData = new FormData();
	formData.append("mobile", $("#register-phone").val());
	formData.append("type", "1");
	formData.append("code_id", $("#code_id").val());
	formData.append("captcha_code", $("#captcha_code").val());
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));

	if($("#code_id").val() != '' && $("#captcha_code").val() == '') {
		alert('图片验证码不能为空');
		return false;
	}

	//var data = ajaxPost('/web/site/public?url=api/comm/sendVerification.do', formData);
	var data = ajaxPost('/web/site/mobile-send', formData);
	if(data['status'] === 'true' || data['status'] === true) {
		$("#time").attr("onclick", "");
		s(60);
		return;
	}
	alert(data['message']);

	//图片验证码更新
	captcha();
}
// 时间
function s(number) {
	$("#time").html(number + "秒");
	number--;
	if(number == -1) {
		$("#time").html("再次获取");
		$("#time").attr("onclick", "getIcode(this)");
		return;
	}
	var t = setTimeout("s(" + number + ")", 1000);
}
/*
 * 用户注册第一步
 */
function userRegSetp1(formData) {
	var data = ajaxPost('/web/user/registerperson', formData);
	if(data['status'] === 'true' || data['status'] === true) {
		// 绑定信息
		$("#userid").val(data.user.id);
		$("#username").val(data.user.name);
		$("#useridcard").val(data.user.idcard);
		startSetp2();
		setpChange(2);
		return;
	}
	return alert(data['message']);
	
}
/*
 * 用户注册第二步（最后一步）
 */
function registerForAll() {
	if($("#username").val() == "" || $("#useridcard").val() == "" || $("#register_area_1").val() == "" || $("#register_area_2").val() == "" || $("#register_area_3").val() == "" || $("#sex").val() == "" || $("#nationid").val() == "" || $("#register_origin_1").val() == "" || $("#register_origin_2").val() == "" || $("#register_crd_1").val() == "" || $("#register_crd_2").val() == "" || $("#register_crd_3").val() == "" || $("#email").val() == "" || $("#job").val() == "" || $("#education").val() == "" || $("input[name=skills]").val() == "" || $("input[name=servicearea]").val() == "") {
		return alert("请将必填项填写完整");
	}
	var formData = new FormData($("#tripe2-form")[0]);
	var data = ajaxPost('/web/user/registerall', formData);
	if(data['status'] === "true" || data['status'] === true) {
		return setpChange(3);
	}
	return alert(data['message']);
}
/*
 * 步骤2初始化
 */
function startSetp2() {
	var formData = new FormData();
	// 初始化政治面貌下拉菜单
	formData.append('typecode', 'areatree');
	formData.append('parentid', '14737477846505d6208a5e781435b84e2e079304353cb');
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataTree.do', formData, startPrivince);
	// 初始化政治面貌下拉菜单
	startPolitical = function(data) {
		startDownlist('other-listrender', data, 'political');
	}
	formData = new FormData();
	formData.append('typecode', 'political');
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataCombobox.do', formData, startPolitical);
	// 初始化民族下拉菜单
	startNation = function(data) {
		startDownlist('other-listrender', data, 'nation');
	}
	formData = new FormData();
	formData.append('typecode', 'nation');
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataCombobox.do', formData, startNation);
	// 初始化最高学历下拉菜单
	startEducationtype = function(data) {
		startDownlist('other-listrender', data, 'education');
	}
	formData = new FormData();
	formData.append('typecode', 'educationtype');
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataCombobox.do', formData, startEducationtype);
	// 初始化从业情况下拉菜单
	startJob = function(data) {
		startDownlist('other-listrender', data, 'job');
	}
	formData = new FormData();
	formData.append('typecode', 'practitionerstype');
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataCombobox.do', formData, startJob);
	// 初始化擅长技能多选列表
	startSkills = function(data) {
		startCheckbox('skills-render', data, 'skillsbox');
	}
	formData = new FormData();
	formData.append('typecode', 'skilltype');
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataCombobox.do', formData, startSkills);
	// 初始化服务领域多选列表
	startServicearea = function(data) {
		startCheckbox('servicearea-render', data, 'serviceareabox');
	}
	formData = new FormData();
	formData.append('typecode', 'servicearea');
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataCombobox.do', formData, startServicearea);
}
/*
 * 初始化省市联动一级菜单
 */
function startPrivince(data) {
	startDownlist('city-listrender', data, 'register_origin_1');
	startDownlist('city-listrender', data, 'register_area_1');
	startDownlist('city-listrender', data, 'register_crd_1');
}

/*
 * 步骤切换
 */
function setpChange(num) {
	$(".registerperson-tripe").hide();
	$(".tripe" + num).fadeIn();
	$(".setp-btn").removeClass("setp-btn-active");
	for(var i = 1; i < num + 1; i++) {
		$("#setp-btn" + i).addClass("setp-btn-active");
	}
}
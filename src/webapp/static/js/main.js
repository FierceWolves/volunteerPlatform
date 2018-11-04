// 打开切换城市弹窗
function openCity() {
    if ($(".header-city-box").css('display') == 'none') {
        $(".header-city-box").show();
        // 如果是第一次打开，初始化相应信息
        if ($("#first").attr("isold") == "false") {
            $(".header-city-tag li").removeClass("header-city-tag-active");
            $("#first").attr("isold", "true");
            $("#first").click();
        }
    } else {
        $(".header-city-box").hide();
    }
    return false;
}

// 切换部分省份
function areaChange(dom) {
    var city_str = $(dom).attr("val");
    // 刷新样式
    $(".header-city-tag li").removeClass("header-city-tag-active");
    $(dom).addClass("header-city-tag-active");
    // 移除原始数据
    $(".header-city-box dl").remove();
    var formData = new FormData();
    formData.append("_csrf", $("meta[name='csrf-token']").attr("content"));
    formData.append("region", city_str);
    var areaData = ajaxPost("/web/selectregion/index", formData);
    // 获取部分省份信息并显示到页面
    var myTmpl = $.templates("#cityList");
    var html = myTmpl.render(areaData.province);
    $(".header-city-box").append(html);
}

// 切换城市
function headerCityChange(dom) {
    // $("#header-city-name").html($(dom).html());
    $(".header-city-box").hide();
    var city = new Array();
    city["name"] = $(dom).html();
    city["val"] = $(dom).attr("val");
    // 获取当前城市id
    // var formData = new FormData();
    // formData.append("_csrf", $("meta[name='csrf-token']").attr("content"));
    // formData.append("code", $(dom).attr("val"));
    // var data = ajaxPost("/web/site/public?url=api/comm/getDeptIdByCode.do", formData);
    // city["id"] = data['id'];
    city["id"] = $(dom).attr("newid");
    city["class"] = $(dom).attr("class");
    city["upclass"] = $(dom).attr("upclass");
    // 记录切换切换的城市
    setCookie("currentDistrict", city);
    // 刷新当前页
    window.location.reload();
}

// 检验当前城市
function checkCurrentCity() {
    var city = getCookie("currentDistrict");
    if ($.type(city) != 'null') {
        $("#header-city-name").html(city["name"]);
        city['status'] = true;
        return city;
    }
    city = new Array();
    city['status'] = false;
    return city;
}

// 打开搜索框前提box
function headerOpenSearchF(dom) {
    if ($(dom).attr("check") == 'false') {
        $(".header-search-item").show();
        $(dom).attr("check", true);
    } else {
        $(".header-search-item").hide();
        $(dom).attr("check", false);
    }
}

// 选择搜索框前提
function headerSearchF(dom) {
    $("#header-search-F").html($(dom).html());
    $("#header-search-input").attr("placeholder", "搜索" + $(dom).html());
    $("#header-search-input").attr("searchfor", $(dom).html());
    $("#header-search-F").click();
}

// 回到顶部
function goTop() {
    $("body,html").stop(true).animate({scrollTop: 0}, 200);
}




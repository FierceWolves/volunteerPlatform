// 简化AJAX请求
function ajaxPost(url, formData) {
    var obj;
    //formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
    $.ajax({
        type: "post",
        url: url,
        data: formData,
        processData: false,// 告诉jQuery不要去处理发送的数据
        contentType: false,// 告诉jQuery不要去设置Content-Type请求头
        async: false,
        success: function (data) {
            obj = eval("(" + data + ")");
        },
        error: function (error) {
            console.log(error);
            obj = error;
        }
    });
    return obj;
}

/*
 * AJAX异步封装
 */
function ajaxPostAsync(url, formData, successFun) {
    var obj;
    formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
    $.ajax({
        type: "post",
        url: url,
        data: formData,
        processData: false,// 告诉jQuery不要去处理发送的数据
        contentType: false,// 告诉jQuery不要去设置Content-Type请求头
        async: true,
        success: function (data) {
            obj = eval("(" + data + ")");
            successFun(obj);
        },
        error: function (error) {
            console.log(error);
            obj = error;
        }
    });
    return obj;
}

// 表单检验
function filter(val, type) {
    var result = new Array();
    result['status'] = true;
    if (val == '' || val == undefined || val == null) {
        result['status'] = false;
        result['message'] = type + '不可为空';
        return result;
    }
    if (type == '' || type == undefined || type == null) {
        return result;
    }
    switch (type) {
        case 'phone':
            //if(!val.match(/(1[3-9]\d{9}$)/)){
            if (!(/^1\d{10}$/.test(val))) {
                result['status'] = false;
                result['message'] = '手机号格式不正确';
            }
            break;
        case 'email':
            if (!val.match(/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/)) {
                result['status'] = false;
                result['message'] = '邮箱格式不正确';
            }
            break;
    }
    return result;
}

// 处理活动数据
function setupActData(data) {
    var time_now = Date.parse(new Date());
    for (var newdata in data) {
        var day = (data[newdata]["recruit_finish_time"] - time_now) / 86400000;
        if (day > 0.001 && day < 1) {
            day = 1;
        }
        if (day < 0.001) {
            day = 0;
        }
        data[newdata]["time"] = parseInt(day);
        data[newdata]["timeline"] = (time_now - data[newdata]["recruit_start_time"]) / (data[newdata]["recruit_finish_time"] - data[newdata]["recruit_start_time"]);
        data[newdata]["timeline"] = data[newdata]["timeline"].toFixed(4) * 100 + "%";
    }
    return data;
}

// 显示下拉列表
function downList(dom) {
    var is_show = $(dom).next().is(":hidden");
    $(".search-order-itemlist").hide();
    if (is_show) {
        $(dom).next().fadeIn(200);
        $(dom).next().find("input").focus();
    } else {
        $(dom).next().hide();
    }
}

// 点选下拉列表项事件
function downListItemClick(dom) {
    var dom_fa = $(dom).parent();
    var dom_gfa = dom_fa.parent();
    dom_fa.find("li").removeClass("search-order-itemlist-actived");
    $(dom).addClass("search-order-itemlist-actived");
    dom_fa.hide();
    dom_fa.find("input").val($(dom).attr("val"));
    dom_gfa.find("a").html($(dom).html() + "<i></i>");
    dom_fa.find("input").change();
}

// 点选分类列表项事件
function classItemClick(dom) {
    var dom_fa = $(dom).parent();
    dom_fa.find("dd").removeClass("search-item-actived");
    $(dom).addClass("search-item-actived");
    dom_fa.find("input").val($(dom).attr("val"));
    dom_fa.find("input").change();
}

// 获取省市区下拉列表数据
function downlistGetProvince(val) {
    var formData = new FormData();
    formData.append("typecode", "areatree");
    formData.append("parentid", val);
    formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
    var data = ajaxPost('/web/site/public?url=api/comm/basicdataTree.do', formData);
    return data;
}

// 获取其他下拉列表数据
function downlistGetOther(type) {
    var formData = new FormData();
    formData.append("typecode", type);
    formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
    var data = ajaxPost('/web/site/public?url=api/comm/basicdataTree.do', formData);
    return data;
}

// 城市联动三级菜单change事件
function downlistOfProvince(lv, maxlv, publicid, dom) {
    // 获取数据
    var formData = new FormData();
    formData.append("typecode", "areatree");
    formData.append("parentid", dom.value);
    formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
    var data = ajaxPost('/web/site/public?url=api/comm/basicdataTree.do', formData);
    for (var i = lv + 1; i < maxlv + 1; i++) {
        // 初始化后几级菜单
        $("#" + publicid + i).val("");
        $("#" + publicid + i).prevAll().remove();
        $("#" + publicid + "show_" + i).html("请选择<i></i>");
    }
    // 填充下级菜单
    var domnext = $("#" + publicid + (lv + 1));
    var myTmpl = $.templates("#city-listrender");
    var html = myTmpl.render(data);
    domnext.before(html);
}

/*获取url参数*/
function _get() {
    var url = location.href;
    var parameter = new Array();
    if (url.indexOf("?") != -1) {
        url = url.split("?");
        url = new Array(url[1]);
    } else {
        return "";
    }
    if (url[0].indexOf("&") != -1) {
        url = url[0].split("&");
    }
    for (var i = 0; i < url.length; i++) {
        var one_parameter = url[i].split("=");
        parameter[one_parameter[0]] = one_parameter[1];
    }
    return parameter;
}

//写cookies

function setCookie(name, value) {
    var Days = 30;
    var exp = new Date();
    exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
    document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();
}

//读取cookies
function getCookie(name) {
    var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
    if (arr = document.cookie.match(reg))
        return unescape(arr[2]);
    else
        return "";
}

//删除cookies
function deleteCookie(name) {
    var exp = new Date();
    exp.setTime(exp.getTime() - 1);
    var cval = getCookie(name);
    if (cval != null)
        document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
}

//数组转json
function arrToJson(arr) {
    var json = {};
    for (var key in arr) {
        json[key] = arr[key];
    }
    return JSON.stringify(json);
}

//json转数组
function jsonToArr(arr) {
    return eval(arr);
}

//时间转换
function formatDate(now) {
    var now = new Date(parseInt(now));
    var year = now.getFullYear();
    var month = now.getMonth() + 1;
    var date = now.getDate();
    var hour = now.getHours();
    var minute = now.getMinutes();
    var second = now.getSeconds();
    return year + "年" + fixZero(month, 2) + "月" + fixZero(date, 2) + "日";
}

//时间转换
function formatDate2(now) {
    var now = new Date(parseInt(now));
    var year = now.getFullYear();
    var month = now.getMonth() + 1;
    var date = now.getDate();
    var hour = now.getHours();
    var minute = now.getMinutes();
    var second = now.getSeconds();
    return year + "-" + fixZero(month, 2) + "-" + fixZero(date, 2);
}

//时间转换
function formatDate3(now) {
    var now = new Date(parseInt(now));
    var year = now.getFullYear();
    var month = now.getMonth() + 1;
    var date = now.getDate();
    var hour = now.getHours();
    var minute = now.getMinutes();
    var second = now.getSeconds();
    return year + "年" + fixZero(month, 2) + "月" + fixZero(date, 2) + "日" + hour + ":" + minute + ":" + second;
}

//时间如果为单位数补0
function fixZero(num, length) {
    var str = "" + num;
    var len = str.length;
    var s = "";
    for (var i = length; i-- > len;) {
        s += "0";
    }
    return s + str;
}

/*设置Qiniu.uploader对象参数*/
function setOption(parent, button, last, token) {
    return {
        runtimes: 'html5,flash,html4',    //上传模式,依次退化
        container: parent,           //上传区域DOM ID，默认是browser_button的父元素，
        drop_element: parent,        //拖曳上传区域元素的ID，拖曳文件或文件夹后可触发上传
        browse_button: button,       //上传选择的点选按钮，**必需**
        uptoken_url: '/web/qiniu/getsdk',            //Ajax请求upToken的Url，**强烈建议设置**（服务端提供）
        uptoken: token, //若未指定uptoken_url,则必须指定 uptoken ,uptoken由其他程序生成
        // save_key: true,   // 默认 false。若在服务端生成uptoken的上传策略中指定了 `sava_key`，则开启，SDK会忽略对key的处理
        domain: 'http://image.zyz.org.cn/',   //bucket 域名，下载资源时用到，**必需**
        get_new_uptoken: false,  //设置上传文件的时候是否每次都重新获取新的token
        max_file_size: '10mb',           //最大文件体积限制
        flash_swf_url: 'js/plupload/Moxie.swf',  //引入flash,相 对路径
        max_retries: 3,                   //上传失败最大重试次数
        dragdrop: true,                   //开启可拖曳上传
        chunk_size: '10mb',                //分块上传时，每片的体积
        auto_start: false,                 //选择文件后自动上传，若关闭需要自己绑定事件触发上传
        unique_names: true,      //设置所有文件名唯一
        filters: {
            mime_types: [ //只允许上传图片
                {title: "Image files", extensions: "jpg,jpeg,gif,png"},
            ],
            prevent_duplicates: false //不允许选取重复文件
        },
        deleteAfterDays: '',
        init: {
            'FilesAdded': function (up, files) {
                // 设置预览图地址
                var img = new o.Image();
                img.onload = function () {
                    $("#" + button).attr('src', this.getAsDataURL());
                }
                img.load(files[0].getSource());
                // 开始上传按钮
                $("#" + button + "_start").click(function () {
                    up.start();
                });
                plupload.each(files, function (file) {
                    // 如果上传文件大于1 ps：第一个文件上传的时候用户选择第二个文件
                    // 这时队列大于1，队列的第一个文件是正在上传的，第二个是新选的
                    if (up.files.length > 1) {
                        // 移除当前队列里第一个文件
                        up.removeFile(up.files[0]);
                    }
                    // 全局变量 根据变量控制不让表单提前提交
                    imgloading = true;
                    // 文件添加进队列后,处理相关的事情
                });
            },
            'BeforeUpload': function (up, file) {
                // 每个文件上传前,处理相关的事情
                $("#" + button + "_uploading").click(function () {
                    up.stop();
                    $("#" + button + "_uploading").fadeOut();
                });
            },
            'UploadProgress': function (up, file) {
                if ($("#" + button + "_uploading").length < 1) {
                    return;
                }
                $("#" + button + "_uploading").show();
                $("#" + button + "_uploading").html(up.total.percent + "%（点击取消）");
                // 每个文件上传时,处理相关的事情
            },
            'FileUploaded': function (up, file, info) {
                var domain = up.getOption('domain');
                var res = $.parseJSON(info);
                var sourceLink = domain + res.key; //获取上传成功后的文件的Url
                // 设置图片名称
                $("#" + button + "_input").val(res.key);
                // 进度更新为上传完成
                $("#" + button + "_uploading").html("上传完成");
                $("#" + button + "_uploading").unbind();
                // 图片上传后执行事件
                // eval(last+"()");
                last();
            },
            'Error': function (up, err, errTip) {
                alert("目前只支持图片格式：jpg,jpeg,gif,png");
                //上传出错时,处理相关的事情
            },
            'UploadComplete': function () {
                //队列文件处理完毕后,处理相关的事情
            },
        }
    };
}
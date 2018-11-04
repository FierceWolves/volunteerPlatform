//页面资源

//请求路径
var path;
//静态资源路径
var staticPath;

$(document).ready(function () {
    path = $("#jspPath").val();
    staticPath = $("#staticPath").val();
    //logo img标签 src 赋值
    $(".header-logo").attr("src", staticPath + "/images/logo.png");
    //微信二维码标签src
    $(".footer-right").attr("src", staticPath + "/images/b-wechat.png");

    //注册
    $(".userRegister").attr("href",path+"/site/register");

    //导航栏事件绑定
    //首页跳转
    $("#home-li").click(function () {
        window.location.href = path + "/site/home";
    })
    //活动页
    $("#activity-li").click(function () {
        window.location.href = path + "/site/activity";
    })
    //组织页
    $("#org-li").click(function () {
        window.location.href = path + "/site/org";
    })
    //资讯页
    $("#information-li").click(function () {
        window.location.href = path + "/site/information";
    })
    //商城页
    $("#creditShop-li").click(function () {
        window.location.href = path + "/site/shop";
    })

    //网站log绑定点击事件
    $(".header-logo").click(function () {
        window.location.href = path + "/site/home";
    })


})

window.onload = function () {

    path = $("#jspPath").val();
    staticPath = $("#staticPath").val();
    //检验用户是否登录
    var loginId = sessionStorage.getItem("loginId");
    if (loginId != null && loginId != 'undefined'){
        //发送请求，检验服务器用户是否登录
        $.ajax({
            url:path+"/user/checkLogin",
            type:"get",
            success:function (result) {
                console.log(result.message == "已登录");
                if (result.message == "已登录"){
                    $("#userLogin").text("个人中心");
                    $("#userLogin").attr("href",path+"/user/homepage");
                }
            }
        })
    } else {
        $("#userLogin").text("登录");
        $("#userLogin").attr("href",path+"/user/login");
    }

}
//意见资讯
function advice() {
    window.location.href=path+"/site/advice";
}
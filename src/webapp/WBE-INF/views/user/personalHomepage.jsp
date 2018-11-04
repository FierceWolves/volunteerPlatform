<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath() + "/static");%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="api_token" content="">
    <title>志愿者平台</title>
    <link rel="shortcut icon" href="${staticPath}/images/titleLogo.png"/>
    <link href="${staticPath}/css/core.css" rel="stylesheet">
    <script src="${staticPath}/js/jquery-3.3.1.js" type="text/javascript"></script>
    <script src="${staticPath}/js/jsrender.min.js" type="text/javascript"></script>
    <script src="${staticPath}/js/jquery.page.js" type="text/javascript"></script>
    <script src="${staticPath}/js/core.js" type="text/javascript"></script>
    <script src="${staticPath}/js/main.js" type="text/javascript"></script>
    <script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

<body>
<input type="hidden" id="jspPath" value="${jspPath}">
<input type="hidden" id="staticPath" value="${staticPath}">

<div class="main-fix-window">
    <div class="main-fix-item1" onClick="goTop()">回到顶部</div>
    <div class="main-fix-item3" onClick="advice()">意见建议</div>
</div>

<div class="wrap">

    <div class="header">
        <nav>
            <img class="header-logo">
            <div class="header-city">
                <nobr><em id="header-city-name">全国站</em>
                    <font onclick="openCity()">［切换城市］</font>
                </nobr>
            </div>
            <ul class="header-ul">
                <li class="header-ul-li" id="home-li">首页</li>
                <li class="header-ul-li" id="activity-li">活动</li>
                <li class="header-ul-li" id="org-li">组织</li>
                <li class="header-ul-li" id="information-li">资讯</li>
                <li class="header-ul-li" id="creditShop-li">积分商城</li>

                <ul class="header-user">
                    <li class="header-ul-li header-user-downlist">
                        <a id="userLogin" val="0">登录</a>
                    </li>
                    <li class="header-ul-li header-user-downlist">
                        <a class="userRegister">注册</a>
                    </li>

                </ul>
            </ul>
        </nav>
    </div>

    <div class="header-city-box">
        <p onClick="headerCityChange(this)" val="0">全国站</p>
        <ul class="header-city-tag">
            <li onClick="areaChange(this)" id="first" isold="false" val="1">华东</li>
            <li onClick="areaChange(this)" val="2">华南</li>
            <li onClick="areaChange(this)" val="3">中南</li>
            <li onClick="areaChange(this)" val="4">东北</li>
            <li onClick="areaChange(this)" val="5">西南</li>
            <li onClick="areaChange(this)" val="6">华北</li>
            <li onClick="areaChange(this)" val="7">西北</li>
            <li onClick="areaChange(this)" val="8">其他</li>
        </ul>
    </div>
    <div class="container">
        <link href="${staticPath}/css/personalHomepage.css" rel="stylesheet">
        <script src="${staticPath}/js/personalHomepage.js" type="text/javascript"></script>
        <div class="userlayout-tripe">
            <div class="userlayout-left">
                <ul>
                    <li class="userlayout-itemlist" onclick="setClass(this)">
                        <a class="userlayout-itemlist-a" onclick="getTripe('usermessage')">我的消息</a>
                    </li>
                    <li class="userlayout-itemlist" onclick="setClass(this)">
                        <a class="userlayout-itemlist-a" onclick="getTripe('useractivity')" id="useractivity">我的活动</a>
                    </li>
                    <li class="userlayout-itemlist" onclick="setClass(this)">
                        <a class="userlayout-itemlist-a" onclick="getTripe('userorg')" id="userorg">我的组织</a>
                    </li>
                    <li class="userlayout-itemlist" onclick="setClass(this)">
                        <a class="userlayout-itemlist-a userlayout-itemlist-a-active"
                           onclick="getTripe('userinfo')">设置</a>
                        <ul>
                            <li onclick="getTripe('userinfo');setClass2(this);" id="userinfo" class="">个人资料</li>
                            <li onclick="getTripe('usermask');setClass2(this);" id="usermask"
                                class="userlayout-itemlist-activity">修改头像
                            </li>
                        </ul>
                    </li>
                    <li class="userlayout-itemlist" onclick="setClass(this)">
                        <a class="userlayout-itemlist-a" onclick="getTripe('userchangepsd')">账号安全</a>
                        <ul>
                            <li onclick="getTripe('userchangepsd');setClass2(this);" id="userchangepsd" class="">修改密码
                            </li>
                        </ul>
                    </li>
                    <li class="userlayout-itemlist" onclick="setClass(this)">
                        <a class="userlayout-itemlist-a" onclick="getTripe('useraddress')" id="useraddress">我的收货地址</a>
                    </li>
                    <li class="userlayout-itemlist" onclick="setClass(this)">
                        <a class="userlayout-itemlist-a" onclick="getTripe('userrecord')" id="userrecord">积分消费记录</a>
                    </li>
                </ul>
            </div>
            <div class="userlayout-right usermessage">
                <p class="userlayout-right-p">当前位置：我的消息</p>
            </div>
            <div class="userlayout-right useractivity">
                <p class="userlayout-right-p">当前位置：我的活动</p>
                <link href="${staticPath}/css/volunteerActivity.css" rel="stylesheet">
                <script src="${staticPath}/js/activity-action.js" type="text/javascript"></script>
                <div class="useractivity-title-div">
                    <a id="myact-first" onclick="myactivity('joinact', this)" class="useractivity-title-div-a-activity">报名的活动</a>
                    <!--<a>参加的活动</a>-->
                    <a onclick="myactivity('colact', this)">收藏的活动</a>
                    <a onclick="myactivity('time', this)">志愿时间</a>
                </div>
                <div class="useractivity-tripe-div">
                    <div class="pubic-none-box" style="width:882px;"><img src="/views/public/images/none.png"></div>
                </div>
                <div class="tcdPageCode" style="font-size:16px;"><span class="disabled">上一页</span><span class="current">1</span><span
                        class="disabled">下一页</span></div>
                <script id="activity" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
							<div class="useractivity-tripe-item">
								<div class="useractivity-tripe-item-image" style="background-image:url({{>thumb}});">
								</div>
								<h3 onclick="window.location.href='/web/site/activitydetail?id={{>id}}'">{{>title}}</h3>
								<p>活动地点：{{>province_name}}{{>city_name}}</p>
								<p style="width:300px;">发起组织：{{>department_name}}</p>
								<div class="useractivity-tripe-item-btnbox">
									{{if check_status==0}}
									<a class="useractivity-orange">审核中</a><br/>
									<a class="useractivity-green" onclick="quitActivity(this);" val="{{>id}}">取消参加</a>
									{{/if}} {{if check_status==1}}
									<a class="useractivity-othercolor">报名成功</a><br/>
									<a class="useractivity-orange" onclick="quitActivity(this);" val="{{>id}}">退出</a>
									{{/if}} {{if check_status==2}}
									<a class="useractivity-orange">审核不通过</a><br/> {{/if}}
								</div>
							</div>

                </script>
                <script id="colact-activity" type="text/x-jsrender">
							<div class="useractivity-tripe-item">
								<div class="useractivity-tripe-item-image" style="background-image:url({{>thumb}});">
								</div>
								<h3 onclick="window.location.href='/web/site/activitydetail?id={{>id}}'">{{>title}}</h3>
								<p>活动地点：{{>province_name}}{{>city_name}}</p>
								<p style="width:300px;">发起组织：{{>department_name}}</p>
							</div>
							<div class="useractivity-tripe-item-btnbox">
								<a class="useractivity-green" onclick="alert('暂时无法取消收藏')">取消收藏</a>
							</div>

                </script>
                <script id="activity-time" type="text/x-jsrender">
							<div class="useractivity-tripe-item">
								<div class="useractivity-tripe-item-image" style="background-image:url({{>thumb}});">
								</div>
								<h3 onclick="window.location.href='/web/site/activitydetail?id={{>id}}'">{{>activityname}}</h3>
								<p style="width:auto;">于2016年10月27日15:27:12至2016年10月27日15:27:15参与了志愿活动进行服务</p>
								<div class="useractivity-tripe-item-btnbox">
								</div>
							</div>

                </script>
                <script>
                    $(function () {
                        // 初始化查询参数
                        PAGE_INDEX = 1;
                        PAGE_COUNT = 1;
                        PAGE_SIZE = 6;
                        $('#myact-first').click();
                    })

                    function myactivity(str, dom) {
                        $(".useractivity-title-div a").removeClass("useractivity-title-div-a-activity");
                        $(dom).addClass("useractivity-title-div-a-activity");
                        PAGE_INDEX = 1;
                        // 参加的活动
                        if (str == 'joinact') {
                            joinact();
                        }
                        if (str == 'colact') {
                            colact();
                        }
                        if (str == 'time') {
                            timeact();
                        }
                    }

                    function joinact() {
                        var formData = new FormData();
                        formData.append("page", PAGE_INDEX);
                        formData.append("rows", PAGE_SIZE);
                        formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
                        data = ajaxPost('/web/site/public?url=api/recruit/myList.do', formData);
                        var myTmpl = $.templates("#activity");
                        var html = myTmpl.render(data['data']);
                        $(".useractivity-tripe-div").html(html);
                        if (html == "") {
                            $(".useractivity-tripe-div").html('<div class="pubic-none-box" style="width:882px;"><img src="/views/public/images/none.png"></div>');
                        }
                        PAGE_COUNT = data['totoalcount'];
                        // 刷新分页插件
                        $(".tcdPageCode").createPage({
                            pageCount: parseInt(PAGE_COUNT / PAGE_SIZE) + 1,
                            current: PAGE_INDEX,
                            backFn: function (p) {
                                PAGE_INDEX = p;
                                joinact();
                            }
                        });
                    }

                    function colact() {
                        var formData = new FormData();
                        formData.append("page", PAGE_INDEX);
                        formData.append("rows", PAGE_SIZE);
                        formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
                        data = ajaxPost('/web/site/public?url=api/recruit/MyCollectionList.do', formData);
                        var myTmpl = $.templates("#colact-activity");
                        var html = myTmpl.render(data['data']);
                        $(".useractivity-tripe-div").html(html);
                        if (html == "") {
                            $(".useractivity-tripe-div").html('<div class="pubic-none-box" style="width:882px;"><img src="/views/public/images/none.png"></div>');
                        }
                        PAGE_COUNT = data['totoalcount'];
                        // 刷新分页插件
                        $(".tcdPageCode").createPage({
                            pageCount: parseInt(PAGE_COUNT / PAGE_SIZE) + 1,
                            current: PAGE_INDEX,
                            backFn: function (p) {
                                PAGE_INDEX = p;
                                colact();
                            }
                        });
                    }

                    function timeact() {
                        var formData = new FormData();
                        formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
                        formData.append("year", "2016");
                        formData.append("page", PAGE_INDEX);
                        formData.append("rows", PAGE_SIZE);
                        data = ajaxPost('/web/site/public?url=api/activity/hoursList.do', formData);
                        var myTmpl = $.templates("#activity-time");
                        var html = myTmpl.render(data['data']);
                        $(".useractivity-tripe-div").html(html);
                        if (html == "") {
                            $(".useractivity-tripe-div").html('<div class="pubic-none-box" style="width:882px;"><img src="/views/public/images/none.png"></div>');
                        }
                        PAGE_COUNT = data['totoalcount'];
                        // 刷新分页插件
                        $(".tcdPageCode").createPage({
                            pageCount: parseInt(PAGE_COUNT / PAGE_SIZE) + 1,
                            current: PAGE_INDEX,
                            backFn: function (p) {
                                PAGE_INDEX = p;
                                timeact();
                            }
                        });
                    }

                    function quitActivity(dom) {
                        var data = joinActivity(false, $(dom).attr("val"));
                        if (data["status"] != "true") {
                            return alert(data["message"]);
                        }
                        return $(dom).parent().parent().remove();
                    }
                </script>
            </div>

            <div class="userlayout-right userorg">
                <p class="userlayout-right-p">当前位置：我的组织</p>
                <link href="${staticPath}/css/userActivity.css" rel="stylesheet">
                <style>
                    .useractivity-tripe-item-image {
                        width: 100px;
                    }

                    .useractivity-tripe-item h3 {
                        padding-left: 120px;
                    }
                </style>
                <div class="useractivity-tripe-div">
                    <div class="useractivity-tripe-item">
                        <div class="useractivity-tripe-item-image" style="background-image:url();">
                        </div>
                        <h3 onclick="window.location.href='/web/site/orgdetail?id=14770282422962ed1e04f515a4b5294121c320e755486'">
                            社会志愿者</h3>
                        <p>组织地点：四川省</p>
                        <!--<p>发起者：</p>-->
                        <div class="useractivity-tripe-item-btnbox">

                            <a class="useractivity-othercolor">审核通过</a>

                            <br>

                            <a class="useractivity-green" onclick="exitOrg(this)"
                               val="14770282422962ed1e04f515a4b5294121c320e755486">退出组织</a>

                        </div>
                    </div>
                </div>
                <div class="tcdPageCode" style="font-size:16px;"><span class="disabled">上一页</span><span class="current">1</span><span
                        class="disabled">下一页</span></div>
                <script id="org" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
							<div class="useractivity-tripe-item">
								<div class="useractivity-tripe-item-image" style="background-image:url({{>headimageurl}});">
								</div>
								<h3 onclick="window.location.href='/web/site/orgdetail?id={{>departmentid}}'">{{>full_name}}</h3>
								<p>组织地点：{{>province_name}}</p>
								<!--<p>发起者：{{>username}}</p>-->
								<div class="useractivity-tripe-item-btnbox">
									{{if check_status==0}}
									<a class="useractivity-orange">待审核</a>
									{{/if}} {{if check_status==2}}
									<a class="useractivity-orange">审核不通过</a>
									{{/if}} {{if check_status==1}}
									<a class="useractivity-othercolor">审核通过</a>
									{{/if}}
									<br/> {{if check_status==1}}
									<a class="useractivity-green" onclick="exitOrg(this)" val="{{>departmentid}}">退出组织</a>
									{{/if}} {{if check_status==0}}
									<a class="useractivity-green" onclick="joinOrg(this)" val="{{>departmentid}}">取消申请</a>
									{{/if}}
								</div>
							</div>

                </script>
                <script>
                    $(function () {
                        // 初始化查询参数
                        PAGE_INDEX = 1;
                        PAGE_COUNT = 1;
                        PAGE_SIZE = 6;
                        myorg();
                    })

                    function myorg() {
                        var formData = new FormData();
                        formData.append("page", PAGE_INDEX);
                        formData.append("rows", PAGE_SIZE);
                        formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
                        var data = ajaxPost('/web/site/public?url=api/department/myDepartment.do', formData);
                        var myTmpl = $.templates("#org");
                        var html = myTmpl.render(data['data']);
                        $(".useractivity-tripe-div").html(html);

                        PAGE_COUNT = data['totoalcount'];
                        // 刷新分页插件
                        $(".tcdPageCode").createPage({
                            pageCount: parseInt(PAGE_COUNT / PAGE_SIZE) + 1,
                            current: PAGE_INDEX,
                            backFn: function (p) {
                                PAGE_INDEX = p;
                                myorg();
                            }
                        });
                    }

                    /*
                     * 加入组织请求
                     */
                    function joinOrg(dom) {
                        if ($("#user").attr("val") == "0") {
                            alert("未登录，无法进行相关操作");
                            return;
                        }
                        var formData = new FormData();
                        // 活动id
                        formData.append("id", $(dom).attr("val"));
                        // csrf
                        formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
                        data = ajaxPost('/web/site/public?url=api/department/cancelSignup.do', formData);
                        if (data["status"] == "true") {
                            $(dom).parent().parent().remove();
                            return;
                        }
                        alert(data["message"]);
                    }

                    /*
                     * 退出组织请求
                     */
                    function exitOrg(dom) {
                        if ($("#user").attr("val") == "0") {
                            alert("未登录，无法进行相关操作");
                            return;
                        }
                        var formData = new FormData();
                        // 组织id
                        formData.append("id", $(dom).attr("val"));
                        // csrf
                        formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
                        var data = ajaxPost('/web/site/public?url=api/department/Signout.do', formData);
                        if (data["status"] == "true") {
                            $(dom).parent().parent().remove();
                            return;
                        }
                        alert(data["message"]);
                    }
                </script>
            </div>

            <div class="userlayout-right usermask">
                <p class="userlayout-right-p">当前位置：更换头像</p>
                <script src="/views/public/js/plupload/plupload.full.min.js" type="text/javascript"></script>
                <script src="/views/public/js/qiniu/qiniu.min.js" type="text/javascript"></script>
                <script>
                    $(function () {
                        qiniu = Qiniu.uploader(setOption("imgbtn_fa", "imgbtn", imgsuccess, "fwu7SqmNhFQ5wZkay9h6TEWxmd7PfRgAltelWxgi:zlDIDU0tFVU63TZPDJkQcicl7NQ=:eyJkZWxldGVBZnRlckRheXMiOjEsInNjb3BlIjoiaW1hZ2UiLCJkZWFkbGluZSI6MTUzMjg4MDAwNX0="));
                    })

                    function imgsuccess() {
                        var formData = new FormData($("#usermask-form")[0]);
                        var data = ajaxPost('/web/user/usermask', formData);
                        if (data['status']) {
                            alert('头像修改成功');
                            return;
                        }
                        alert(data['message']);
                    }
                </script>
                <style>
                    .imgbtn_uploading {
                        z-index: 999;
                        position: absolute;
                        top: 0px;
                        font-size: 20px;
                        text-align: center;
                    }

                    .imgbtn_start {
                        font-size: 20px;
                    }
                </style>
                <form id="usermask-form" method="post" action="javascript:imgsuccess();">
                    <input type="hidden" name="_csrf" value="QUxyRXZmcE03GxggLz5dCDB6OisPDEAGIC9KNFsrBwswAhwJNSJJAA==">
                    <div id="imgbtn_fa"
                         style="position:relative;margin:10px;width:100px;height:100px;background-color:#999;cursor:pointer;">
                        <!--<div id="imgbtn_uploading" class="imgbtn_uploading">上传状态</div>-->
                        <img id="imgbtn" style="width: 100px; height: 100px; position: relative; z-index: 1;"
                             src="${staticPath}/images/org_01.jpg">
                        <div id="html5_1cjj8relbknelr413hbvvo139f3_container" class="moxie-shim moxie-shim-html5"
                             style="position: absolute; top: 0px; left: 0px; width: 100px; height: 100px; overflow: hidden; z-index: 0;">
                            <input id="html5_1cjj8relbknelr413hbvvo139f3" type="file"
                                   style="font-size: 999px; opacity: 0; position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;"
                                   multiple="" accept="image/jpeg,.jpg,.jpeg,image/gif,.gif,image/png,.png"></div>
                    </div>
                    <input id="imgbtn_input" type="hidden" name="image">
                    <div id="imgbtn_start" class="imgbtn_start">保存修改</div>
                </form>
            </div>
            <div class="userlayout-right userinfo">
                <p class="userlayout-right-p">当前位置：个人资料</p>
                <style>
                    .userinfo-title {
                        margin: 20px 10px 10px 0px;
                        padding-left: 10px;
                        font-weight: 400;
                        font-size: 14px;
                        border-left: 4px solid #5ec16b;
                    }

                    .hr {
                        width: 100%;
                        border-top: 1px solid #efefef;
                    }

                    .userinfo-label {
                        display: inline-block;
                        margin: 10px 0px;
                        padding: 5px;
                        width: 108px;
                        height: 32px;
                        font-size: 14px;
                        color: #999;
                        line-height: 32px;
                    }

                    .userinfo-label span {
                        color: red;
                    }

                    .userinfo-p {
                        display: inline;
                        font-size: 14px;
                    }

                    .search-order-ullist {
                        position: relative;
                        top: -20px;
                    }

                    .label-list {
                        display: inline-block;
                        padding-right: 5px;
                        min-width: 50px;
                        height: 32px;
                        font-size: 14px;
                        color: #999;
                        line-height: 32px;
                    }

                    .tripe-span {
                        font-size: 14px;
                        color: #f8b62d;
                        line-height: 32px;
                    }
                </style>
                <script src="${staticPath}/js/downlist.js" type="text/javascript"></script>
                <script src="${staticPath}/js/registerperson.js" type="text/javascript"></script>
                <h3 class="userinfo-title">认证状态</h3>
                <div class="hr"></div>
                <label class="userinfo-label">状态：</label>
                <p class="userinfo-p">认证成功</p>
                <br>
                <h3 class="userinfo-title">个人资料</h3>
                <div class="hr"></div>
                <form id="tripe2-form" method="post" action="javascript:void(0)">
                    <input type="hidden" name="_csrf" value="UjdCSGh5NXgkYCgtMSEYPSMBCiYREwUzM1R6OUU0Qj4jeSwEKz0MNQ==">
                    <label class="userinfo-label">真实姓名：</label>
                    <p class="userinfo-p">余星辰</p><br>
                    <label class="userinfo-label">政治面貌：</label>
                    <ul class="search-order-ullist">
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)"
                               style="width:200px;">中国共产主义青年团团员<i></i></a>
                            <ul class="search-order-itemlist" style="width:210px;">

                                <li onclick="downListItemClick(this)"
                                    val="1474514143437ef5f843c09854521b5f6a46fb7b03eb9">中国共产党党员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147451418613713dae00207d5457486454a56d41ea5c1">中国共产党预备党员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474514213154bd180b6599134159b87e9aef9b3a7fbe">中国共产主义青年团团员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474514274022748d1d47dfd142bba0b8e91d6848beb2">中国国民党革命委员会会员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474515189235b158581c8c48412ab6fc5249e6d47170">中国民主同盟盟员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474515710999f705e4003fd94b6fac2391b1b35fb705">中国民主建国会会员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147451573720973ac889f756b4a819da155cedb594fab">中国民主促进会会员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474515761331641823ed6a03428787c9f209ff8d84f4">中国农工民主党党员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14745157853416685a57a6b114afd87f985487f1af3bb">中国致公党党员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474515805189c79a8536605c41c283e052dfa7ae2e6d">九三学社社员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474515826083f86cb57141264f85b4c05c8ecd09b9fa">台湾民主自治同盟盟员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474515853254d505c08d4ace48d28b01e567bfaa05de">无党派民主人士
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1474515864045b72536e3bd8447c885977a2a565c6640">群众
                                </li>
                                <input id="political" name="political" type="hidden"
                                       value="1474514213154bd180b6599134159b87e9aef9b3a7fbe">
                            </ul>
                        </li>
                    </ul>
                    <br>
                    <label class="userinfo-label">性别：</label>
                    <label class="userinfo-label"><input name="sex" checked="" type="radio" value="1"> 男</label>
                    <label class="userinfo-label"><input name="sex" type="radio" value="2"> 女</label><br>
                    <label class="userinfo-label">民族：</label>
                    <ul class="search-order-ullist">
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" style="width:200px;">汉族<i></i></a>
                            <ul class="search-order-itemlist" style="width:210px;">

                                <li onclick="downListItemClick(this)"
                                    val="1476426226217eadce46a182b418fa036b33b173beec0">汉族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1476526659579272d0161a05b4217941e96a666cc5227">蒙古族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14765266932462124fdab070348358ad4e3cd184246a3">回族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1476526710617eca284ae33574c8485d7edf921902614">藏族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032460948c556937b6aa44dcd9996701051147a3b">维吾尔族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770324732210fbdc029fe9e415699886338704daddc">苗族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770324868017f223e89f84a48029173a6b64f7fca7e">彝族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770325000715b73fdaac26d42e28bc648a5589377a5">壮族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032514644e9af5c2a204c4dbd88890e1e97304bd1">布依族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032528731a9b0ba42e9de418e9b1bcdb0b1874cd8">朝鲜族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703254916837879a4c01834c208d57e7750119ecff">满族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770325604088b7862b0c4504d14a7809f0680965b47">侗族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770325707539c3fccf2172749858ec14f4cca0946cc">瑶族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703258216959a98621f2bd4b88ba22ba90dc5eb4bf">白族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032593408b11cf5aac7d94e25ae30fd89deac5ff9">土家族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032607726730b15eb27e84cad80b8e36efd15482c">哈尼族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770326467310276c876d0f1431b92d4be4c366e2101">哈萨克族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770326610512d44116268de4c7fbfe43ae945fbc2d3">傣族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032677022d57cb85cb67747e0aa16960bc2a58259">黎族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032693084842b14c20be24565b04b5ed225c3c47a">傈僳族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770327083457d31c672b5464d12a9e61dadaa1f360d">佤族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770327219990c52a4a677c348f492eaf3a88ebbe2ac">畲族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032733476b76dfa1642734f01abcfe1dbf7f42e4b">高山族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032743492af8c39f4af11496ba1be3e91cd61ff29">拉祜族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770327526994544c576488d469b84c5b62b77e7e9a3">水族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032790017b54d95ecb0af4f7fb3f7c3fd6d1cd5e7">东乡族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032802692c39eafef80ac430c8a152f8855e43962">纳西族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770328163553cb162514a2f4eeca30c6b659a68c92f">景颇族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032827288f5549e8b836746f5a20e50ab2540eb95">柯尔克孜族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770328431420c93c4f292584c50aaef44400c1ff1f5">土族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032854783de9a009356b94ae5b7e91493ca99076a">达斡尔族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770328768680c82ad166da14747ba53e42821eb0f54">仫佬族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032888073543230f67de44e45b02e57f0873a3873">羌族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032920197a1428f489431496dada8a9694056fe83">布朗族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477032930564b3319d53aa684df893cd1a8ab8e9add2">撒拉族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770329416491bed6cb2d534433b9e700ac31314c4e4">毛南族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703295601535fb57571b8d4c1096864a74335b02e7">仡佬族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770329699463ca5aef84d7d4a2abeb3b2faaa2115ce">锡伯族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770329902974ed2fb4a074d417d86034ab4e14ebcc0">阿昌族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033002737a4bf70a849514345a98c3fa2f97820d4">普米族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770330158976e6ee686b1a54e17ac41c2cec375d18b">塔吉克族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033027230b16dee830e3c4575bb5e9793c08f3554">怒族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033040767a33976115ed342c69e7727a2c9988fc6">乌孜别克族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033057302743095ddf00f435ea3de1df0679e8b5a">俄罗斯族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033069513512bab0f3aed4da3b2ba225a6299952e">鄂温克族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033081650feb4a2001a3549019b3db2d2de593668">德昂族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703309317881a0b89825cc4614b033de80fe52e416">保安族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033105540db96c34ab05245e488c0dabe7be876fa">裕固族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033118141e0c6f62aaebc44b7881666510c25449a">京族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703313635891395944deb743ef9bb0cf68e20f66d8">塔塔尔族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770331539173a11f6342fed486089dd7cc09db6a25a">独龙族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14770331689368ad440b5131545f2afe1eb51ecb649da">鄂伦春族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703318066567eb55bed38c4a6681757f82a19d4f83">赫哲族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703319139087f3f2852e5a4d418433cb63930e40ab">门巴族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703320365986e832b30d9d483c8e55c0a1fe375926">珞巴族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033216157ce7220964000453980857e94fad6f1a4">基诺族
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147703322847702f8b9e9773a4ec68c8c60177e2684fa">其他
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477033243082d7df8d8ff60b46cf9891db9727cf80ff">外国血统
                                </li>
                                <input id="nation" name="nationid" type="hidden"
                                       value="1476426226217eadce46a182b418fa036b33b173beec0">
                            </ul>
                        </li>
                    </ul>
                    <br>
                    <label class="userinfo-label"><span>*</span> 籍贯：</label>
                    <ul class="search-order-ullist">
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" id="register_origin_show_1"
                               style="width:150px;">四川省<i></i></a>
                            <ul class="search-order-itemlist" style="width:160px;">

                                <li onclick="downListItemClick(this)" val="1476084112356dd9738eba11e682992c56dcba85b9">
                                    北京市
                                </li>

                                <li onclick="downListItemClick(this)" val="1476084112357199d98eba11e682992c56dcba85b9">
                                    天津市
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719b488eba11e682992c56dcba85b9">
                                    河北省
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719d698eba11e682992c56dcba85b9">
                                    山西省
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719e5a8eba11e682992c56dcba85b9">
                                    内蒙古自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719f378eba11e682992c56dcba85b9">
                                    辽宁省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a0108eba11e682992c56dcba85b9">
                                    吉林省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a0f18eba11e682992c56dcba85b9">
                                    黑龙江省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a1ce8eba11e682992c56dcba85b9">
                                    上海市
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a2a78eba11e682992c56dcba85b9">
                                    江苏省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a3848eba11e682992c56dcba85b9">
                                    浙江省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a4618eba11e682992c56dcba85b9">
                                    安徽省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a53a8eba11e682992c56dcba85b9">
                                    福建省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a6138eba11e682992c56dcba85b9">
                                    江西省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a6f18eba11e682992c56dcba85b9">
                                    山东省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a7ce8eba11e682992c56dcba85b9">
                                    河南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a8ab8eba11e682992c56dcba85b9">
                                    湖北省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a9848eba11e682992c56dcba85b9">
                                    湖南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571aaf78eba11e682992c56dcba85b9">
                                    广东省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571ac728eba11e682992c56dcba85b9">
                                    广西壮族自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571ad678eba11e682992c56dcba85b9">
                                    海南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571adf58eba11e682992c56dcba85b9">
                                    重庆市
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571ae778eba11e682992c56dcba85b9">
                                    四川省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b0888eba11e682992c56dcba85b9">
                                    贵州省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b1128eba11e682992c56dcba85b9">
                                    云南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b1948eba11e682992c56dcba85b9">
                                    西藏自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b3928eba11e682992c56dcba85b9">
                                    陕西省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b41c8eba11e682992c56dcba85b9">
                                    甘肃省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b4ba8eba11e682992c56dcba85b9">
                                    青海省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b6bb8eba11e682992c56dcba85b9">
                                    宁夏回族自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b7418eba11e682992c56dcba85b9">
                                    新疆维吾尔自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b9468eba11e682992c56dcba85b9">
                                    台湾省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b9cc8eba11e682992c56dcba85b9">
                                    香港特别行政区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571bbce8eba11e682992c56dcba85b9">
                                    澳门特别行政区
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147755953095894f0d512954e45e9b36032382474450a">新疆生产建设兵团
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14787596135921f30134d42254b3cab258f015139d530">其他
                                </li>
                                <input name="originprovince" type="hidden" id="register_origin_1"
                                       onchange="downlistOfProvince(1,3,'register_origin_',this)"
                                       value="14760841123571ae778eba11e682992c56dcba85b9">
                            </ul>
                        </li>
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" id="register_origin_show_2"
                               style="width:150px;">达州市<i></i></a>
                            <ul class="search-order-itemlist" style="width:160px;">
                                <input name="origincity" type="hidden" id="register_origin_2"
                                       onchange="downlistOfProvince(2,3,'register_origin_',this)"
                                       value="1476084112357450aa8eba11e682992c56dcba85b9">
                            </ul>
                        </li>
                    </ul>
                    <br>
                    <label class="userinfo-label">身份证号码：</label>
                    <p class="userinfo-p">5130211996******5X</p><br>
                    <label class="userinfo-label">注册区域：</label>
                    <p class="userinfo-p">四川省 达州市 达川区</p><br>
                    <label class="userinfo-label"><span>*</span> 现住地址：</label>
                    <ul class="search-order-ullist">
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" id="register_crd_show_1"
                               style="width:150px;">四川省<i></i></a>
                            <ul class="search-order-itemlist" style="width:160px;">

                                <li onclick="downListItemClick(this)" val="1476084112356dd9738eba11e682992c56dcba85b9">
                                    北京市
                                </li>

                                <li onclick="downListItemClick(this)" val="1476084112357199d98eba11e682992c56dcba85b9">
                                    天津市
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719b488eba11e682992c56dcba85b9">
                                    河北省
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719d698eba11e682992c56dcba85b9">
                                    山西省
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719e5a8eba11e682992c56dcba85b9">
                                    内蒙古自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="147608411235719f378eba11e682992c56dcba85b9">
                                    辽宁省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a0108eba11e682992c56dcba85b9">
                                    吉林省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a0f18eba11e682992c56dcba85b9">
                                    黑龙江省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a1ce8eba11e682992c56dcba85b9">
                                    上海市
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a2a78eba11e682992c56dcba85b9">
                                    江苏省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a3848eba11e682992c56dcba85b9">
                                    浙江省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a4618eba11e682992c56dcba85b9">
                                    安徽省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a53a8eba11e682992c56dcba85b9">
                                    福建省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a6138eba11e682992c56dcba85b9">
                                    江西省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a6f18eba11e682992c56dcba85b9">
                                    山东省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a7ce8eba11e682992c56dcba85b9">
                                    河南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a8ab8eba11e682992c56dcba85b9">
                                    湖北省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571a9848eba11e682992c56dcba85b9">
                                    湖南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571aaf78eba11e682992c56dcba85b9">
                                    广东省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571ac728eba11e682992c56dcba85b9">
                                    广西壮族自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571ad678eba11e682992c56dcba85b9">
                                    海南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571adf58eba11e682992c56dcba85b9">
                                    重庆市
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571ae778eba11e682992c56dcba85b9">
                                    四川省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b0888eba11e682992c56dcba85b9">
                                    贵州省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b1128eba11e682992c56dcba85b9">
                                    云南省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b1948eba11e682992c56dcba85b9">
                                    西藏自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b3928eba11e682992c56dcba85b9">
                                    陕西省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b41c8eba11e682992c56dcba85b9">
                                    甘肃省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b4ba8eba11e682992c56dcba85b9">
                                    青海省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b6bb8eba11e682992c56dcba85b9">
                                    宁夏回族自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b7418eba11e682992c56dcba85b9">
                                    新疆维吾尔自治区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b9468eba11e682992c56dcba85b9">
                                    台湾省
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571b9cc8eba11e682992c56dcba85b9">
                                    香港特别行政区
                                </li>

                                <li onclick="downListItemClick(this)" val="14760841123571bbce8eba11e682992c56dcba85b9">
                                    澳门特别行政区
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147755953095894f0d512954e45e9b36032382474450a">新疆生产建设兵团
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14787596135921f30134d42254b3cab258f015139d530">其他
                                </li>
                                <input name="province" type="hidden" id="register_crd_1"
                                       onchange="downlistOfProvince(1,3,'register_crd_',this)"
                                       value="14760841123571ae778eba11e682992c56dcba85b9">
                            </ul>
                        </li>
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" id="register_crd_show_2"
                               style="width:150px;">达州市<i></i></a>
                            <ul class="search-order-itemlist" style="width:160px;">
                                <input name="city" type="hidden" id="register_crd_2"
                                       onchange="downlistOfProvince(2,3,'register_crd_',this)"
                                       value="1476084112357450aa8eba11e682992c56dcba85b9">
                            </ul>
                        </li>
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" id="register_crd_show_3"
                               style="width:150px;">达川区<i></i></a>
                            <ul class="search-order-itemlist" style="width:160px;">
                                <input name="county" type="hidden" id="register_crd_3"
                                       value="1476084112359144e28eba11e682992c56dcba85b9">
                            </ul>
                        </li>
                    </ul>
                    <br>
                    <input class="userinfo-input" type="text" placeholder="详细地址" id="detailedaddress"
                           name="detailedaddress" value="四川省达州市达川区" style="margin-left:118px"><br>
                    <label class="userinfo-label">是否在读：</label><label class="userinfo-label"><input name="isinschool"
                                                                                                    checked=""
                                                                                                    type="radio"
                                                                                                    value="1"> 是</label><label
                        class="userinfo-label"><input name="isinschool" type="radio" value="0"> 否</label><br>
                    <label class="userinfo-label">学校/工作单位：</label><input name="unit" class="userinfo-input" type="text"
                                                                         placeholder="请填写学校/工作单位" value="成都东软学院"><br>
                    <label class="userinfo-label">学号：</label><input name="studentid" class="userinfo-input" type="text"
                                                                    placeholder="请填写学号" value="15310320101"><br>
                    <label class="userinfo-label">注册日期：</label>
                    <p class="userinfo-p">2018年07月03日</p><br>
                    <label class="userinfo-label">志愿者编码：</label>
                    <p class="userinfo-p">513021001052831559</p><br>
                    <label class="userinfo-label">手机号码：</label>
                    <p class="userinfo-p">15182839862</p><br>
                    <label class="userinfo-label">志愿者等级</label>
                    <p class="userinfo-p">
                    </p><br>
                    <label class="userinfo-label"><span>*</span> 联系邮箱：</label><input name="email" class="userinfo-input"
                                                                                     type="text" placeholder="请填写常用邮箱"
                                                                                     value="1274626368qq.com"><br>
                    <label class="userinfo-label">QQ号码：</label><input name="qq" class="userinfo-input" type="text"
                                                                      placeholder="请填写QQ号码" value="1274626368"><br>

                    <h3 class="userinfo-title">背景经历</h3>
                    <div class="hr"></div>
                    <label class="userinfo-label">从业情况：</label>
                    <ul class="search-order-ullist">
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" style="width:288px;"
                               id="job_name">学生<i></i></a>
                            <ul class="search-order-itemlist" style="width:298px;" id="job_list">

                                <li onclick="downListItemClick(this)"
                                    val="14785032169234c6319e1dc4745828ed8faac767dba60">国家公务员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1478503226741dbbffddc7ac0435482b5337dfa22bbc2">专业技术人员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147850324000636a90c32e16c4d3b9e3e1c9fcc5d7ac8">企业管理人员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147850325053595f03a51b4b0422183204b96a0a6d5c7">工人
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="14785032608669fc483f665884f398a4ea2d8629c6e3b">农民
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1478503270648b0325de3659b45c1bf5c503dfb2977c1">学生
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147850328251568f4405c812d42b98ee4c302720d55f0">教师
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1478503292670ce6cf03194be4a4ca5a0a5d85b191c75">现役军人
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1478503303769bba58c4a1e3943549e8bc604ffffa4d1">自由职业者
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147850331494649344b35976149d79e903e50a91cc8d8">个体经营者
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1478503325617dff22647ea614a03a38bdff704268732">无业人员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1478503336245d02e759efa0444ebb62b57af22876e47">退（离）休人员
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147850335159386bd07d4dca74c91b136a110a66cc43e">其他
                                </li>
                                <input id="job" name="job" type="hidden"
                                       value="1478503270648b0325de3659b45c1bf5c503dfb2977c1">
                            </ul>
                        </li>
                    </ul>
                    <br>
                    <label class="userinfo-label"> 最高学历：</label>
                    <ul class="search-order-ullist">
                        <li class="search-order-lilist">
                            <a class="search-order-a" onclick="downList(this)" style="width:288px;" id="education_name">本科<i></i></a>
                            <ul class="search-order-itemlist" style="width:298px;" id="education_list">

                                <li onclick="downListItemClick(this)"
                                    val="1476670606268eaf29ebc946a431ba73e81296ebce0de">博士
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147667062643928b947d9cabb427aa4da9b601cf4a23b">硕士
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477046648156d716d247724c4fe4b7d23bd0a76271ec">本科
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477046662982ccc75ed9b9c8475d94dde6515a5be67e">大专
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147704669318860d05e01cc164a63a7476057797fab90">中专
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477046705933bd2e5734ef0c45f785bcbfe9c210109c">职业高中
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477046751019676feb99a5e74167af5378512ae022cc">普通高中
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="147704679943638364df3d5e64bbfbbb025c1740da29f">初中
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477046810415d75050896d694e039516080246fffdaf">小学
                                </li>

                                <li onclick="downListItemClick(this)"
                                    val="1477046822617340888b929634c3faa96f8db6ee4584b">其他
                                </li>
                                <input id="education" name="education" type="hidden"
                                       value="1477046648156d716d247724c4fe4b7d23bd0a76271ec">
                            </ul>
                        </li>
                    </ul>
                    <br>
                    <label class="userinfo-label"> 擅长技能：</label><span class="tripe-span">请选择并填写1-2项你擅长的专业或技能</span><br>
                    <input id="skills" name="skills" type="hidden" value="">
                    <div id="skillsbox" style="margin-left:118px;">
                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_14766706547410df0975557ea4f038fa42d10d4988df5"
                                                         value="14766706547410df0975557ea4f038fa42d10d4988df5">
                            美术设计</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1476670676787c619e6b6ee754067a16a0a093f01edab"
                                                         value="1476670676787c619e6b6ee754067a16a0a093f01edab">
                            摄影摄像</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_14767864532882c2042235b624c0989388aee70ea3cb2"
                                                         value="14767864532882c2042235b624c0989388aee70ea3cb2">
                            传播策划</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_147678647843799848e9468e9418d8e7c7eea36134368"
                                                         value="147678647843799848e9468e9418d8e7c7eea36134368">
                            文化艺术</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1476786490235de2a65b01be5482880b4b113e96f3fed"
                                                         value="1476786490235de2a65b01be5482880b4b113e96f3fed">
                            IT技术</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_14767865027252315029599fb44f88f4d5229d10abd7a"
                                                         value="14767865027252315029599fb44f88f4d5229d10abd7a">
                            应急救援</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_147678651475413aad1022d7c4df2aa57e98aae38efb8"
                                                         value="147678651475413aad1022d7c4df2aa57e98aae38efb8">
                            教育培训</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_14767865276711b8f1f04773948af9acb7d42afe25452"
                                                         value="14767865276711b8f1f04773948af9acb7d42afe25452">
                            医疗护理</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1476786537951c27991f104ae4528956498d9a7c90e65"
                                                         value="1476786537951c27991f104ae4528956498d9a7c90e65">
                            翻译</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1476786548461ef09f96b55ba434991155634c40cd851"
                                                         value="1476786548461ef09f96b55ba434991155634c40cd851">
                            交通运输</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1476786557975f9cdf0e177a54596b5f77ef516cc355f"
                                                         value="1476786557975f9cdf0e177a54596b5f77ef516cc355f">
                            环境科学</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1476786572933f3d663a1613941bda78506a615bbcdb6"
                                                         value="1476786572933f3d663a1613941bda78506a615bbcdb6">
                            体育</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1476786583434c4a300140c9949ddb57bcf5b6654b170"
                                                         value="1476786583434c4a300140c9949ddb57bcf5b6654b170">
                            会计审计</label>

                        <label class="label-list"><input name="skills_list" type="checkbox"
                                                         id="skills_list_1477632429264ff8a75eaf7bc4c8292c86814d1226cc2"
                                                         value="1477632429264ff8a75eaf7bc4c8292c86814d1226cc2">
                            其他</label>
                    </div>
                    <br>
                    <h3 class="userinfo-title">服务意向</h3>
                    <div class="hr"></div>
                    <label class="userinfo-label"> 服务领域：</label><span class="tripe-span">请选择1-3项你的志愿服务领域</span><br>
                    <input id="servicearea" name="servicearea" type="hidden"
                           value="1477632553804f19c8a6edeee4135bcd9b4ae48b0e11d">
                    <div id="serviceareabox" style="margin-left:118px;" class="">
                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_1477632541337148678875ef64452befb67145346e078"
                                                         value="1477632541337148678875ef64452befb67145346e078">
                            扶贫济困</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_1477632553804f19c8a6edeee4135bcd9b4ae48b0e11d"
                                                         value="1477632553804f19c8a6edeee4135bcd9b4ae48b0e11d">
                            助老助残</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_1477632566646cb11d7e8ba5c48578f8aed989108ae12"
                                                         value="1477632566646cb11d7e8ba5c48578f8aed989108ae12">
                            社区服务</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_1477632579510af0d62696ec64f929ac1aa4c3a40a2a8"
                                                         value="1477632579510af0d62696ec64f929ac1aa4c3a40a2a8">
                            生态建设</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_14776325904217d6d92b38329461b9165122f20e0c587"
                                                         value="14776325904217d6d92b38329461b9165122f20e0c587">
                            大型活动</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_1477632601766f54779afc09347a8a16b559c6ebf4118"
                                                         value="1477632601766f54779afc09347a8a16b559c6ebf4118">
                            抢险救灾</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_1477632638644f60dd8fe7fe945d3bf704752f7929684"
                                                         value="1477632638644f60dd8fe7fe945d3bf704752f7929684">
                            社会管理</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_14776326560840e8adb49be3a4582b45e2553989b9c48"
                                                         value="14776326560840e8adb49be3a4582b45e2553989b9c48">
                            文化建设</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_1477632669210e8d1835f5f974b1f93245196c2ef1431"
                                                         value="1477632669210e8d1835f5f974b1f93245196c2ef1431">
                            西部开发</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_14776326840895b849e54fb13455a81318f578864528e"
                                                         value="14776326840895b849e54fb13455a81318f578864528e">
                            海外服务</label>

                        <label class="label-list"><input name="servicearea_list" type="checkbox"
                                                         id="servicearea_list_14776326969672a81a38267254efe8ab5880c32eb35bb"
                                                         value="14776326969672a81a38267254efe8ab5880c32eb35bb">
                            综合/其他</label>
                    </div>
                    <br><br>

                    <div class="register-btn" style="float:left;margin-top:20px;width:150px;" onclick="updataAll()">
                        保存修改
                    </div>
                </form>
                <script id="other-listrender" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
							<li onclick="downListItemClick(this)" val="{{:_id}}">{{:name}}</li>

                </script>
                <script id="city-listrender" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
							<li onclick="downListItemClick(this)" val="{{:id}}">{{:name}}</li>

                </script>
                <script id="skills-render" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
							<label class="label-list"><input name="skills_list" type="checkbox" id="skills_list_{{>_id}}" value="{{>_id}}"> {{>name}}</label>

                </script>
                <script id="servicearea-render" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
							<label class="label-list"><input name="servicearea_list" type="checkbox" id="servicearea_list_{{>_id}}" value="{{>_id}}"> {{>name}}</label>

                </script>
                <script>
                    $(function () {
                        startSetp2();
                    })

                    // 初始化一级下拉菜单
                    function starNation(str, data) {
                        var myTmpl = $.templates("#listrender");
                        var html = myTmpl.render(data);
                        $("#" + str).prevAll().remove();
                        $("#" + str).before(html);
                    }

                    // 提交详情
                    function updataAll() {
                        if (!checkForm()) {
                            return;
                        }
                        var formData = new FormData($("#tripe2-form")[0]);
                        var data = ajaxPost('/web/user/userinfo', formData);
                        if (data['status'] == "true" || data['status'] === true) {
                            return alert("修改成功");
                        }
                        return alert(data['message']);
                    }

                    // 表单验证
                    function checkForm() {
                        var rs = filter($("input[name=email]").val(), '联系邮箱');
                        if (!rs['status']) {
                            alert(rs['message']);
                            return false;
                        }
                        return true;
                    }

                    //初始化数据
                    setTimeout('pageload()', 1000);

                    function pageload() {
                        //从业情况
                        getDownList('job');
                        //最高学历
                        getDownList('education');
                        //擅长技能
                        var skills = $('#skills').val();
                        if (skills != '') {
                            var skills_arr = skills.split(",");
                            for (var i = 0; i < skills_arr.length; i++) {
                                $('#skills_list_' + skills_arr[i]).attr("checked", "true");
                            }
                        }
                        //服务领域
                        var servicearea = $('#servicearea').val();
                        if (servicearea != '') {
                            var servicearea_arr = servicearea.split(",");
                            for (var i = 0; i < servicearea_arr.length; i++) {
                                $('#servicearea_list_' + servicearea_arr[i]).attr("checked", "true");
                            }
                        }
                        //空闲时间
                        var freetime = $('#freetime').val();
                        var freetime = freetime.split(",");
                        for (var i = 0; i < freetime.length; i++) {
                            var arr = freetime[i].split("_");
                            //早上
                            if (arr[1] == 1) {
                                $('#morning_' + arr[0]).attr("check", "true");
                                $('#morning_' + arr[0]).attr("class", "my-morning-active");
                            }
                            //下午
                            if (arr[2] == 1) {
                                $('#afternonn_' + arr[0]).attr("check", "true");
                                $('#afternonn_' + arr[0]).attr("class", "my-morning-active");
                            }
                            //晚上
                            if (arr[3] == 1) {
                                $('#night_' + arr[0]).attr("check", "true");
                                $('#night_' + arr[0]).attr("class", "my-morning-active");
                            }

                        }

                    }

                    //获取下拉菜单的值
                    function getDownList(id) {
                        //从业情况
                        var value = $('#' + id).val();
                        if (value != '') {
                            $('#' + id + '_list li').each(function () {
                                if (value == $(this).attr("val")) {
                                    $('#' + id + '_name').html($(this).text() + '<i></i>');
                                    return false;
                                }
                            });
                        }

                    }

                    //擅长技能
                    $('#skillsbox').click(function () {
                        var chk_value = [];
                        $('input[name="skills_list"]:checked').each(function () {
                            chk_value.push($(this).val());
                        });
                        if (chk_value.length > 2) {
                            alert('擅长技能最多只能选择2项');
                            return false;
                        }
                        //赋值
                        $('#skills').val(chk_value.join(','));
                    })

                    //服务领域
                    $('#serviceareabox').click(function () {
                        var chk_value = [];
                        $('input[name="servicearea_list"]:checked').each(function () {
                            chk_value.push($(this).val());
                        });
                        if (chk_value.length > 3) {
                            alert('服务领域最多只能选择3项');
                            return false;
                        }
                        //赋值
                        $('#servicearea').val(chk_value.join(','));
                    })

                    //空闲时间
                    $('.mytime').click(function () {
                        var week = morning = afternonn = night = new Array();
                        //上午
                        var morning = new Array();
                        $('.my-morning div').each(function (i) {
                            if ($(this).attr('check') == 'true') { //空闲
                                morning[i + 1] = '1';
                            } else {
                                morning[i + 1] = '0';
                            }
                        });
                        //下午
                        var afternonn = new Array();
                        $('.my-afternonn div').each(function (i) {
                            if ($(this).attr('check') == 'true') { //空闲
                                afternonn[i + 1] = '1';
                            } else {
                                afternonn[i + 1] = '0';
                            }
                        });
                        //晚上
                        var night = new Array();
                        $('.my-night div').each(function (i) {
                            if ($(this).attr('check') == 'true') { //空闲
                                night[i + 1] = '1';
                            } else {
                                night[i + 1] = '0';
                            }
                        });

                        //7天循环
                        var week = new Array();
                        for (var i = 1; i <= 7; i++) {
                            var day = i + '_' + morning[i] + '_' + afternonn[i] + '_' + night[i];
                            week.push(day);
                        }
                        //赋值
                        $('#freetime').val(week);

                    })
                </script>
            </div>
            <div class="userlayout-right userchangepsd">
                <p class="userlayout-right-p">当前位置：修改密码</p>
                <style>
                    .search-order-ullist {
                        position: relative;
                        top: -20px;
                    }
                </style>
                <script>
                    /*
                     * 修改密码
                     */
                    function changePsd() {
                        if ($("#user").attr("val") == "0") {
                            return alert("未登录，无法进行相关操作");
                        }
                        if ($("#psd1").val() != $("#psd2").val()) {
                            return alert("新密码与确认密码不一致");
                        }
                        var formData = new FormData($("#changepsd-form")[0]);
                        var data = ajaxPost('/web/site/public?url=api/volunteer/updatePassword.do', formData);
                        if (data["status"] == "true") {
                            alert("密码修改成功！请重新登录");
                            return window.location.href = "/web/user/logout";
                        }
                        alert(data["message"]);
                    }
                </script>
                <form id="changepsd-form" method="post" action="/web/site/public?url=api/volunteer/updatePassword.do">
                    <input type="hidden" name="_csrf" value="OS54c3QtREgOHhkxGRorDm99F0AZfncQUE8QESBjFTt1fCkdAWU.Dw==">
                    <label class="userinfo-label"><span>*</span> 旧密码：</label><input class="userinfo-input"
                                                                                    name="oldpassword" type="password"
                                                                                    placeholder="请填写旧密码"><br>
                    <label class="userinfo-label"><span>*</span> 新密码：</label><input id="psd1" class="userinfo-input"
                                                                                    name="password" type="password"
                                                                                    placeholder="请填写新密码"><br>
                    <label class="userinfo-label"><span>*</span> 确认密码：</label><input id="psd2" class="userinfo-input"
                                                                                     type="password"
                                                                                     placeholder="请填写确认密码"><br>
                    <div class="register-btn" style="float:left;margin-top:10px;" onclick="changePsd()">确认</div>
                </form>
            </div>
            <div class="userlayout-right useraddress">
                <p class="userlayout-right-p">当前位置：收货地址</p>
                <form id="useraddress-form" method="post" action="">
                    <label class="userinfo-label"><span>*</span> 详细地址：</label><input class="userinfo-input"
                                                                                     name="useraddress" type="text"
                                                                                     placeholder="请输入详细地址信息，如道路、门牌号、区、栋、单元等信息"><br>
                    <label class="userinfo-label"><span>*</span> 收货人姓名：</label><input class="userinfo-input"
                                                                                      name="username" type="text"
                                                                                      placeholder="长度不超过25个字符"><br>
                    <div class="next-form-item-help">&nbsp;&nbsp;&nbsp;&nbsp;收货人姓名应为2-25个字符，一个汉字为两个字符</div>
                    <label class="userinfo-label"><span>*</span> 手机号码：</label><input class="userinfo-input"
                                                                                     name="userphone" type="text"
                                                                                     placeholder="请输入11位有效手机号码"><br>
                    <div class="register-btn" style="float:left;margin-top:10px;" onclick="changeAddress()">确认</div>
                </form>
            </div>
            <div class="userlayout-right userrecord">
                <p class="userlayout-right-p">当前位置：积分消费记录</p>

            </div>
        </div>
    </div>

</div>

<footer class="footer">
    <div class="footer-box">
        <div class="footer-left">
            <dl>
                <dt>友情链接</dt>
                <dd onClick="window.location.href='http://www.ccyl.org.cn/'">共青团中央委员会</dd>
                <dd onClick="window.location.href='http://www.cyol.net/'">中青在线</dd>
            </dl>
            <dl>
                <dt>&nbsp;</dt>
                <dd onClick="window.location.href='http://www.zgzyz.org.cn/'">中国青年志愿者网</dd>
                <dd onClick="window.location.href='http://www.creditchina.gov.cn/'">信用中国</dd>
            </dl>
            <dl>
                <dt>主办单位</dt>
                <dd onClick="window.location.href='http://www.nsu.edu.cn/'">成都东软学院</dd>
                <dd onClick="window.location.href='#'">青年志愿者协会</dd>
            </dl>
            <p style="margin-top:20px;padding-top:20px;border-top:#727171 1px solid;">联系邮箱：i-my-love@outlook.com&nbsp;&nbsp;&nbsp;&nbsp;联系电话：028-6488-8001</p>
        </div>
        <img class="footer-right">
    </div>
</footer>

<script id="cityList" type="text/x-jsrender">
			<dl>
				{{if url!=null}}
				<dt onclick="window.location.href='{{>url}}'">{{:name}}</dt> {{else}}
				<dt onclick="headerCityChange(this)" val="{{>areaid}}" newid="{{>newareaid}}" class="province">{{>name}}</dt> {{/if}}
				<div class="header-city-ddlist">
					{{for city ~parentareaid=areaid}} {{if url!=null}}
					<dd onclick="window.location.href='{{>url}}'">{{:name}}</dd>
					{{else}}
					<dd onclick="headerCityChange(this)" val="{{>areaid}}" newid="{{>newareaid}}" class="city" upclass="{{>~parentareaid}}">{{>name}}</dd>
					{{/if}} {{/for}}
				</div>
			</dl>

</script>
<script>
    var ch = checkCurrentCity();
    if (!ch['status']) {
        var city = new Array();
        city["name"] = "全国站";
        city["val"] = "0";
        city["id"] = "14737477846505d6208a5e781435b84e2e079304353cb";
        setCookie("currentDistrict", city);
    }
</script>

</body>

</html>
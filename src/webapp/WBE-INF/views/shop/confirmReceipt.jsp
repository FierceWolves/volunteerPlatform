<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<title>确认收货</title>
		<!-- for-mobile-apps -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="" />
		<script type="application/x-javascript">
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		</script>
		<!-- //for-mobile-apps -->
		<link href="${staticPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${staticPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
		<!-- font-awesome icons -->
		<link href="${staticPath}/css/font-awesome.css" rel="stylesheet" type="text/css" media="all" />
		<!-- //font-awesome icons -->
		<!-- js -->
		<script src="${staticPath}/js/jquery-3.3.1.js"></script>
		<!-- //js -->
		<link href='https://fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
		<!-- start-smoth-scrolling -->
		<script type="text/javascript" src="${staticPath}/js/move-top.js"></script>
		<script type="text/javascript" src="${staticPath}/js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event) {
					event.preventDefault();
					$('html,body').animate({
						scrollTop: $(this.hash).offset().top
					}, 1000);
				});
			});
		</script>
		<!-- start-smoth-scrolling -->
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<!-- header -->
		<div class="agileits_header">
			<div class="w3ls_logo_products_left">
				<h1><a href="<%=request.getContextPath()%>/shop/creditShop.jsp">Credit&nbsp;&nbsp;Shop</a></h1>
			</div>

			<div class="w3l_search">
				<form action="#" method="post">
					<input type="text" name="Product" value="搜索" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '搜索';}" required="">
					<input type="submit" value=" ">
				</form>
			</div>
			<div class="product_list_header">
				<div style="float: right; cursor: pointer;">
					<span class="glyphicon glyphicon-shopping-cart my-cart-icon"><span class="badge badge-notify my-cart-badge"></span></span>
				</div>
			</div>
			<div class="w3l_header_right">
				<ul>
					<li class="dropdown profile_details_drop">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user" aria-hidden="true"></i><span class="caret"></span></a>
						<div class="mega-dropdown-menu">
							<div class="w3ls_vegetables">
								<ul class="dropdown-menu drp-mnu">
									<li>
										<a id="userLogin">登录</a>
									</li>
								</ul>
							</div>
						</div>
					</li>
				</ul>
			</div>
			<div class="w3l_header_right">
				<span id="orderListIcon"><a href="<%=request.getContextPath()%>/shop/myOrder.jsp">我的订单</a></span>
				<span><a href="<%=request.getContextPath()%>/site/home.jsp">首&nbsp;页</a></span></div>
			<div class="clearfix"> </div>
		</div>
		<!-- script-for sticky-nav -->
		<script>
			$(document).ready(function() {
				var navoffeset = $(".agileits_header").offset().top;
				$(window).scroll(function() {
					var scrollpos = $(window).scrollTop();
					if(scrollpos >= navoffeset) {
						$(".agileits_header").addClass("fixed");
					} else {
						$(".agileits_header").removeClass("fixed");
					}
				});

			});
		</script>

		<!-- 订单确认 -->
		<div class="top-brands">
			<div class="container">
				<h3>Confirm Receipt</h3>
				<div class="order-container">
					<div class="order-information-wrap">
						<h4><span id="order-title">我已经收到货，同意付款</span></h4>
						<p class="title-text">订单信息</p>
						<div class="order-title order-th-column-6">
							<div class="order-tds ot-0">商品名</div>
							<div class="order-tds ot-1">单价(元)</div>
							<div class="order-tds ot-2">数量</div>
							<div class="order-tds ot-3">优惠(元)</div>
							<div class="order-tds ot-4">总价(元)</div>
							<div class="order-tds ot-5">状态</div>
						</div>
						<div class="goods-details">
							<div class="goods-lists order-item-column-6">
								<div class="order-item ot-0">Fortune Sunflower Oil</div>
								<div class="order-item ot-1">10.00</div>
								<div class="order-item ot-2">1</div>
								<div class="order-item ot-3">2.01</div>
								<div class="order-item ot-4">7.99</div>
								<div class="order-item ot-5">已发货</div>
							</div>
							<div class="goods-lists order-item-column-5">
								<div class="order-item ot-0">Basmati Rise (5 Kg)</div>
								<div class="order-item ot-1">15.00</div>
								<div class="order-item ot-2">1</div>
								<div class="order-item ot-3">3.01</div>
								<div class="order-item ot-4">11.99</div>
								<div class="order-item ot-5">已发货</div>
							</div>
						</div>
						<div class="order-footer">
							<span class="footer-title">实付款:</span>
							<span class="actual-pay" id="actualPay">19.98</span>&nbsp;元
							<span class="delivery-title">(含运费：</span><span class="delivery-pay" id="deliveryPay">0.00</span>)
						</div>
					</div>
					<div class="misc-info">
						<div class="order-number-content misc-item">
							<span class="misc-label">订单编号:</span>
							<span class="order-number">200453060603505731</span>
						</div>
						<div class="shipper-content misc-item">
							<span class="misc-label">&nbsp;&nbsp;&nbsp;&nbsp;发货人:</span>
							<span class="shipper">赵云朋</span>
						</div>
						<div class="receipt-info-content misc-item">
							<span class="misc-label">收货信息:</span>
							<span class="receipt-info">四川省成都市都江堰青城山镇东软大道1号， 余星辰， 15182839862， 610213</span>
						</div>
						<div class="deal-time-content misc-item">
							<span class="misc-label">成交时间:</span>
							<span class="deal-time">2018-08-09 11:05:09</span>
						</div>
					</div>
					<div class="pay-box" id="payBox">
						<form class="ui-form" action="<%=request.getContextPath()%>/shop/dealSuccessful.jsp" method="post" id="authorizeOnceForm">
							<div class="pay-attention">
								<span class="pay-attention-text">请收到货后，再确认收货！否则您可能钱货两空！</span>
							</div>
							<div class="ui-form-item">
								<label class="ui-label" for="payPassword">支付宝支付密码：</label>
								<div class="sixPassword-wrap">
									<input class="ui-input" type="password" tabindex="" id="payPassword_input" name="payPassword_input" oncontextmenu="return false" onpaste="return false" oncopy="return false" oncut="return false" autocomplete="off" maxlength="6">
									<div class="passItem"></div>
									<div class="passItem"></div>
									<div class="passItem"></div>
									<div class="passItem"></div>
									<div class="passItem"></div>

								</div>
								<div class="pass-input-attention">
									<span>请输入6位数字支付密码</span>
								</div>
							</div>
							<div class="ui-fm-item fm-item-submit">
								<span class="ui-btn ui-btn-ok"><input id="payEnsure" class="ui-btn-text" type="submit" value="确定"></span>
								<span class="forget-pass-link"><a id="forgetPass" target="_blank" href="https://lab.alipay.com/user/passwordfind/index.htm?type=P">忘记密码?</a></span>
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
		<!-- //top-brands -->

		<!-- footer -->
		<footer class="footer" >
			<div class="footer-box">
				<div class="footer-left">
					<dl>
						<dt>友情链接</dt>
						<dd onclick="window.location.href='http://www.ccyl.org.cn/'">共青团中央委员会</dd>
						<dd onclick="window.location.href='http://www.cyol.net/'">中青在线</dd>
					</dl>
					<dl>
						<dt>&nbsp;</dt>
						<dd onclick="window.location.href='http://www.zgzyz.org.cn/'">中国青年志愿者网</dd>
						<dd onclick="window.location.href='http://www.creditchina.gov.cn/'">信用中国</dd>
					</dl>
					<dl>
						<dt>主办单位</dt>
						<dd onclick="window.location.href='http://www.nsu.edu.cn/'">成都东软学院</dd>
						<dd onclick="window.location.href='#'">青年志愿者协会</dd>
					</dl>

					<p style="margin-top:20px;padding-top:20px;border-top:#727171 1px solid;">联系邮箱：i-my-love@outlook.com&nbsp;&nbsp;&nbsp;&nbsp;联系电话：028-6488-8001</p>
				</div>
				<img class="footer-right" >
			</div>
		</footer>

		<!-- //footer -->
		<!-- Bootstrap Core JavaScript -->
		<script src="${staticPath}/js/bootstrap.min.js"></script>
		<script>
			$(document).ready(function() {
				$(".dropdown").hover(
					function() {
						$('.dropdown-menu', this).stop(true, true).slideDown("fast");
						$(this).toggleClass('open');
					},
					function() {
						$('.dropdown-menu', this).stop(true, true).slideUp("fast");
						$(this).toggleClass('open');
					}
				);
			});
		</script>
		<!-- here stars scrolling icon -->
		<script type="text/javascript">
			$(document).ready(function() {
				/*
					var defaults = {
					containerID: 'toTop', // fading element id
					containerHoverID: 'toTopHover', // fading element hover id
					scrollSpeed: 1200,
					easingType: 'linear' 
					};
				*/

				$().UItoTop({
					easingType: 'easeOutQuart'
				});

			});
		</script>
		<!-- //here ends scrolling icon -->
		<script type='text/javascript' src="${staticPath}/js/jquery.mycart.js"></script>
		<script type="text/javascript">
			$(function() {

				var goToCartIcon = function($addTocartBtn) {
					var $cartIcon = $(".my-cart-icon");
					var $image = $('<img width="30px" height="30px" src="' + $addTocartBtn.data("image") + '"/>').css({
						"position": "fixed",
						"z-index": "999"
					});
					$addTocartBtn.prepend($image);
					var position = $cartIcon.position();
					$image.animate({

					}, 500, "linear", function() {
						$image.remove();
					});
				}

				$('.my-cart-btn').myCart({
					classCartIcon: 'my-cart-icon',
					classCartBadge: 'my-cart-badge',
					affixCartIcon: true,
					checkoutCart: function(products, totalPrice, totalQuantity) {
						var checkoutString = "Total Price: " + totalPrice + "\nTotal Quantity: " + totalQuantity;
						checkoutString += "\n\n id \t name \t summary \t price \t quantity \t image path";
						$.each(products, function() {
							checkoutString += ("\n " + this.id + " \t " + this.name + " \t " + this.summary + " \t " + this.price + " \t " + this.quantity + " \t " + this.image);
						});
						alert(checkoutString)
						console.log("checking out", products, totalPrice, totalQuantity);
					},
					clickOnAddToCart: function($addTocart) {
						goToCartIcon($addTocart);
					},
					getDiscountPrice: function(products) {
						var total = 0;
						$.each(products, function() {
							total += this.quantity * this.price;
						});
						return total * 1;
					}
				});

			});
		</script>
	</body>

</html>
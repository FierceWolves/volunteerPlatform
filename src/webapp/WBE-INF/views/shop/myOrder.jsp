<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<title>订单列表</title>
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
		<script type="text/javascript" src="${staticPath}/js/jquery.search.js" ></script>

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
									<li><a id="userLogin">登录</a></li>
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
		<!-- 订单列表 -->
		<div class="top-brands">
			<div class="container">
				<h3>Order List</h3>
				<div class="order-container">
					<div class="order-information-wrap">
						<h4><span id="order-title">所有订单</span></h4>
						<div class="order-search">
							<input class="order-search-input" id="orderSearch" type="number" placeholder="请输入订单号进行搜索"/>
							<button class="order-search-btn" id="searchBtn" >订单搜索</button>
						</div>
						<div class="order-title order-th-column-6">
							<div class="order-tds ot-0">商品名</div>
							<div class="order-tds ot-1">单价</div>
							<div class="order-tds ot-2">数量</div>
							<div class="order-tds ot-3">实付款</div>
							<div class="order-tds ot-4">交易状态</div>
							<div class="order-tds ot-5">交易操作</div>
						</div>

						<div class="order-details">
							<div class="order-unfinished order-list-item order1" style="display: ;">
								<div class="order-wrapper-head">
									<span class="order-time" id="orderTime1">2018-08-09</span>
									<span class="order-number-title">订单号：</span>
									<span class="order-number" id="order1">200453060603505731</span>
								</div>
								<div class="order-items order-item-column-6">
									<div class="order-item ot-0">Fortune Sunflower Oil</div>
									<div class="order-item ot-1">10.00</div>
									<div class="order-item ot-2">1</div>
									<div class="order-item ot-3">
										<p class="actualPay" id="actualPay1">2.01</p>
										<p id="freight">(含运费：<span id="freightPay1">0:00</span>)</p>
									</div>
									<div class="order-item ot-4">
										<div class="ot4-content">
											<p>物流运输中</p>
											<p><a class="order1 order-detail" href="<%=request.getContextPath()%>/shop/orderDetail.jsp">订单详情</a></p>
											<p><a class="order1 order-trace" href="<%=request.getContextPath()%>/shop/tracesDetail.jsp">查看物流</a></p>
										</div>
									</div>
									<div class="order-item ot-5">
										<button class="ensure-btn" id="ensureBtn" onclick="location='<%=request.getContextPath()%>/shop/confirmReceipt.jsp'">确认收货</button>
									</div>
								</div>
							</div>
							<div class="order-finished order-list-item order2" style="display: ;">
								<div class="order-wrapper-head">
									<span class="order-time" id="orderTime2">2018-08-01</span>
									<span class="order-number-title">订单号：</span>
									<span class="order-number" id="order2">199832163128505731</span>
								</div>
								<div class="order-items order-item-column-5">
									<div class="order-item ot-0">Basmati Rise (5 Kg)</div>
									<div class="order-item ot-1">15.00</div>
									<div class="order-item ot-2">1</div>
									<div class="order-item ot-3">
										<p class="actualPay" id="actualPay2">3.01</p>
										<p id="freight">(含运费：<span id="freightPay2">0:00</span>)</p>
									</div>

									<div class="order-item ot-4">
										<div class="ot4-content">
											<p>交易成功</p>
											<p><a class="order2 order-detail" href="<%=request.getContextPath()%>/shop/orderDetail.jsp">订单详情</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
						
					</div>
					
					<div class="pagination-wrapper">
						<ul class="pagination-content">
							<li title="上一页" class="pagination-item pagination-prev"><a id="pagePre" href="<%=request.getContextPath()%>/shop/myOrder.jsp">上一页</a></li>
							<li title="1" class="pagination-item pagination-item-1 pagination-item-active"><a id="page1" href="<%=request.getContextPath()%>/shop/myOrder.jsp" style="color: red;">1</a></li>
							<li title="2" class="pagination-item pagination-item-2 pagination-item-active"><a id="page2" href="<%=request.getContextPath()%>/shop/myOrder.jsp">2</a></li>
							<li title="3" class="pagination-item pagination-item-3 pagination-item-active"><a id="page3" href="<%=request.getContextPath()%>/shop/myOrder.jsp">3</a></li>
							<li title="4" class="pagination-item pagination-item-4 pagination-item-active"><a id="page4" href="<%=request.getContextPath()%>/shop/myOrder.jsp">4</a></li>
							<li title="5" class="pagination-item pagination-item-5 pagination-item-active"><a id="page5" href="<%=request.getContextPath()%>/shop/myOrder.jsp">5</a></li>
							<li title="向后5页" class="pagination-jump-next"><a href="#">...</a></li>
							<li title="下一页" class="pagination-item pagination-next"><a id="pageNext" href="<%=request.getContextPath()%>/shop/myOrder.jsp">下一页</a></li>
						</ul>
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
<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<title>商品详情</title>
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
				<span><a href="<%=request.getContextPath()%>/site/home.jsp">首&nbsp;页</a></span>
			</div>
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

		<!-- banner -->
		<div class="top-brands">
			<div class="container">
				<h3>Goods Detail</h3>
				<div class="w3l_banner_nav_right">
					<div class="agileinfo_single">
						<h5>charminar pulao basmati rice 5 kg</h5>
						<div class="col-md-4 agileinfo_single_left">
							<img id="example" src="${staticPath}/images/76.png" alt=" " class="img-responsive" />
						</div>
						<div class="col-md-8 agileinfo_single_right">
							<div class="rating1">
								<span class="starRating">
							<input id="rating5" type="radio" name="rating" value="5">
							<label for="rating5">5</label>
							<input id="rating4" type="radio" name="rating" value="4">
							<label for="rating4">4</label>
							<input id="rating3" type="radio" name="rating" value="3" checked>
							<label for="rating3">3</label>
							<input id="rating2" type="radio" name="rating" value="2">
							<label for="rating2">2</label>
							<input id="rating1" type="radio" name="rating" value="1">
							<label for="rating1">1</label>
						</span>
							</div>

							<div class="w3agile_description">
								<h4>Description :</h4>
								<p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
								</p>
							</div>
							<div class="snipcart-item block">
								<div class="snipcart-thumb agileinfo_single_right_snipcart">
									<h4>$21.00 <span>$25.00</span></h4>
								</div>
								<div class="snipcart-details agileinfo_single_right_details">
									<button class="btn btn-danger my-cart-btn hvr-sweep-to-right" data-id="76" data-name="Pulao basmati rice" data-summary="summary 76" data-price="21.00" data-quantity="1" data-image="${staticPath}/images/76.png">Add to Cart</button>
								</div>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- //banner -->

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
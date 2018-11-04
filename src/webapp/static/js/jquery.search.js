/*
 * 2018.8.12  R  用于搜索标签搜索内容
 * 实现步骤：
 * 1.JS查找需要搜索标签，匹配内容
 * 2.显示搜索到的内容(显示搜索内容/没有搜索到相关内容，重新输入，再进行尝试搜索)
 */

window.onload = function() {
	$("#searchBtn").click(function() {
		var orderNumber = $("#orderSearch").val();
		if(orderNumber) {
			var orderNumberList = $(".order-number");
			console.log("总订单数为" + orderNumberList.length + "，查询订单为" + orderNumber);
			orderNumberList.each(function(i) {
				if($(this).text() == orderNumber) {
					console.log("订单查询到了!" + $(this).attr("id"));
					//显示查找到的订单
					showOrder($(this).attr("id"));
					//跳出循环遍历
					return false;
				}
				if(i == 1) {
					//显示未查询到订单
					console.log("没有查询到订单");
				}
			})
		} else {
			showOrder("all");
		}
	})

	function showOrder(orderId) {
		//获取遍历的订单列表
		var orderDivList = $(".order-list-item");
		if(orderId == "all") {
			//显示所有订单
			orderDivList.each(function() {
				$(this).show();
			})
		} else {
			//遍历选择设置订单隐藏与显示
			orderDivList.each(function() {
				//获取订单div的类名
				var cla = $(this).attr("class");
				console.log(cla.indexOf(orderId));
				if(cla.indexOf(orderId) >= 0) {
					$(this).show();
				} else {
					$(this).hide();
				}
			})
		}
	}

}
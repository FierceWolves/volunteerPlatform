package cn.edu.nsu.greywolf.pojo;

public class OrderItems {
    private Integer orderItemId;

    private Integer orderId;

    private Integer goodId;

    private String orderItemPhoto;

    private String orderItemName;

    private String orderItemPrice;

    private Integer orderItemNumber;

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getOrderItemPhoto() {
        return orderItemPhoto;
    }

    public void setOrderItemPhoto(String orderItemPhoto) {
        this.orderItemPhoto = orderItemPhoto == null ? null : orderItemPhoto.trim();
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName == null ? null : orderItemName.trim();
    }

    public String getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(String orderItemPrice) {
        this.orderItemPrice = orderItemPrice == null ? null : orderItemPrice.trim();
    }

    public Integer getOrderItemNumber() {
        return orderItemNumber;
    }

    public void setOrderItemNumber(Integer orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
                "orderItemId=" + orderItemId +
                ", orderId=" + orderId +
                ", goodId=" + goodId +
                ", orderItemPhoto='" + orderItemPhoto + '\'' +
                ", orderItemName='" + orderItemName + '\'' +
                ", orderItemPrice='" + orderItemPrice + '\'' +
                ", orderItemNumber=" + orderItemNumber +
                '}';
    }
}
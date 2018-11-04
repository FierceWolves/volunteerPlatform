package cn.edu.nsu.greywolf.pojo;

import java.util.Date;

public class Orders {
    private Integer orderId;

    private Integer logisticsId;

    private Integer volunteerId;

    private String orderNumber;

    private Date orderTime;

    private String orderMerchant;

    private String totalPrice;

    private String orderDiscount;

    private String orderPostage;

    private String actualPayment;

    private String orderStatus;

    private String receiptInformation;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderMerchant() {
        return orderMerchant;
    }

    public void setOrderMerchant(String orderMerchant) {
        this.orderMerchant = orderMerchant == null ? null : orderMerchant.trim();
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(String orderDiscount) {
        this.orderDiscount = orderDiscount == null ? null : orderDiscount.trim();
    }

    public String getOrderPostage() {
        return orderPostage;
    }

    public void setOrderPostage(String orderPostage) {
        this.orderPostage = orderPostage == null ? null : orderPostage.trim();
    }

    public String getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(String actualPayment) {
        this.actualPayment = actualPayment == null ? null : actualPayment.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getReceiptInformation() {
        return receiptInformation;
    }

    public void setReceiptInformation(String receiptInformation) {
        this.receiptInformation = receiptInformation == null ? null : receiptInformation.trim();
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", logisticsId=" + logisticsId +
                ", volunteerId=" + volunteerId +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderTime=" + orderTime +
                ", orderMerchant='" + orderMerchant + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", orderDiscount='" + orderDiscount + '\'' +
                ", orderPostage='" + orderPostage + '\'' +
                ", actualPayment='" + actualPayment + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", receiptInformation='" + receiptInformation + '\'' +
                '}';
    }
}
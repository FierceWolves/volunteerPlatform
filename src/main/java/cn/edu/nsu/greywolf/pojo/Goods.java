package cn.edu.nsu.greywolf.pojo;

public class Goods {
    private Integer goodId;

    private Integer volunteerId;

    private Integer orderItemId;

    private String goodName;

    private String goodPrice;

    private Integer goodIntegral;

    private String discount;

    private String postage;

    private String merchant;

    private Integer repertory;

    private Integer salesVolume;

    private String goodDescription;

    private String goodPhoto;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(String goodPrice) {
        this.goodPrice = goodPrice == null ? null : goodPrice.trim();
    }

    public Integer getGoodIntegral() {
        return goodIntegral;
    }

    public void setGoodIntegral(Integer goodIntegral) {
        this.goodIntegral = goodIntegral;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage == null ? null : postage.trim();
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant == null ? null : merchant.trim();
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getGoodDescription() {
        return goodDescription;
    }

    public void setGoodDescription(String goodDescription) {
        this.goodDescription = goodDescription == null ? null : goodDescription.trim();
    }

    public String getGoodPhoto() {
        return goodPhoto;
    }

    public void setGoodPhoto(String goodPhoto) {
        this.goodPhoto = goodPhoto == null ? null : goodPhoto.trim();
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodId=" + goodId +
                ", volunteerId=" + volunteerId +
                ", orderItemId=" + orderItemId +
                ", goodName='" + goodName + '\'' +
                ", goodPrice='" + goodPrice + '\'' +
                ", goodIntegral=" + goodIntegral +
                ", discount='" + discount + '\'' +
                ", postage='" + postage + '\'' +
                ", merchant='" + merchant + '\'' +
                ", repertory=" + repertory +
                ", salesVolume=" + salesVolume +
                ", goodDescription='" + goodDescription + '\'' +
                ", goodPhoto='" + goodPhoto + '\'' +
                '}';
    }
}
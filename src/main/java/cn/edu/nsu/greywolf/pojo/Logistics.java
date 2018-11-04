package cn.edu.nsu.greywolf.pojo;

public class Logistics {
    private Integer logisticsId;

    private Integer orderId;

    private String logisticsNumber;

    private String logisticsCompany;

    private String despatchPlace;

    private String despatchPerson;

    private String despatchTel;

    private String despatchCode;

    private String receiptPlace;

    private String receiptPerson;

    private String receiptTel;

    private String receiptCode;

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber == null ? null : logisticsNumber.trim();
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }

    public String getDespatchPlace() {
        return despatchPlace;
    }

    public void setDespatchPlace(String despatchPlace) {
        this.despatchPlace = despatchPlace == null ? null : despatchPlace.trim();
    }

    public String getDespatchPerson() {
        return despatchPerson;
    }

    public void setDespatchPerson(String despatchPerson) {
        this.despatchPerson = despatchPerson == null ? null : despatchPerson.trim();
    }

    public String getDespatchTel() {
        return despatchTel;
    }

    public void setDespatchTel(String despatchTel) {
        this.despatchTel = despatchTel == null ? null : despatchTel.trim();
    }

    public String getDespatchCode() {
        return despatchCode;
    }

    public void setDespatchCode(String despatchCode) {
        this.despatchCode = despatchCode == null ? null : despatchCode.trim();
    }

    public String getReceiptPlace() {
        return receiptPlace;
    }

    public void setReceiptPlace(String receiptPlace) {
        this.receiptPlace = receiptPlace == null ? null : receiptPlace.trim();
    }

    public String getReceiptPerson() {
        return receiptPerson;
    }

    public void setReceiptPerson(String receiptPerson) {
        this.receiptPerson = receiptPerson == null ? null : receiptPerson.trim();
    }

    public String getReceiptTel() {
        return receiptTel;
    }

    public void setReceiptTel(String receiptTel) {
        this.receiptTel = receiptTel == null ? null : receiptTel.trim();
    }

    public String getReceiptCode() {
        return receiptCode;
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode == null ? null : receiptCode.trim();
    }

    @Override
    public String toString() {
        return "Logistics{" +
                "logisticsId=" + logisticsId +
                ", orderId=" + orderId +
                ", logisticsNumber='" + logisticsNumber + '\'' +
                ", logisticsCompany='" + logisticsCompany + '\'' +
                ", despatchPlace='" + despatchPlace + '\'' +
                ", despatchPerson='" + despatchPerson + '\'' +
                ", despatchTel='" + despatchTel + '\'' +
                ", despatchCode='" + despatchCode + '\'' +
                ", receiptPlace='" + receiptPlace + '\'' +
                ", receiptPerson='" + receiptPerson + '\'' +
                ", receiptTel='" + receiptTel + '\'' +
                ", receiptCode='" + receiptCode + '\'' +
                '}';
    }
}
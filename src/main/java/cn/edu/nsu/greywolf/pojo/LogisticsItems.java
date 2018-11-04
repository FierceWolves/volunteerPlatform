package cn.edu.nsu.greywolf.pojo;

import java.util.Date;

public class LogisticsItems {
    private Integer logisticsItemId;

    private Integer logisticsId;

    private Date logisticsItemDate;

    private String logisticsItemWeek;

    private Date logisticsItemTime;

    private String acceptStation;

    public Integer getLogisticsItemId() {
        return logisticsItemId;
    }

    public void setLogisticsItemId(Integer logisticsItemId) {
        this.logisticsItemId = logisticsItemId;
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Date getLogisticsItemDate() {
        return logisticsItemDate;
    }

    public void setLogisticsItemDate(Date logisticsItemDate) {
        this.logisticsItemDate = logisticsItemDate;
    }

    public String getLogisticsItemWeek() {
        return logisticsItemWeek;
    }

    public void setLogisticsItemWeek(String logisticsItemWeek) {
        this.logisticsItemWeek = logisticsItemWeek == null ? null : logisticsItemWeek.trim();
    }

    public Date getLogisticsItemTime() {
        return logisticsItemTime;
    }

    public void setLogisticsItemTime(Date logisticsItemTime) {
        this.logisticsItemTime = logisticsItemTime;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation == null ? null : acceptStation.trim();
    }

    @Override
    public String toString() {
        return "LogisticsItems{" +
                "logisticsItemId=" + logisticsItemId +
                ", logisticsId=" + logisticsId +
                ", logisticsItemDate=" + logisticsItemDate +
                ", logisticsItemWeek='" + logisticsItemWeek + '\'' +
                ", logisticsItemTime=" + logisticsItemTime +
                ", acceptStation='" + acceptStation + '\'' +
                '}';
    }
}
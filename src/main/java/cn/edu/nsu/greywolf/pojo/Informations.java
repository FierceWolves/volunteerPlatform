package cn.edu.nsu.greywolf.pojo;

import java.util.Date;

public class Informations {
    private Integer informationId;

    private String informationTitle;

    private Date informationTime;

    private String informationContent;

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getInformationTitle() {
        return informationTitle;
    }

    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle == null ? null : informationTitle.trim();
    }

    public Date getInformationTime() {
        return informationTime;
    }

    public void setInformationTime(Date informationTime) {
        this.informationTime = informationTime;
    }

    public String getInformationContent() {
        return informationContent;
    }

    public void setInformationContent(String informationContent) {
        this.informationContent = informationContent == null ? null : informationContent.trim();
    }

    @Override
    public String toString() {
        return "Informations{" +
                "informationId=" + informationId +
                ", informationTitle='" + informationTitle + '\'' +
                ", informationTime=" + informationTime +
                ", informationContent='" + informationContent + '\'' +
                '}';
    }
}
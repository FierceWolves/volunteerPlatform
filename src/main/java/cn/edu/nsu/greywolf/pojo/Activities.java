package cn.edu.nsu.greywolf.pojo;

import java.util.Date;

public class Activities {
    private Integer activityId;

    private Integer orgManagerId;

    private String activityTitle;

    private String activityDetail;

    private Integer activityType;

    private Date startTime;

    private Date endTime;

    private String activityProvince;

    private String activityCity;

    private String activitySite;

    private String activityOrg;

    private String activityPrincipal;

    private String activityPrincipalTel;

    private String participatorNumber;

    private String activityStatus;

    private String activityPhoto;

    private Integer activityIntegral;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getOrgManagerId() {
        return orgManagerId;
    }

    public void setOrgManagerId(Integer orgManagerId) {
        this.orgManagerId = orgManagerId;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    public String getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail == null ? null : activityDetail.trim();
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getActivityProvince() {
        return activityProvince;
    }

    public void setActivityProvince(String activityProvince) {
        this.activityProvince = activityProvince == null ? null : activityProvince.trim();
    }

    public String getActivityCity() {
        return activityCity;
    }

    public void setActivityCity(String activityCity) {
        this.activityCity = activityCity == null ? null : activityCity.trim();
    }

    public String getActivitySite() {
        return activitySite;
    }

    public void setActivitySite(String activitySite) {
        this.activitySite = activitySite == null ? null : activitySite.trim();
    }

    public String getActivityOrg() {
        return activityOrg;
    }

    public void setActivityOrg(String activityOrg) {
        this.activityOrg = activityOrg == null ? null : activityOrg.trim();
    }

    public String getActivityPrincipal() {
        return activityPrincipal;
    }

    public void setActivityPrincipal(String activityPrincipal) {
        this.activityPrincipal = activityPrincipal == null ? null : activityPrincipal.trim();
    }

    public String getActivityPrincipalTel() {
        return activityPrincipalTel;
    }

    public void setActivityPrincipalTel(String activityPrincipalTel) {
        this.activityPrincipalTel = activityPrincipalTel == null ? null : activityPrincipalTel.trim();
    }

    public String getParticipatorNumber() {
        return participatorNumber;
    }

    public void setParticipatorNumber(String participatorNumber) {
        this.participatorNumber = participatorNumber == null ? null : participatorNumber.trim();
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus == null ? null : activityStatus.trim();
    }

    public String getActivityPhoto() {
        return activityPhoto;
    }

    public void setActivityPhoto(String activityPhoto) {
        this.activityPhoto = activityPhoto == null ? null : activityPhoto.trim();
    }

    public Integer getActivityIntegral() {
        return activityIntegral;
    }

    public void setActivityIntegral(Integer activityIntegral) {
        this.activityIntegral = activityIntegral;
    }
}
package cn.edu.nsu.greywolf.pojo;

public class ActivityTypes {
    private Integer activityTypeId;

    private String activityTypeName;

    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public String getActivityTypeName() {
        return activityTypeName;
    }

    public void setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName == null ? null : activityTypeName.trim();
    }
}
package cn.edu.nsu.greywolf.pojo;

public class Organizers {
    private Integer orgManagerId;

    private Integer orgId;

    private Integer userID;

    private String organization;

    private String orgPosition;

    public Integer getOrgManagerId() {
        return orgManagerId;
    }

    public void setOrgManagerId(Integer orgManagerId) {
        this.orgManagerId = orgManagerId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getOrgPosition() {
        return orgPosition;
    }

    public void setOrgPosition(String orgPosition) {
        this.orgPosition = orgPosition == null ? null : orgPosition.trim();
    }

    @Override
    public String toString() {
        return "Organizers{" +
                "orgManagerId=" + orgManagerId +
                ", orgId=" + orgId +
                ", userID=" + userID +
                ", organization='" + organization + '\'' +
                ", orgPosition='" + orgPosition + '\'' +
                '}';
    }
}
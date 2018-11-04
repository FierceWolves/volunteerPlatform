package cn.edu.nsu.greywolf.pojo;

public class OrgTypes {
    private Integer orgTypeId;

    private String orgTypeName;

    public Integer getOrgTypeId() {
        return orgTypeId;
    }

    public void setOrgTypeId(Integer orgTypeId) {
        this.orgTypeId = orgTypeId;
    }

    public String getOrgTypeName() {
        return orgTypeName;
    }

    public void setOrgTypeName(String orgTypeName) {
        this.orgTypeName = orgTypeName == null ? null : orgTypeName.trim();
    }
}
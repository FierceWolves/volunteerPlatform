package cn.edu.nsu.greywolf.pojo;

public class Orgs {
    private Integer orgId;

    private Integer orgManagerId;

    private Integer managerId;

    private String orgName;

    private String orgProvince;

    private String orgCity;

    private String orgAddress;

    private String orgEmail;

    private String principal;

    private String principalTel;

    private String principalIDNumber;

    private Integer orgType;

    private String orgLogo;

    private String orgDescription;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgManagerId() {
        return orgManagerId;
    }

    public void setOrgManagerId(Integer orgManagerId) {
        this.orgManagerId = orgManagerId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgProvince() {
        return orgProvince;
    }

    public void setOrgProvince(String orgProvince) {
        this.orgProvince = orgProvince == null ? null : orgProvince.trim();
    }

    public String getOrgCity() {
        return orgCity;
    }

    public void setOrgCity(String orgCity) {
        this.orgCity = orgCity == null ? null : orgCity.trim();
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail == null ? null : orgEmail.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getPrincipalTel() {
        return principalTel;
    }

    public void setPrincipalTel(String principalTel) {
        this.principalTel = principalTel == null ? null : principalTel.trim();
    }

    public String getPrincipalIDNumber() {
        return principalIDNumber;
    }

    public void setPrincipalIDNumber(String principalIDNumber) {
        this.principalIDNumber = principalIDNumber == null ? null : principalIDNumber.trim();
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public String getOrgLogo() {
        return orgLogo;
    }

    public void setOrgLogo(String orgLogo) {
        this.orgLogo = orgLogo == null ? null : orgLogo.trim();
    }

    public String getOrgDescription() {
        return orgDescription;
    }

    public void setOrgDescription(String orgDescription) {
        this.orgDescription = orgDescription == null ? null : orgDescription.trim();
    }
}
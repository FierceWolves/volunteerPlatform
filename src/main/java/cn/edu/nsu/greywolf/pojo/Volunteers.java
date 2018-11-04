package cn.edu.nsu.greywolf.pojo;

public class Volunteers {
    private Integer volunteerId;

    private Integer orgId;

    private Integer userID;

    private String volunteerPhoto;

    private String guardianName;

    private String guardianTel;

    private String guardianIDNumber;

    private String politicsStatus;

    private String payPassword;

    private String studyStatus;

    private String school;

    private String studentNumber;

    private String skill;

    private String serviceRange;

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
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

    public String getVolunteerPhoto() {
        return volunteerPhoto;
    }

    public void setVolunteerPhoto(String volunteerPhoto) {
        this.volunteerPhoto = volunteerPhoto == null ? null : volunteerPhoto.trim();
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName == null ? null : guardianName.trim();
    }

    public String getGuardianTel() {
        return guardianTel;
    }

    public void setGuardianTel(String guardianTel) {
        this.guardianTel = guardianTel == null ? null : guardianTel.trim();
    }

    public String getGuardianIDNumber() {
        return guardianIDNumber;
    }

    public void setGuardianIDNumber(String guardianIDNumber) {
        this.guardianIDNumber = guardianIDNumber == null ? null : guardianIDNumber.trim();
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus == null ? null : studyStatus.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber == null ? null : studentNumber.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getServiceRange() {
        return serviceRange;
    }

    public void setServiceRange(String serviceRange) {
        this.serviceRange = serviceRange == null ? null : serviceRange.trim();
    }

    @Override
    public String toString() {
        return "Volunteers{" +
                "volunteerId=" + volunteerId +
                ", orgId=" + orgId +
                ", userID=" + userID +
                ", volunteerPhoto='" + volunteerPhoto + '\'' +
                ", guardianName='" + guardianName + '\'' +
                ", guardianTel='" + guardianTel + '\'' +
                ", guardianIDNumber='" + guardianIDNumber + '\'' +
                ", politicsStatus='" + politicsStatus + '\'' +
                ", payPassword='" + payPassword + '\'' +
                ", studyStatus='" + studyStatus + '\'' +
                ", school='" + school + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", skill='" + skill + '\'' +
                ", serviceRange='" + serviceRange + '\'' +
                '}';
    }
}
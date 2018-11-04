package cn.edu.nsu.greywolf.pojo;

public class Users {
    private Integer userID;

    private Integer managerId;

    private Integer volunteerId;

    private Integer orgManagerId;

    private String userName;

    private String password;

    private String userTel;

    private String IDNumberType;

    private String IDNumber;

    private String sex;

    private String nation;

    private String nativePlace;

    private String userEmail;

    private String registPlace;

    private String userAddress;

    private String workStatus;

    private String highestEducation;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    public Integer getOrgManagerId() {
        return orgManagerId;
    }

    public void setOrgManagerId(Integer orgManagerId) {
        this.orgManagerId = orgManagerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getIDNumberType() {
        return IDNumberType;
    }

    public void setIDNumberType(String IDNumberType) {
        this.IDNumberType = IDNumberType == null ? null : IDNumberType.trim();
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber == null ? null : IDNumber.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getRegistPlace() {
        return registPlace;
    }

    public void setRegistPlace(String registPlace) {
        this.registPlace = registPlace == null ? null : registPlace.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus == null ? null : workStatus.trim();
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation == null ? null : highestEducation.trim();
    }
}
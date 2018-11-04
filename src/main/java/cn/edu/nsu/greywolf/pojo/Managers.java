package cn.edu.nsu.greywolf.pojo;

public class Managers {
    private Integer managerId;

    private Integer userID;

    private String managerPosition;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getManagerPosition() {
        return managerPosition;
    }

    public void setManagerPosition(String managerPosition) {
        this.managerPosition = managerPosition == null ? null : managerPosition.trim();
    }

    @Override
    public String toString() {
        return "Managers{" +
                "managerId=" + managerId +
                ", userID=" + userID +
                ", managerPosition='" + managerPosition + '\'' +
                '}';
    }
}
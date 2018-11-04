package cn.edu.nsu.greywolf.pojo;

import java.util.Date;

public class Comments {
    private Integer commentId;

    private Integer activityId;

    @Override
    public String toString() {
        return "Comments{" +
                "commentId=" + commentId +
                ", activityId=" + activityId +
                ", userID=" + userID +
                ", commentTime=" + commentTime +
                ", commentContent='" + commentContent + '\'' +
                '}';
    }

    private Integer userID;

    private Date commentTime;

    private String commentContent;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}
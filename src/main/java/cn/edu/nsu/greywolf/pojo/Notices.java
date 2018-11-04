package cn.edu.nsu.greywolf.pojo;

import java.util.Date;

public class Notices {
    private Integer noticeId;

    private Integer orgManagerId;

    private String noticeTitle;

    private String notifier;

    private Date noticeTime;

    private String noticeActivity;

    private String noticeContent;

    private String receiver;

    private String noticeStatus;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getOrgManagerId() {
        return orgManagerId;
    }

    public void setOrgManagerId(Integer orgManagerId) {
        this.orgManagerId = orgManagerId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier == null ? null : notifier.trim();
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticeActivity() {
        return noticeActivity;
    }

    public void setNoticeActivity(String noticeActivity) {
        this.noticeActivity = noticeActivity == null ? null : noticeActivity.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus == null ? null : noticeStatus.trim();
    }

    @Override
    public String toString() {
        return "Notices{" +
                "noticeId=" + noticeId +
                ", orgManagerId=" + orgManagerId +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", notifier='" + notifier + '\'' +
                ", noticeTime=" + noticeTime +
                ", noticeActivity='" + noticeActivity + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", receiver='" + receiver + '\'' +
                ", noticeStatus='" + noticeStatus + '\'' +
                '}';
    }
}
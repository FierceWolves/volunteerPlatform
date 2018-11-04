package cn.edu.nsu.greywolf.pojo;

public class Advices {
    private Integer adviceId;

    private String adviceContent;

    private String adviceContact;

    public Integer getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(Integer adviceId) {
        this.adviceId = adviceId;
    }

    public String getAdviceContent() {
        return adviceContent;
    }

    public void setAdviceContent(String adviceContent) {
        this.adviceContent = adviceContent == null ? null : adviceContent.trim();
    }

    public String getAdviceContact() {
        return adviceContact;
    }

    public void setAdviceContact(String adviceContact) {
        this.adviceContact = adviceContact == null ? null : adviceContact.trim();
    }
}
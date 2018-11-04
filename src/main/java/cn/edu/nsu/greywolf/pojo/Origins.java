package cn.edu.nsu.greywolf.pojo;

public class Origins {
    private Integer originId;

    private String originName;

    public Integer getOriginId() {
        return originId;
    }

    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName == null ? null : originName.trim();
    }

    @Override
    public String toString() {
        return "Origins{" +
                "originId=" + originId +
                ", originName='" + originName + '\'' +
                '}';
    }
}
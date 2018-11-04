package cn.edu.nsu.greywolf.pojo;

public class Provinces {
    private Integer provinceId;

    private Integer originId;

    private String provinceName;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getOriginId() {
        return originId;
    }

    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    @Override
    public String toString() {
        return "Provinces{" +
                "provinceId=" + provinceId +
                ", originId=" + originId +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
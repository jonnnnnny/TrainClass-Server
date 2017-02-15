package com.train.pojo;

public class TeachingLocation {
    private String tlId;

    private String tlName;

    private String tlAddr;

    private String tlTel;

    private String tlTrafficinfo;

    private String tlDiagram;

    public String getTlId() {
        return tlId;
    }

    public void setTlId(String tlId) {
        this.tlId = tlId == null ? null : tlId.trim();
    }

    public String getTlName() {
        return tlName;
    }

    public void setTlName(String tlName) {
        this.tlName = tlName == null ? null : tlName.trim();
    }

    public String getTlAddr() {
        return tlAddr;
    }

    public void setTlAddr(String tlAddr) {
        this.tlAddr = tlAddr == null ? null : tlAddr.trim();
    }

    public String getTlTel() {
        return tlTel;
    }

    public void setTlTel(String tlTel) {
        this.tlTel = tlTel == null ? null : tlTel.trim();
    }

    public String getTlTrafficinfo() {
        return tlTrafficinfo;
    }

    public void setTlTrafficinfo(String tlTrafficinfo) {
        this.tlTrafficinfo = tlTrafficinfo == null ? null : tlTrafficinfo.trim();
    }

    public String getTlDiagram() {
        return tlDiagram;
    }

    public void setTlDiagram(String tlDiagram) {
        this.tlDiagram = tlDiagram == null ? null : tlDiagram.trim();
    }
}
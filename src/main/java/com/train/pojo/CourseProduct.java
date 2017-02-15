package com.train.pojo;

public class CourseProduct {
    private String cpId;

    private String cpName;

    private String cpIcon;

    private String cpInfo;

    private String cpHour;

    private String cpStdprice;

    private String cpStuprice;

    private String cpSpecprice;

    private String cpMaintm;

    private String cpRefertm;

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId == null ? null : cpId.trim();
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName == null ? null : cpName.trim();
    }

    public String getCpIcon() {
        return cpIcon;
    }

    public void setCpIcon(String cpIcon) {
        this.cpIcon = cpIcon == null ? null : cpIcon.trim();
    }

    public String getCpInfo() {
        return cpInfo;
    }

    public void setCpInfo(String cpInfo) {
        this.cpInfo = cpInfo == null ? null : cpInfo.trim();
    }

    public String getCpHour() {
        return cpHour;
    }

    public void setCpHour(String cpHour) {
        this.cpHour = cpHour == null ? null : cpHour.trim();
    }

    public String getCpStdprice() {
        return cpStdprice;
    }

    public void setCpStdprice(String cpStdprice) {
        this.cpStdprice = cpStdprice == null ? null : cpStdprice.trim();
    }

    public String getCpStuprice() {
        return cpStuprice;
    }

    public void setCpStuprice(String cpStuprice) {
        this.cpStuprice = cpStuprice == null ? null : cpStuprice.trim();
    }

    public String getCpSpecprice() {
        return cpSpecprice;
    }

    public void setCpSpecprice(String cpSpecprice) {
        this.cpSpecprice = cpSpecprice == null ? null : cpSpecprice.trim();
    }

    public String getCpMaintm() {
        return cpMaintm;
    }

    public void setCpMaintm(String cpMaintm) {
        this.cpMaintm = cpMaintm == null ? null : cpMaintm.trim();
    }

    public String getCpRefertm() {
        return cpRefertm;
    }

    public void setCpRefertm(String cpRefertm) {
        this.cpRefertm = cpRefertm == null ? null : cpRefertm.trim();
    }
}
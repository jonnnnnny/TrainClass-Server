package com.train.pojo;

public class TimeProperty {
    private String tpId;

    private String tpName;

    public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId == null ? null : tpId.trim();
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName == null ? null : tpName.trim();
    }
}
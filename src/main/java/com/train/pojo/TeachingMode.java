package com.train.pojo;

public class TeachingMode {
    private String tmId;

    private String tmBfname;

    private String tmTotname;

    public String getTmId() {
        return tmId;
    }

    public void setTmId(String tmId) {
        this.tmId = tmId == null ? null : tmId.trim();
    }

    public String getTmBfname() {
        return tmBfname;
    }

    public void setTmBfname(String tmBfname) {
        this.tmBfname = tmBfname == null ? null : tmBfname.trim();
    }

    public String getTmTotname() {
        return tmTotname;
    }

    public void setTmTotname(String tmTotname) {
        this.tmTotname = tmTotname == null ? null : tmTotname.trim();
    }
}
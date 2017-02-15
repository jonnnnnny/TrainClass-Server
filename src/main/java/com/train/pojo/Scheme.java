package com.train.pojo;

public class Scheme {
    private Integer no;

    private String sName;

    private String sDesc;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc == null ? null : sDesc.trim();
    }
}
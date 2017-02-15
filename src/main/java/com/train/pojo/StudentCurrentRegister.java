package com.train.pojo;

import java.util.Date;

public class StudentCurrentRegister {
    private Integer no;

    private Date scrTime;

    private String scrRegtypeid;

    private String scrRegtypename;

    private String scrRegtypefeat;

    private String scrStudid;

    private String scrPassword;

    private String scrClassid;

    private String scrClassname;

    private String scrSingleornot;

    private String scrPs;

    private String scrReceipt;

    private String scrOperator;

    private String scrInfo;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Date getScrTime() {
        return scrTime;
    }

    public void setScrTime(Date scrTime) {
        this.scrTime = scrTime;
    }

    public String getScrRegtypeid() {
        return scrRegtypeid;
    }

    public void setScrRegtypeid(String scrRegtypeid) {
        this.scrRegtypeid = scrRegtypeid == null ? null : scrRegtypeid.trim();
    }

    public String getScrRegtypename() {
        return scrRegtypename;
    }

    public void setScrRegtypename(String scrRegtypename) {
        this.scrRegtypename = scrRegtypename == null ? null : scrRegtypename.trim();
    }

    public String getScrRegtypefeat() {
        return scrRegtypefeat;
    }

    public void setScrRegtypefeat(String scrRegtypefeat) {
        this.scrRegtypefeat = scrRegtypefeat == null ? null : scrRegtypefeat.trim();
    }

    public String getScrStudid() {
        return scrStudid;
    }

    public void setScrStudid(String scrStudid) {
        this.scrStudid = scrStudid == null ? null : scrStudid.trim();
    }

    public String getScrPassword() {
        return scrPassword;
    }

    public void setScrPassword(String scrPassword) {
        this.scrPassword = scrPassword == null ? null : scrPassword.trim();
    }

    public String getScrClassid() {
        return scrClassid;
    }

    public void setScrClassid(String scrClassid) {
        this.scrClassid = scrClassid == null ? null : scrClassid.trim();
    }

    public String getScrClassname() {
        return scrClassname;
    }

    public void setScrClassname(String scrClassname) {
        this.scrClassname = scrClassname == null ? null : scrClassname.trim();
    }

    public String getScrSingleornot() {
        return scrSingleornot;
    }

    public void setScrSingleornot(String scrSingleornot) {
        this.scrSingleornot = scrSingleornot == null ? null : scrSingleornot.trim();
    }

    public String getScrPs() {
        return scrPs;
    }

    public void setScrPs(String scrPs) {
        this.scrPs = scrPs == null ? null : scrPs.trim();
    }

    public String getScrReceipt() {
        return scrReceipt;
    }

    public void setScrReceipt(String scrReceipt) {
        this.scrReceipt = scrReceipt == null ? null : scrReceipt.trim();
    }

    public String getScrOperator() {
        return scrOperator;
    }

    public void setScrOperator(String scrOperator) {
        this.scrOperator = scrOperator == null ? null : scrOperator.trim();
    }

    public String getScrInfo() {
        return scrInfo;
    }

    public void setScrInfo(String scrInfo) {
        this.scrInfo = scrInfo == null ? null : scrInfo.trim();
    }
}
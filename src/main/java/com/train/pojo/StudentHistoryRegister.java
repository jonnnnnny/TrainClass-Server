package com.train.pojo;

import java.util.Date;

public class StudentHistoryRegister {
    private Integer no;

    private Date shrTime;

    private String shrRegtypeid;

    private String shrRegtypename;

    private String shrRegtypefeat;

    private String shrStudid;

    private String shrPassword;

    private String shrClassid;

    private String shrClassname;

    private String shrSingleornot;

    private String shrPs;

    private String shrReceipt;

    private String shrOperator;

    private String shrInfo;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Date getShrTime() {
        return shrTime;
    }

    public void setShrTime(Date shrTime) {
        this.shrTime = shrTime;
    }

    public String getShrRegtypeid() {
        return shrRegtypeid;
    }

    public void setShrRegtypeid(String shrRegtypeid) {
        this.shrRegtypeid = shrRegtypeid == null ? null : shrRegtypeid.trim();
    }

    public String getShrRegtypename() {
        return shrRegtypename;
    }

    public void setShrRegtypename(String shrRegtypename) {
        this.shrRegtypename = shrRegtypename == null ? null : shrRegtypename.trim();
    }

    public String getShrRegtypefeat() {
        return shrRegtypefeat;
    }

    public void setShrRegtypefeat(String shrRegtypefeat) {
        this.shrRegtypefeat = shrRegtypefeat == null ? null : shrRegtypefeat.trim();
    }

    public String getShrStudid() {
        return shrStudid;
    }

    public void setShrStudid(String shrStudid) {
        this.shrStudid = shrStudid == null ? null : shrStudid.trim();
    }

    public String getShrPassword() {
        return shrPassword;
    }

    public void setShrPassword(String shrPassword) {
        this.shrPassword = shrPassword == null ? null : shrPassword.trim();
    }

    public String getShrClassid() {
        return shrClassid;
    }

    public void setShrClassid(String shrClassid) {
        this.shrClassid = shrClassid == null ? null : shrClassid.trim();
    }

    public String getShrClassname() {
        return shrClassname;
    }

    public void setShrClassname(String shrClassname) {
        this.shrClassname = shrClassname == null ? null : shrClassname.trim();
    }

    public String getShrSingleornot() {
        return shrSingleornot;
    }

    public void setShrSingleornot(String shrSingleornot) {
        this.shrSingleornot = shrSingleornot == null ? null : shrSingleornot.trim();
    }

    public String getShrPs() {
        return shrPs;
    }

    public void setShrPs(String shrPs) {
        this.shrPs = shrPs == null ? null : shrPs.trim();
    }

    public String getShrReceipt() {
        return shrReceipt;
    }

    public void setShrReceipt(String shrReceipt) {
        this.shrReceipt = shrReceipt == null ? null : shrReceipt.trim();
    }

    public String getShrOperator() {
        return shrOperator;
    }

    public void setShrOperator(String shrOperator) {
        this.shrOperator = shrOperator == null ? null : shrOperator.trim();
    }

    public String getShrInfo() {
        return shrInfo;
    }

    public void setShrInfo(String shrInfo) {
        this.shrInfo = shrInfo == null ? null : shrInfo.trim();
    }
}
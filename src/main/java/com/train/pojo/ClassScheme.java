package com.train.pojo;

import java.util.Date;

public class ClassScheme {
    private String csId;

    private Integer csSchemeno;

    private String csName;

    private String csCoursename;

    private String csLoacname;

    private String csTimename;

    private String csModebfname;

    private String csSchtime;

    private Date csStarttime;

    private Date csEndtime;

    private String csComment;

    private String csOperator;

    public String getCsId() {
        return csId;
    }

    public void setCsId(String csId) {
        this.csId = csId == null ? null : csId.trim();
    }

    public Integer getCsSchemeno() {
        return csSchemeno;
    }

    public void setCsSchemeno(Integer csSchemeno) {
        this.csSchemeno = csSchemeno;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName == null ? null : csName.trim();
    }

    public String getCsCoursename() {
        return csCoursename;
    }

    public void setCsCoursename(String csCoursename) {
        this.csCoursename = csCoursename == null ? null : csCoursename.trim();
    }

    public String getCsLoacname() {
        return csLoacname;
    }

    public void setCsLoacname(String csLoacname) {
        this.csLoacname = csLoacname == null ? null : csLoacname.trim();
    }

    public String getCsTimename() {
        return csTimename;
    }

    public void setCsTimename(String csTimename) {
        this.csTimename = csTimename == null ? null : csTimename.trim();
    }

    public String getCsModebfname() {
        return csModebfname;
    }

    public void setCsModebfname(String csModebfname) {
        this.csModebfname = csModebfname == null ? null : csModebfname.trim();
    }

    public String getCsSchtime() {
        return csSchtime;
    }

    public void setCsSchtime(String csSchtime) {
        this.csSchtime = csSchtime == null ? null : csSchtime.trim();
    }

    public Date getCsStarttime() {
        return csStarttime;
    }

    public void setCsStarttime(Date csStarttime) {
        this.csStarttime = csStarttime;
    }

    public Date getCsEndtime() {
        return csEndtime;
    }

    public void setCsEndtime(Date csEndtime) {
        this.csEndtime = csEndtime;
    }

    public String getCsComment() {
        return csComment;
    }

    public void setCsComment(String csComment) {
        this.csComment = csComment == null ? null : csComment.trim();
    }

    public String getCsOperator() {
        return csOperator;
    }

    public void setCsOperator(String csOperator) {
        this.csOperator = csOperator == null ? null : csOperator.trim();
    }
}
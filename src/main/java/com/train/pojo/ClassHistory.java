package com.train.pojo;

import java.util.Date;

public class ClassHistory {
    private String chId;

    private Integer chSchemeno;

    private String chName;

    private String chCoursename;

    private String chLocaname;

    private String chTimename;

    private String chModebfname;

    private String chSchtime;

    private Date chStarttime;

    private Date chEndtime;

    private String chTeacher;

    private String chTeachername;

    private Byte chStudamount;

    private String chComment;

    private String chOperator;

    private Integer chCalculate;

    public String getChId() {
        return chId;
    }

    public void setChId(String chId) {
        this.chId = chId == null ? null : chId.trim();
    }

    public Integer getChSchemeno() {
        return chSchemeno;
    }

    public void setChSchemeno(Integer chSchemeno) {
        this.chSchemeno = chSchemeno;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    public String getChCoursename() {
        return chCoursename;
    }

    public void setChCoursename(String chCoursename) {
        this.chCoursename = chCoursename == null ? null : chCoursename.trim();
    }

    public String getChLocaname() {
        return chLocaname;
    }

    public void setChLocaname(String chLocaname) {
        this.chLocaname = chLocaname == null ? null : chLocaname.trim();
    }

    public String getChTimename() {
        return chTimename;
    }

    public void setChTimename(String chTimename) {
        this.chTimename = chTimename == null ? null : chTimename.trim();
    }

    public String getChModebfname() {
        return chModebfname;
    }

    public void setChModebfname(String chModebfname) {
        this.chModebfname = chModebfname == null ? null : chModebfname.trim();
    }

    public String getChSchtime() {
        return chSchtime;
    }

    public void setChSchtime(String chSchtime) {
        this.chSchtime = chSchtime == null ? null : chSchtime.trim();
    }

    public Date getChStarttime() {
        return chStarttime;
    }

    public void setChStarttime(Date chStarttime) {
        this.chStarttime = chStarttime;
    }

    public Date getChEndtime() {
        return chEndtime;
    }

    public void setChEndtime(Date chEndtime) {
        this.chEndtime = chEndtime;
    }

    public String getChTeacher() {
        return chTeacher;
    }

    public void setChTeacher(String chTeacher) {
        this.chTeacher = chTeacher == null ? null : chTeacher.trim();
    }

    public String getChTeachername() {
        return chTeachername;
    }

    public void setChTeachername(String chTeachername) {
        this.chTeachername = chTeachername == null ? null : chTeachername.trim();
    }

    public Byte getChStudamount() {
        return chStudamount;
    }

    public void setChStudamount(Byte chStudamount) {
        this.chStudamount = chStudamount;
    }

    public String getChComment() {
        return chComment;
    }

    public void setChComment(String chComment) {
        this.chComment = chComment == null ? null : chComment.trim();
    }

    public String getChOperator() {
        return chOperator;
    }

    public void setChOperator(String chOperator) {
        this.chOperator = chOperator == null ? null : chOperator.trim();
    }

    public Integer getChCalculate() {
        return chCalculate;
    }

    public void setChCalculate(Integer chCalculate) {
        this.chCalculate = chCalculate;
    }
}
package com.train.pojo;

import java.util.Date;

public class ClassProcess {
	private String cpId;

	private Integer cpSchemeno;

	private String cpName;

	private String cpCoursename;

	private String cpLocaname;

	private String cpTimename;

	private String cpModebfname;

	private String cpSchtime;

	private Date cpStarttime;

	private Date cpEndtime;

	private String cpTeacher;

	private String cpTeachername;

	private Byte cpStudamount;

	private String cpComment;

	private String cpOperator;

	private Integer cpCalculate;

	public String getCpId() {
		return cpId;
	}

	public void setCpId(String cpId) {
		this.cpId = cpId == null ? null : cpId.trim();
	}

	public Integer getCpSchemeno() {
		return cpSchemeno;
	}

	public void setCpSchemeno(Integer cpSchemeno) {
		this.cpSchemeno = cpSchemeno;
	}

	public String getCpName() {
		return cpName;
	}

	public void setCpName(String cpName) {
		this.cpName = cpName == null ? null : cpName.trim();
	}

	public String getCpCoursename() {
		return cpCoursename;
	}

	public void setCpCoursename(String cpCoursename) {
		this.cpCoursename = cpCoursename == null ? null : cpCoursename.trim();
	}

	public String getCpLocaname() {
		return cpLocaname;
	}

	public void setCpLocaname(String cpLocaname) {
		this.cpLocaname = cpLocaname == null ? null : cpLocaname.trim();
	}

	public String getCpTimename() {
		return cpTimename;
	}

	public void setCpTimename(String cpTimename) {
		this.cpTimename = cpTimename == null ? null : cpTimename.trim();
	}

	public String getCpModebfname() {
		return cpModebfname;
	}

	public void setCpModebfname(String cpModebfname) {
		this.cpModebfname = cpModebfname == null ? null : cpModebfname.trim();
	}

	public String getCpSchtime() {
		return cpSchtime;
	}

	public void setCpSchtime(String cpSchtime) {
		this.cpSchtime = cpSchtime == null ? null : cpSchtime.trim();
	}

	public Date getCpStarttime() {
		return cpStarttime;
	}

	public void setCpStarttime(Date cpStarttime) {
		this.cpStarttime = cpStarttime;
	}

	public Date getCpEndtime() {
		return cpEndtime;
	}

	public void setCpEndtime(Date cpEndtime) {
		this.cpEndtime = cpEndtime;
	}

	public String getCpTeacher() {
		return cpTeacher;
	}

	public void setCpTeacher(String cpTeacher) {
		this.cpTeacher = cpTeacher == null ? null : cpTeacher.trim();
	}

	public String getCpTeachername() {
		return cpTeachername;
	}

	public void setCpTeachername(String cpTeachername) {
		this.cpTeachername = cpTeachername == null ? null : cpTeachername
				.trim();
	}

	public Byte getCpStudamount() {
		return cpStudamount;
	}

	public void setCpStudamount(Byte cpStudamount) {
		this.cpStudamount = cpStudamount;
	}

	public String getCpComment() {
		return cpComment;
	}

	public void setCpComment(String cpComment) {
		this.cpComment = cpComment == null ? null : cpComment.trim();
	}

	public String getCpOperator() {
		return cpOperator;
	}

	public void setCpOperator(String cpOperator) {
		this.cpOperator = cpOperator == null ? null : cpOperator.trim();
	}

	public Integer getCpCalculate() {
		return cpCalculate;
	}

	public void setCpCalculate(Integer cpCalculate) {
		this.cpCalculate = cpCalculate;
	}

	@Override
	public String toString() {
		return "ClassProcess [cpId=" + cpId + ", cpSchemeno=" + cpSchemeno
				+ ", cpName=" + cpName + ", cpCoursename=" + cpCoursename
				+ ", cpLocaname=" + cpLocaname + ", cpTimename=" + cpTimename
				+ ", cpModebfname=" + cpModebfname + ", cpSchtime=" + cpSchtime
				+ ", cpStarttime=" + cpStarttime + ", cpEndtime=" + cpEndtime
				+ ", cpTeacher=" + cpTeacher + ", cpTeachername="
				+ cpTeachername + ", cpStudamount=" + cpStudamount
				+ ", cpComment=" + cpComment + ", cpOperator=" + cpOperator
				+ ", cpCalculate=" + cpCalculate + "]";
	}

}
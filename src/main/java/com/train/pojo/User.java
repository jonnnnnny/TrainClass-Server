package com.train.pojo;

public class User {
	private String uPhone;

	private String uPassword;

	private String uType;

	private String uStuid;

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone == null ? null : uPhone.trim();
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword == null ? null : uPassword.trim();
	}

	public String getuType() {
		return uType;
	}

	public void setuType(String uType) {
		this.uType = uType == null ? null : uType.trim();
	}

	public String getuStuid() {
		return uStuid;
	}

	public void setuStuid(String uStuid) {
		this.uStuid = uStuid == null ? null : uStuid.trim();
	}

	@Override
	public String toString() {
		return "User [uPhone=" + uPhone + ", uPassword=" + uPassword
				+ ", uType=" + uType + ", uStuid=" + uStuid + "]";
	}

}
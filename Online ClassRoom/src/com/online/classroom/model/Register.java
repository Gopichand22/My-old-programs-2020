package com.online.classroom.model;

public class Register {

	private String user;
	private String email;
	private String pwd;
	private String confirmPwd;

	public Register() {
		super();
	}

	public Register(String user, String email, String pwd, String confirmPwd) {
		this.user = user;
		this.email = email;
		this.pwd = pwd;
		this.confirmPwd = confirmPwd;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

}

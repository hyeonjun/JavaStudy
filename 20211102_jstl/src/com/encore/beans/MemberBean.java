package com.encore.beans;

public class MemberBean {
	
	private String name;
	private String userid;
	private String nickname;
	private String email;
	private String pwd;
	private String phone;
	
	public MemberBean() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MemberBean(String name, String userid, String nickname, String email, String pwd, String phone) {
		super();
		this.name = name;
		this.userid = userid;
		this.nickname = nickname;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}

package com.encore.java.app;

public class Friend {
	private String name;
	private String tel;
	public Friend(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" +name + ":" +tel+ "]";
	}
	
}

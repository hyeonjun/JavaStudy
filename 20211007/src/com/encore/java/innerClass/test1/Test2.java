package com.encore.java.innerClass.test1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GalaxyMessenger galaxy = new GalaxyMessenger();
		galaxy.getMessage();
		galaxy.setMessage("hi");
	}

}

class GalaxyMessenger implements Messenger {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("galaxy에서 메시지 설정: "+msg);
	}
	
}
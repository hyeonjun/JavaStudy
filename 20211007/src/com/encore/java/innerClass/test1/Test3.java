package com.encore.java.innerClass.test1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messenger test = new Messenger() { // 익명 클래스 
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
		};
	}

}

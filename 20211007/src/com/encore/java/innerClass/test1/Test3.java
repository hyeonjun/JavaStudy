package com.encore.java.innerClass.test1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messenger test = new Messenger() { // �͸� Ŭ���� 
			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "galaxy";
			}

			@Override
			public void setMessage(String msg) {
				// TODO Auto-generated method stub
				System.out.println("galaxy���� �޽��� ����: "+msg);
			}
		};
	}

}

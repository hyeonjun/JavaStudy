package com.encore.java.innerClass.test1;

public class OuterClass {
	
	String name;
	public void test() {}
	
	class InnerCalss{ // ���� Ŭ����
		int a;
		void method2() {
			System.out.println("Instance Class : "+a);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

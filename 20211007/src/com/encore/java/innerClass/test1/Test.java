package com.encore.java.innerClass.test1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass obj = new OuterClass();
		obj.test();
		
		OuterClass.InnerCalss inner = obj.new InnerCalss(); // ���� Ŭ���� ����
		inner.a = 123;
		inner.method2();
		
	}

}

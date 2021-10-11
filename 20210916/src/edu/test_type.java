package edu;

public class test_type {

	public static void main(String[] args) {
		// 변수 선언 및 초기화 -> 타입 이름 = 값
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		
		// 변수 사용
		System.out.println(a + " " + b + " " + c + " " + d);
		
		// 산술 연산자
		System.out.println(a+b);
		System.out.println(b/c);
		System.out.println(c*d);
		System.out.println(d-a);
		
		float height = 123.12F;
		double height_ = 123.12;
		System.out.println(height);
		System.out.println(height_);
		
		boolean flag = true;
		boolean flag_ = false;
		System.out.println(flag);
		System.out.println(flag_);
		
		char s = 'a';
//		char ee = 'eadf'; //char는 한 문자
		String s_ = "bcdef"; // 문자열은 ""로 감싸야한다
		System.out.println(s);
		System.out.println(s_);
		
		String name = "Amy";
		String greeting = "Hello, good morning";
		System.out.println(name);
		System.out.println(greeting);
		
		// 특수문자
		String s1 = "hello \nworld \t java";
		System.out.println(s1);
				
		
		
	}

}

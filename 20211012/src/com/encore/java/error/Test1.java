package com.encore.java.error;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			Class.forName("java.test.A"); // ClassNotFoundException, 존재하지 않는 클래스
			
			int[] arr = new int[3];
//			arr[3] = 39; // ArrayIndexOutOfBoundsException
			
			
			String s = new String("ok");
			int len = s.length();
			s = null; 
//			s.length();// NullPointerException
			
			int a = 123 / 0; // ArithmeticException / by zero
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 에러 "+e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("참조변수 null "+e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("수학적 문제 "+e.getMessage());
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}

}

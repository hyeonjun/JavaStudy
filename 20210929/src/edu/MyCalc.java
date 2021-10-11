package edu;

public class MyCalc {
	public void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	
	public void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}
	public void add(double a, double b) { // 메서드 오버로딩
		double result = a + b;
		System.out.println(result);
	}
	
	public void mul(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	public static void main(String[] args) {
		MyCalc c = new MyCalc();
		int result = 50;
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(1.5, 3.5);
		c.mul(10, 20);
	}
}

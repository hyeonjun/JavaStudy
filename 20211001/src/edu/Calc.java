package edu;

public class Calc {
	// 싱글톤 패톤
	private static Calc calc = new Calc(); // 읽기 전용
	
	private Calc() {
		
	}
	
	// 읽기 작업
	public static Calc getInstance() {
		return calc; // 인스턴스 만들어줌
	}
	
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public int mul(int n1, int n2) {
		return n1 * n2;
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		
	}
}

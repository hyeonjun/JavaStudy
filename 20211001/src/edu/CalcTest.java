package edu;

public class CalcTest {
	public static void main(String[] args) {
		Calc c1 = Calc.getInstance();// 인스턴스 생성
		System.out.println(c1.add(10, 20));
		Calc c2 = Calc.getInstance();
		System.out.println(c2.mul(30, 40));
	
		System.out.println(c1);
		System.out.println(c2); // c1과 c2의 주소값은 같다.
		// Calc는 Calc클래스에서 만들어준 인스턴스만 사용할 수 있다.
	}
}

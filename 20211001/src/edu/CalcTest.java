package edu;

public class CalcTest {
	public static void main(String[] args) {
		Calc c1 = Calc.getInstance();// �ν��Ͻ� ����
		System.out.println(c1.add(10, 20));
		Calc c2 = Calc.getInstance();
		System.out.println(c2.mul(30, 40));
	
		System.out.println(c1);
		System.out.println(c2); // c1�� c2�� �ּҰ��� ����.
		// Calc�� CalcŬ�������� ������� �ν��Ͻ��� ����� �� �ִ�.
	}
}

package edu;

public class Calc {
	// �̱��� ����
	private static Calc calc = new Calc(); // �б� ����
	
	private Calc() {
		
	}
	
	// �б� �۾�
	public static Calc getInstance() {
		return calc; // �ν��Ͻ� �������
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

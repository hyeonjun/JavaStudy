package edu;

public class test_type {

	public static void main(String[] args) {
		// ���� ���� �� �ʱ�ȭ -> Ÿ�� �̸� = ��
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		
		// ���� ���
		System.out.println(a + " " + b + " " + c + " " + d);
		
		// ��� ������
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
//		char ee = 'eadf'; //char�� �� ����
		String s_ = "bcdef"; // ���ڿ��� ""�� ���ξ��Ѵ�
		System.out.println(s);
		System.out.println(s_);
		
		String name = "Amy";
		String greeting = "Hello, good morning";
		System.out.println(name);
		System.out.println(greeting);
		
		// Ư������
		String s1 = "hello \nworld \t java";
		System.out.println(s1);
				
		
		
	}

}

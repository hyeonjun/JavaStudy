package edu;

public class test_typeCast {

	public static void main(String[] args) {
		int a = 10;
//		byte b = a; # 4����Ʈ�� 1����Ʈ type�� ���� �� ����
		byte b = (byte)a; // int���� a�� type�� byte�� ����ȯ���Ѽ� b�� ����
		// �� a�� 1����Ʈ���� ū ���� ����Ǿ� ���� ��� byte�� ��ȯ��Ű�� ������ �߸�
		byte c = 20;
		int d = c;
		System.out.println(a + " " + b  + " " + c + " " + d);
		
		byte i = 10;
		byte j = 20;
//		byte k = i + j; 
		int k = i + j;
		byte l = (byte)(i+j);
		System.out.println(k);
		System.out.println(l);
		
		System.out.println((1+2) * 3); // 6
		
		byte a2 = 23;
		int b2 = a2;
		short c2 = 47;
		int d2 = a2 + b2 + c2; // a2+b2+c2�� �� �� b2�� ���� ū �����̹Ƿ�, ���� ū int������ �ȴ�
		
		// ASCII �ڵ�
		char letter = 'A';
		int v = (int)letter;
		System.out.println(letter);
		System.out.println((int)letter); // 65
		System.out.println(v);
		
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		for(int idx=0; idx<26; idx++) {
			System.out.print((char)('A'+idx));
		}
		System.out.println("\n");
		//abcdefghijklmnopqrstuvwxyz
		for(int idx=0; idx<26; idx++) {
			System.out.print((char)('a'+idx));
		}
		System.out.println("\n");
		
		
		char ch1 = '\uD55C'; // �����ڵ�
		System.out.println(ch1); // ��
		System.out.println(ch1);
		
		// ���
		final double pi = 3.14; // ������ �ʴ� ��
		// pi = 2.5; // �Ұ���
		System.out.println(pi);
		
		int num =555;
		System.out.println((num % 100) * 10 + 1);
	
	}
}

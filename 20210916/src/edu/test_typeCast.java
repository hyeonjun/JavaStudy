package edu;

public class test_typeCast {

	public static void main(String[] args) {
		int a = 10;
//		byte b = a; # 4바이트를 1바이트 type에 넣을 수 없음
		byte b = (byte)a; // int형인 a의 type을 byte로 형변환시켜서 b에 넣음
		// 단 a가 1바이트보다 큰 값이 저장되어 있을 경우 byte로 변환시키면 데이터 잘림
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
		int d2 = a2 + b2 + c2; // a2+b2+c2는 이 중 b2가 가장 큰 형식이므로, 가장 큰 int형으로 된다
		
		// ASCII 코드
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
		
		
		char ch1 = '\uD55C'; // 유니코드
		System.out.println(ch1); // 한
		System.out.println(ch1);
		
		// 상수
		final double pi = 3.14; // 변하지 않는 수
		// pi = 2.5; // 불가능
		System.out.println(pi);
		
		int num =555;
		System.out.println((num % 100) * 10 + 1);
	
	}
}

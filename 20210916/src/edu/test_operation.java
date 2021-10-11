package edu;

public class test_operation {
	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 30;

		System.out.println(a + " " + b + " " + c + " " + d);
		
		// 산술 연산자
		System.out.println(a+b);
		System.out.println(b/c);
		System.out.println(c*d);
		System.out.println(d-a);
		
		System.out.println("==============================================");
		
		// 증감연산자
		System.out.println(a--); // 10 후치 수식, 출력 후 연산
		System.out.println(a);   // 9
		System.out.println(--a); // 8 전치 수식, 연산 후 출력
		System.out.println(b++); // 20
		System.out.println(b);   // 21
		System.out.println(++b); // 22
		
		// 관계 연산자
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(c == d);
		System.out.println(c != d);
		
		// 부호 연산자
		int a1 = +10;
		int a2 = -10;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(-a2);
		
		// 복합 대입 연산자
		System.out.println(a1);
		a1 = a1 + 1; // a1 += 1
		System.out.println(a1);
		a1 = a1 + 5; // a1 += 5
		System.out.println(a1);
		a1 = a1 - 5; // a1 -= 5
		System.out.println(a1);
		a1 = a1 * 3; // a1 *= 3
		System.out.println(a1);
		a1 = a1 / 2; // a1 /= 2
		System.out.println(a1);
		
		a1 += 1;
		System.out.println(a1);
		a1 += 5;
		System.out.println(a1);
		a1 -= 5;
		System.out.println(a1);
		a1 *= 5;
		System.out.println(a1);
		a1 /= 3;
		System.out.println(a1);
		
		// 논리 연산자
		char gender = 'F';
		int balance = 1000000;
		
		System.out.println(gender == 'F');
		System.out.println(balance >= 1000000);
		
		System.out.println(gender == 'F' && balance >= 1000000);
		System.out.println(gender == 'F' && balance < 1000000);
		System.out.println(gender == 'F' || balance < 1000000);
		System.out.println(gender == 'M' || balance < 1000000);
		
		int age = 19;
		System.out.println(age >= 20 && age <= 60);
		
		//부정연산자
		boolean flag = true;
		System.out.println(!flag);
		
		// 삼항 연산자
		String msg = gender == 'F' ? "여자" : "남자";
		System.out.println(msg);
	}
	
}

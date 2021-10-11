package edu;

public class test_double_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n");
		for (int i=2; i<=100; i++) {
			boolean flag = true;
			for (int j=2; j<Math.sqrt(i)+1; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (i == 2|| flag) {
				System.out.print(i + " ");
			}
		}
		
		
		System.out.println("\n");
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i=0; i<5; i++) {
			for (int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i=0; i<5; i++) {
			for (int j=0; j<5-i-1; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i=0; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n");
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		String s = "AmyI";
		s.length();  // 문자열 길이. 3
		s.charAt(0); // 문자열 위치 값. 0->A, 1->m, 2->y
		for (int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("\n");
		// A = 65 B = 66 ~
		char s1 = 'A';
		for (int i=0; i<5; i++) {
			for (int j='A'; j<i+1; j++) {
				System.out.print(s1++);
			}
			s1 = 'A';
			System.out.println();
		}
	}
}

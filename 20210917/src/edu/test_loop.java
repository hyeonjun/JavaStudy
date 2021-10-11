package edu;

public class test_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i=0; i<10; i+=2) {
//			System.out.println("Hello");
//		}
//		
//		System.out.println("\n");
//		int k = 0;
//		while (k < 5) {
//			System.out.println("Hello");
//			k++;
//		}
//		
//		System.out.println("\n");
//		int l = 0;
//		do {
//			System.out.println("Hello");
//			l++;
//		} while (l < 5);
		
		
		System.out.println("\n");
		for (int i=5; i>0; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		for (int i=0; i<101; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		for (int i=0; i<101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n");
		for (int i=1; i<10; i++) {
			System.out.println("2 * " + i + " = " + 2*i);
		}
		
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
		
		
//		System.out.println("\n");
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
	}

}

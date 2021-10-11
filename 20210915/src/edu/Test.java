package edu;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) { // 시작 진입점
		System.out.println("Hello, Java");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("나이는?");
			int age = sc.nextInt();
			if (age >= 20) {
				System.out.println("성인");
			}
			else {
				System.out.println("미성인");
			}
			System.out.println("끝내겠습니까?(Y/N)");
			String end = sc.next();
			if (end.equals("Y")) {
				sc.close();
				break;
			}
		}
		
	}
}

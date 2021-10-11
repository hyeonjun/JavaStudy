package edu;

import java.util.Scanner;

public class test_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (10 > 2) {
//			System.out.println("2");
//		} else {
//			System.out.println("3");
//		}
		
		Scanner s = new Scanner(System.in);
//		int score = s.nextInt();
		
//		if (score >= 60) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
		
//		char grade = 'F';
//		if(score >= 90 && score <= 100) {
//			grade = 'A';
//		}
//		else if(score >= 80 && score < 90) {
//			grade = 'B';
//		}
//		else if(score >= 70 && score < 80) {
//			grade = 'C';
//		}
//		else if(score >= 60 && score < 70) {
//			grade = 'D';
//		}
//		else {
//			grade = 'F';
//		}
//		System.out.println(grade);
		
		
		
//		double temp = s.nextDouble();
//		if (temp > 0) {
//			System.out.println("기체");
//		} else {
//			System.out.println("얼음");
//		}

//		String city = s.next("지역이 어디입니까?");
//		if (city.equals("서울") || city.equals("부산")) {
//			System.out.println(city);
//			System.out.println("주요 도시");
//		} else {
//			System.out.println(city);
//			System.out.println("기타 도시");
//		}
		
//		int fee = 0;
//		System.out.println("한국입니까? 해외입니까?");
//		String nation = s.next();
//		if (nation.equals("한국")) {
//			System.out.println("지역이 어디입니까?");
//			String city = s.next();
//			if (city.equals("제주도")) {
//				fee = 5000;
//			}
//			else {
//				fee = 2500;
//			}
//		} else {
//			fee = 20000;
//		}
//		System.out.println(fee + "원입니다.");
		
		
		int number = s.nextInt();
		if (number > 0) {
			System.out.println("양수");
		} else if (number == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
		s.close();
	}

}

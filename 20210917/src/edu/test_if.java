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
//			System.out.println("�հ�");
//		}
//		else {
//			System.out.println("���հ�");
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
//			System.out.println("��ü");
//		} else {
//			System.out.println("����");
//		}

//		String city = s.next("������ ����Դϱ�?");
//		if (city.equals("����") || city.equals("�λ�")) {
//			System.out.println(city);
//			System.out.println("�ֿ� ����");
//		} else {
//			System.out.println(city);
//			System.out.println("��Ÿ ����");
//		}
		
//		int fee = 0;
//		System.out.println("�ѱ��Դϱ�? �ؿ��Դϱ�?");
//		String nation = s.next();
//		if (nation.equals("�ѱ�")) {
//			System.out.println("������ ����Դϱ�?");
//			String city = s.next();
//			if (city.equals("���ֵ�")) {
//				fee = 5000;
//			}
//			else {
//				fee = 2500;
//			}
//		} else {
//			fee = 20000;
//		}
//		System.out.println(fee + "���Դϴ�.");
		
		
		int number = s.nextInt();
		if (number > 0) {
			System.out.println("���");
		} else if (number == 0) {
			System.out.println("0");
		} else {
			System.out.println("����");
		}
		
		s.close();
	}

}

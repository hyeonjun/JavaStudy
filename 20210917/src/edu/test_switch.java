package edu;

import java.util.Scanner;

public class test_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		
		
		if (grade == 'A') {
			System.out.println("90�� �̻�");
		} else if (grade == 'B') {
			System.out.println("80�� �̻�");
		} else if (grade == 'C') {
			System.out.println("70�� �̻�");
		} else if (grade == 'D') {
			System.out.println("60�� �̻�");
		} else {
			System.out.println("60�� �̸�");
		}
		
		switch(grade){ // switch�� ���� Ÿ�� =  byte short int char String
		case 'A': System.out.println("90�� �̻�"); break;
		case 'B': System.out.println("80�� �̻�"); break;
		case 'C': System.out.println("70�� �̻�"); break;
		case 'D': System.out.println("60�� �̻�"); break;
		default: System.out.println("60�� �̸�");
		}
		
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		switch(floor) {
		case 1: System.out.println("1�� �౹"); break;
		case 2: System.out.println("2�� �����ܰ�"); break;
		case 3: System.out.println("3�� �Ǻΰ�"); break;
		case 4: System.out.println("4�� ġ��"); break;
		case 5: System.out.println("5�� �ｺŬ��"); break;
		}
		
	}

}

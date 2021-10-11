package edu;

import java.util.Scanner;

public class test_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		
		
		if (grade == 'A') {
			System.out.println("90점 이상");
		} else if (grade == 'B') {
			System.out.println("80점 이상");
		} else if (grade == 'C') {
			System.out.println("70점 이상");
		} else if (grade == 'D') {
			System.out.println("60점 이상");
		} else {
			System.out.println("60점 미만");
		}
		
		switch(grade){ // switch의 변수 타입 =  byte short int char String
		case 'A': System.out.println("90점 이상"); break;
		case 'B': System.out.println("80점 이상"); break;
		case 'C': System.out.println("70점 이상"); break;
		case 'D': System.out.println("60점 이상"); break;
		default: System.out.println("60점 미만");
		}
		
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		switch(floor) {
		case 1: System.out.println("1층 약국"); break;
		case 2: System.out.println("2층 정형외과"); break;
		case 3: System.out.println("3층 피부과"); break;
		case 4: System.out.println("4층 치과"); break;
		case 5: System.out.println("5층 헬스클럽"); break;
		}
		
	}

}

package edu;

import java.util.Scanner;

public class test_if_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<10; i++) {
			int op_n = (int)(Math.random()*4)+1;
			int x = (int)(Math.random()*100);
			int y = (int)(Math.random()*100);
			
			String op = "";
			int result = 0;
			
			if(op_n == 1) {
				op = "+";
				result = x + y;
			} else if (op_n == 2) {
				op = "-";
				result = x - y;
			} else if (op_n == 3) {
				op = "*";
				result = x * y;
			} else {
				op = "/";
				result = x / y;
			}
			
			System.out.println(x + op + y + " = ?");
			
			int answer = sc.nextInt();
			if (answer == result) {
				System.out.println("답 : " + answer + "\n정답입니다.");
			}else {
				System.out.println("답 : " + result + "\n오답입니다.");
			}
		}
		sc.close();
		
	}
}

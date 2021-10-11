package edu;

import java.util.Scanner;

public class test_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int)(Math.random()*100);
		int y = (int)(Math.random()*100);
		System.out.println(x + " + " + y + " = ?");
	
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		int result = x+y;
		
		if (answer == result) {
			System.out.println("답 : " + answer + "\n정답입니다.");
		}else {
			System.out.println("답 : " + result + "\n오답입니다.");
		}
		
		
	}

}

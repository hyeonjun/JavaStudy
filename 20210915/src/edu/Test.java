package edu;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) { // ���� ������
		System.out.println("Hello, Java");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���̴�?");
			int age = sc.nextInt();
			if (age >= 20) {
				System.out.println("����");
			}
			else {
				System.out.println("�̼���");
			}
			System.out.println("�����ڽ��ϱ�?(Y/N)");
			String end = sc.next();
			if (end.equals("Y")) {
				sc.close();
				break;
			}
		}
		
	}
}

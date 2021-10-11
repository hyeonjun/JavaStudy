package com.encore.java.app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		Contact cont = new Contact();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("================== ����ó ���α׷� ==================");
			System.out.println("1.����ó �߰� 2.����ó ��� 3.����ó �˻� 4.����ó ���� 5.����ó ����\n9.����");
			System.out.print("�޴��� �������ּ���: ");
			
			String menu = sc.nextLine();
//			if (menu.equals("1")) {
//				System.out.println("����ó �߰� �۾�");
//			} else if (menu.equals("9")) {
//				System.out.println("���α׷��� �����մϴ�...");
//				System.exit(0);
//			}
			
			switch(menu) {
			case "1": {
				System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���.\n��) ȫ�浿,01012345678");
				String[] input = sc.nextLine().split(",");
				Friend f = new Friend(input[0], input[1]);
				cont.add(f);
			}break;
			
			case "2": {
				cont.getInfo();
			}break;
			
			case "3":{
				System.out.print("�˻��� �̸� �Է�: ");
				String name = sc.nextLine();
				ArrayList<Friend> result = cont.search(name);
				if (result.isEmpty()) {
					System.out.println("�˻� ����� �����ϴ�.");
				} else {
					for (int i = 0; i < result.size(); i++) {
						System.out.println(result.get(i));
					}
				}
			}break;
				
			case "4": {
				System.out.print("������ �̸� �Է�: ");
				String name =sc.nextLine();
				cont.delete(name);
			}break;
			
			case "5": {
				System.out.print("������ �̸� �Է�: ");
				String name = sc.nextLine();
				System.out.print("���ο� ��ȭ��ȣ �Է�: ");
				String tel = sc.nextLine();
				
				ArrayList<Friend> result =  cont.search(name);
				int count = result.size();
				
				if(count == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else if (count == 1) {
					cont.modify(result.get(0), tel);
				} else {
					System.out.println("������ ����ó�� ��ȣ�� �������ּ���.");
					for (int i = 0; i < result.size(); i++) {
						System.out.print(i+1+"��. ");
						System.out.println(result.get(i));
					}
					int idx = Integer.parseInt(sc.nextLine());
					cont.modify(result.get(idx-1), tel);
				}

//				cont.modify(name, tel);
			}break;
			
			case "9":{
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(0);
			}break;
				
			default: {
				System.out.println("�߸��� �Է��Դϴ�.");
			}break;
			}
			
		
		}
		
		
	}
}

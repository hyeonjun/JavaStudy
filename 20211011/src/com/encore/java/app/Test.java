package com.encore.java.app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		Contact cont = new Contact();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("================== 연락처 프로그램 ==================");
			System.out.println("1.연락처 추가 2.연락처 출력 3.연락처 검색 4.연락처 삭제 5.연락처 수정\n9.종료");
			System.out.print("메뉴를 선택해주세요: ");
			
			String menu = sc.nextLine();
//			if (menu.equals("1")) {
//				System.out.println("연락처 추가 작업");
//			} else if (menu.equals("9")) {
//				System.out.println("프로그램을 종료합니다...");
//				System.exit(0);
//			}
			
			switch(menu) {
			case "1": {
				System.out.println("이름과 전화번호를 입려하세요.\n예) 홍길동,01012345678");
				String[] input = sc.nextLine().split(",");
				Friend f = new Friend(input[0], input[1]);
				cont.add(f);
			}break;
			
			case "2": {
				cont.getInfo();
			}break;
			
			case "3":{
				System.out.print("검색할 이름 입력: ");
				String name = sc.nextLine();
				ArrayList<Friend> result = cont.search(name);
				if (result.isEmpty()) {
					System.out.println("검색 결과가 없습니다.");
				} else {
					for (int i = 0; i < result.size(); i++) {
						System.out.println(result.get(i));
					}
				}
			}break;
				
			case "4": {
				System.out.print("삭제할 이름 입력: ");
				String name =sc.nextLine();
				cont.delete(name);
			}break;
			
			case "5": {
				System.out.print("수정할 이름 입력: ");
				String name = sc.nextLine();
				System.out.print("새로운 전화번호 입력: ");
				String tel = sc.nextLine();
				
				ArrayList<Friend> result =  cont.search(name);
				int count = result.size();
				
				if(count == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else if (count == 1) {
					cont.modify(result.get(0), tel);
				} else {
					System.out.println("수정할 연락처의 번호를 선택해주세요.");
					for (int i = 0; i < result.size(); i++) {
						System.out.print(i+1+"번. ");
						System.out.println(result.get(i));
					}
					int idx = Integer.parseInt(sc.nextLine());
					cont.modify(result.get(idx-1), tel);
				}

//				cont.modify(name, tel);
			}break;
			
			case "9":{
				System.out.println("프로그램을 종료합니다...");
				System.exit(0);
			}break;
				
			default: {
				System.out.println("잘못된 입력입니다.");
			}break;
			}
			
		
		}
		
		
	}
}

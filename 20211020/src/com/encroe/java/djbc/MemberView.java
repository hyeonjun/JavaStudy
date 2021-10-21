package com.encroe.java.djbc;

import java.util.*;

public class MemberView {
	
	public static void main(String[] args) {
		MemberService service = new MemberService();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("============== 회원관리시스템 ==============");
			System.out.println("1.전체 회원정보 보기\n2.회원가입\n3.검색\n4.삭제\n9.종료");
			System.out.print("메뉴 선택 : ");
			String menu = sc.nextLine();
			
			if(menu.equals("1")) {
				ArrayList<MemberVO> list = service.getAllMember();
				MemberVO vo = null;
				System.out.println("ID\t비밀번호\t이름\t이메일");
				for (int i = 0; i < list.size(); i++) {
					vo = list.get(i);
//					System.out.println(vo.getId()+"\t"+vo.getPasswd()+"\t"+vo.getName()+"\t"+vo.getMail());
					System.out.println(vo.toString());
				}
			} else if(menu.equals("2")) {
				System.out.println("회원 정보를 입력해주세요.");
				System.out.print("ID: ");
				String id = sc.nextLine();
				System.out.print("PASSWD: ");
				String passwd = sc.nextLine();
				System.out.print("NAME: ");
				String name = sc.nextLine();
				System.out.print("MAIL: ");
				String mail = sc.nextLine();
				boolean result = service.memInsert(new MemberVO(id, passwd, name, mail));
				if (result) {
					System.out.println("등로되었습니다.");
				} else {
					System.out.println("이미 등록된 ID입니다.");
				}
			} else if(menu.equals("3")) {
				System.out.print("검색할 회원 ID를 입력 : ");
				String id = sc.nextLine();
				MemberVO vo = service.getMember(id);
				if(vo!=null) {
					System.out.println("ID\t비밀번호\t이름\t이메일");
					System.out.println(vo.toString());
				} else {
					System.out.println("등로된 ID가 없습니다.");
				}
			} else if(menu.equals("4")) {
				System.out.print("검색할 회원 ID를 입력 : ");
				String id = sc.nextLine();
				if(!service.memDelete(id))
					System.out.println("존재하지 않는 ID입니다.");
			}
			else if(menu.equals("9")) {
				System.exit(0);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
			
			
		}
	}

}

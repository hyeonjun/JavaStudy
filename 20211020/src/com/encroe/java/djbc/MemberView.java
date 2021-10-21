package com.encroe.java.djbc;

import java.util.*;

public class MemberView {
	
	public static void main(String[] args) {
		MemberService service = new MemberService();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("============== ȸ�������ý��� ==============");
			System.out.println("1.��ü ȸ������ ����\n2.ȸ������\n3.�˻�\n4.����\n9.����");
			System.out.print("�޴� ���� : ");
			String menu = sc.nextLine();
			
			if(menu.equals("1")) {
				ArrayList<MemberVO> list = service.getAllMember();
				MemberVO vo = null;
				System.out.println("ID\t��й�ȣ\t�̸�\t�̸���");
				for (int i = 0; i < list.size(); i++) {
					vo = list.get(i);
//					System.out.println(vo.getId()+"\t"+vo.getPasswd()+"\t"+vo.getName()+"\t"+vo.getMail());
					System.out.println(vo.toString());
				}
			} else if(menu.equals("2")) {
				System.out.println("ȸ�� ������ �Է����ּ���.");
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
					System.out.println("��εǾ����ϴ�.");
				} else {
					System.out.println("�̹� ��ϵ� ID�Դϴ�.");
				}
			} else if(menu.equals("3")) {
				System.out.print("�˻��� ȸ�� ID�� �Է� : ");
				String id = sc.nextLine();
				MemberVO vo = service.getMember(id);
				if(vo!=null) {
					System.out.println("ID\t��й�ȣ\t�̸�\t�̸���");
					System.out.println(vo.toString());
				} else {
					System.out.println("��ε� ID�� �����ϴ�.");
				}
			} else if(menu.equals("4")) {
				System.out.print("�˻��� ȸ�� ID�� �Է� : ");
				String id = sc.nextLine();
				if(!service.memDelete(id))
					System.out.println("�������� �ʴ� ID�Դϴ�.");
			}
			else if(menu.equals("9")) {
				System.exit(0);
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
			
			
		}
	}

}

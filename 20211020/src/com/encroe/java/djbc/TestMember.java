package com.encroe.java.djbc;

import java.util.ArrayList;

// MemberDAO �׽�Ʈ
public class TestMember {
	 static MemberDAO dao = new MemberDAO();
	
	static void selectAll() {
		ArrayList<MemberVO> voAll = dao.memberSelectAll();
		MemberVO vo = null;
		System.out.println("ID\t��й�ȣ\t�̸�\t�̸���");
		for (int i = 0; i < voAll.size(); i++) {
			vo = voAll.get(i);
			System.out.println(vo.getId()+"\t"+vo.getPasswd()+"\t"+vo.getName()+"\t"+vo.getMail());
		}
	}

	public static void main(String[] args) {
		dao = new MemberDAO();
		
		// ȸ�� �߰�
//		for (int i = 2; i <= 10; i++) {
//			MemberVO vo = new MemberVO("user0"+i,"1111","Amy","user0"+i+"@gamil.com");
//			dao.memberInsert(vo);
//		}
		
		// ȸ�� ID�� ��ȸ
//		MemberVO voS = dao.memberSelect("user011");
//		if(voS!=null) {
//			System.out.println(voS.toString());
//		} else {
//			System.out.println("�������� �ʴ� ID�Դϴ�.");
//		}
//		
		
		
//		MemberVO voUpd = new MemberVO("user02", "2222", "Scott", "user02@google.com");
//		dao.memberUpdate(voUpd);
//		
//		ArrayList<MemberVO> voAll = dao.memberSelectAll();
//		MemberVO vo = null;
//		System.out.println("ID\t��й�ȣ\t�̸�\t�̸���");
//		for (int i = 0; i < voAll.size(); i++) {
//			vo = voAll.get(i);
//			System.out.println(vo.getId()+"\t"+vo.getPasswd()+"\t"+vo.getName()+"\t"+vo.getMail());
//		}
		
		selectAll();
		dao.memberDelete("user01");
		selectAll();
		
		
		
	}

}

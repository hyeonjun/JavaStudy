package com.encroe.java.djbc;

// MemberDAO �׽�Ʈ
public class TestMember {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		// ȸ�� �߰�
//		for (int i = 2; i <= 10; i++) {
//			MemberVO vo = new MemberVO("user0"+i,"1111","Amy","user0"+i+"@gamil.com");
//			dao.memberInsert(vo);
//		}
		
		// ȸ�� ID�� ��ȸ
		MemberVO voS = dao.memberSelect("user011");
		if(voS!=null) {
			System.out.println(voS.toString());
		} else {
			System.out.println("�������� �ʴ� ID�Դϴ�.");
		}
		
		
	}

}

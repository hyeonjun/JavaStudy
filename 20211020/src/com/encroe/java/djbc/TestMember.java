package com.encroe.java.djbc;

// MemberDAO 테스트
public class TestMember {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		// 회원 추가
//		for (int i = 2; i <= 10; i++) {
//			MemberVO vo = new MemberVO("user0"+i,"1111","Amy","user0"+i+"@gamil.com");
//			dao.memberInsert(vo);
//		}
		
		// 회원 ID로 조회
		MemberVO voS = dao.memberSelect("user011");
		if(voS!=null) {
			System.out.println(voS.toString());
		} else {
			System.out.println("존재하지 않는 ID입니다.");
		}
		
		
	}

}

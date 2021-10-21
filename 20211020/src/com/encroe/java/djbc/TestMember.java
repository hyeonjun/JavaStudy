package com.encroe.java.djbc;

import java.util.ArrayList;

// MemberDAO 테스트
public class TestMember {
	 static MemberDAO dao = new MemberDAO();
	
	static void selectAll() {
		ArrayList<MemberVO> voAll = dao.memberSelectAll();
		MemberVO vo = null;
		System.out.println("ID\t비밀번호\t이름\t이메일");
		for (int i = 0; i < voAll.size(); i++) {
			vo = voAll.get(i);
			System.out.println(vo.getId()+"\t"+vo.getPasswd()+"\t"+vo.getName()+"\t"+vo.getMail());
		}
	}

	public static void main(String[] args) {
		dao = new MemberDAO();
		
		// 회원 추가
//		for (int i = 2; i <= 10; i++) {
//			MemberVO vo = new MemberVO("user0"+i,"1111","Amy","user0"+i+"@gamil.com");
//			dao.memberInsert(vo);
//		}
		
		// 회원 ID로 조회
//		MemberVO voS = dao.memberSelect("user011");
//		if(voS!=null) {
//			System.out.println(voS.toString());
//		} else {
//			System.out.println("존재하지 않는 ID입니다.");
//		}
//		
		
		
//		MemberVO voUpd = new MemberVO("user02", "2222", "Scott", "user02@google.com");
//		dao.memberUpdate(voUpd);
//		
//		ArrayList<MemberVO> voAll = dao.memberSelectAll();
//		MemberVO vo = null;
//		System.out.println("ID\t비밀번호\t이름\t이메일");
//		for (int i = 0; i < voAll.size(); i++) {
//			vo = voAll.get(i);
//			System.out.println(vo.getId()+"\t"+vo.getPasswd()+"\t"+vo.getName()+"\t"+vo.getMail());
//		}
		
		selectAll();
		dao.memberDelete("user01");
		selectAll();
		
		
		
	}

}

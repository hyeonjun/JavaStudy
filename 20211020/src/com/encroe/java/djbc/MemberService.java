package com.encroe.java.djbc;

import java.util.ArrayList;

// 회원에 관련된 CRUD 서비스 처리하는 객체
public class MemberService {
	MemberDAO dao = new MemberDAO();
	// 회원 가입
	public boolean memInsert(MemberVO vo) { // 올바른 id, passwd, name, mail인지 확인하는 전처리 작업도 넣어야함
		boolean flag = false;
		// 새로 가입하는 ID가 기존에 등록된 ID인지 여부 판단
		MemberVO check = dao.memberSelect(vo.getId());
		if(check==null){
			dao.memberInsert(vo);
			flag = true;
		}
		return flag;
	}
	
	// 특정 회원 정보 추출
	public MemberVO getMember(String id) {
		return dao.memberSelect(id);
	}
	
	// 모든 회원 정보 추출
	public ArrayList<MemberVO> getAllMember() {
		// 관리자 여부 판단
		return dao.memberSelectAll();
	}
	
	// 회원 정보 수정
	public void memUpdate(String id, String passwd, String name, String mail) {
		dao.memberUpdate(new MemberVO(id, passwd, name, mail));
	}
	
	// 회원 탈퇴
	public boolean memDelete(String id) {
		boolean result = false;
		MemberVO check = dao.memberSelect(id);
		if(check!=null) {
			dao.memberDelete(id);
			result = true;
		}
		return result;
	}
	
	

}

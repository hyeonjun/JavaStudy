package com.encroe.java.djbc;

import java.util.ArrayList;

// ȸ���� ���õ� CRUD ���� ó���ϴ� ��ü
public class MemberService {
	MemberDAO dao = new MemberDAO();
	// ȸ�� ����
	public boolean memInsert(MemberVO vo) { // �ùٸ� id, passwd, name, mail���� Ȯ���ϴ� ��ó�� �۾��� �־����
		boolean flag = false;
		// ���� �����ϴ� ID�� ������ ��ϵ� ID���� ���� �Ǵ�
		MemberVO check = dao.memberSelect(vo.getId());
		if(check==null){
			dao.memberInsert(vo);
			flag = true;
		}
		return flag;
	}
	
	// Ư�� ȸ�� ���� ����
	public MemberVO getMember(String id) {
		return dao.memberSelect(id);
	}
	
	// ��� ȸ�� ���� ����
	public ArrayList<MemberVO> getAllMember() {
		// ������ ���� �Ǵ�
		return dao.memberSelectAll();
	}
	
	// ȸ�� ���� ����
	public void memUpdate(String id, String passwd, String name, String mail) {
		dao.memberUpdate(new MemberVO(id, passwd, name, mail));
	}
	
	// ȸ�� Ż��
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

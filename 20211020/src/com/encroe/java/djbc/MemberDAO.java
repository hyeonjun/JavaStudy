package com.encroe.java.djbc;

import java.sql.*;

// Member ���̺� ������ ó�� ��ü
public class MemberDAO {
	//ȸ�� �߰�
	public void memberInsert(MemberVO vo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		try {
			String sql = "insert into member values(?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getId());
			pst.setString(2, vo.getPasswd());
			pst.setString(3, vo.getName());
			pst.setString(4, vo.getMail());
			
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtil.close(conn, pst);
		}
	}
	//ȸ�� ����
	public void memberUpdate() {
		
	}
	//ȸ�� ����
	public void memberRemove() {
		
	}
	//ȸ�� ID�� �˻�
	public MemberVO memberSelect(String id) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try {
			String sql = "select * from member where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setName(rs.getString(3));
				vo.setMail(rs.getString(4));
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtil.close(conn, pst, rs);
		}
		
		return vo;
	}
}

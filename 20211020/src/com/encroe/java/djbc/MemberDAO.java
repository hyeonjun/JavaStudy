package com.encroe.java.djbc;

import java.sql.*;
import java.util.ArrayList;

// Member 테이블 데이터 처리 객체
public class MemberDAO {
	//회원 추가
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
	//회원 수정
	public void memberUpdate(MemberVO vo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		try {
			String sql = "update member set passwd=?, name=?, mail=? where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getPasswd());
			pst.setString(2, vo.getName());
			pst.setString(3, vo.getMail());
			pst.setString(4, vo.getId());	
			pst.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtil.close(conn, pst);
		}
	}
	//회원 삭제
	public void memberDelete(String id) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		try {
			String sql = "delete from member where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);	
			pst.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			DBUtil.close(conn, pst);
		}
	}
	//회원 ID로 검색
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
	
	public ArrayList<MemberVO> memberSelectAll() {
		Connection conn = DBUtil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<>();
		MemberVO vo = null;
		try {
			String sql = "select * from member";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setName(rs.getString(3));
				vo.setMail(rs.getString(4));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			DBUtil.close(conn, st, rs);
			// TODO: handle finally clause
		}
		return list;
	}
}

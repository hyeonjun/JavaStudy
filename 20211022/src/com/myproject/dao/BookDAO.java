package com.myproject.dao;

import com.myproject.common.DBUtil;
import com.myproject.vo.BookVO;
import java.sql.*;
import java.util.ArrayList;

//DB의 Book 테이블에 관련 기능을 구현한 객체 
public class BookDAO {

	// 추가
	public void bookInsert(BookVO vo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("insert into book values(book_seq.nextval, ?,?,?)");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getAuthor());
			pstmt.setString(3, vo.getPublisher());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt);
		}
	}

	// 삭제
	public void bookDelete(int no) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("delete from book where no=?");
			pstmt.setInt(1, no);

			pstmt.executeUpdate(); // 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt);
		}
	}

	// 수정
	public void bookUpdate(BookVO vo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {

			pstmt = conn.prepareStatement("update book set title=?, author=?, publisher=? where no=?");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getAuthor());
			pstmt.setString(3, vo.getPublisher());
			pstmt.setInt(4, vo.getNo());

			pstmt.executeUpdate(); // 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt);
		}
	}

	// 검색 (1:제목, 2:작가, 3:출판사)
	public ArrayList<BookVO> getBook(String keyword, int type) {
		Connection conn = DBUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<BookVO> list = new ArrayList<>();
		try {
			String sql1 = "select * from book where ";
			String sql2 = null;
			if (type == 1)
				sql2 = "title=";
			else if (type == 2)
				sql2 = "author=";
			else if (type == 3)
				sql2 = "publisher=";
			String sql = sql1 + sql2 + "'" + keyword + "'";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // 실행

			while (rs.next()) {
				BookVO vo = new BookVO(rs.getInt("no"), rs.getString("title"), rs.getString("author"),
						rs.getString("publisher"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, stmt, rs);
		}

		return list;
	}

	public ArrayList<BookVO> getList() {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BookVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement("select * from book order by no");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BookVO vo = new BookVO(rs.getInt("no"), rs.getString("title"), rs.getString("author"),
						rs.getString("publisher"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

		return list;
	}
	
	// 제목, 저자가 동일한 책이 있는 여부를 판단 
	public boolean title_author_exist(BookVO vo){
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement("select * from book where title=? and author=?");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getAuthor());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		
		return flag;
	}

	//책 제목을 검색
	public ArrayList<BookVO> getBook(String keyword) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BookVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement("select * from book where title=?");
			pstmt.setString(1, keyword);
			
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BookVO vo = new BookVO(rs.getInt("no"), rs.getString("title"), rs.getString("author"),
						rs.getString("publisher"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

		return list;
	}	
	
	
	
}






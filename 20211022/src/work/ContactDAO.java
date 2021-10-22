package work;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContactDAO {
	
	// 추가
	public void Insert(ContactVO vo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement("insert into contact values(contact_seq.nextval, ?, ?)");
			pst.setString(1, vo.getName());
			pst.setString(2, vo.getTel());
			pst.executeQuery();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pst);
		}
		
		
	}
	// 삭제
	public void Delete(int no) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement("delete from contact where no=?");
			pst.setInt(1, no);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pst);
		}
	}
	
	// 수정
	public void Update(ContactVO vo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement("update contact set name=?, tel=? where no=?");
			pst.setString(1, vo.getName());
			pst.setString(2, vo.getTel());
			pst.setInt(3, vo.getNo());
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pst);
		}
	}
	
	// 검색
	public ArrayList<ContactVO> Select(String keyword) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<ContactVO> list = new ArrayList<ContactVO>();
		try {
			pst = conn.prepareStatement("select * from contact where name like ? or tel like ?");
			pst.setString(1, "%"+keyword+"%");
			pst.setString(2, "%"+keyword+"%");
			rs = pst.executeQuery();
			
			while(rs.next()) {
				ContactVO vo = new ContactVO(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(vo);
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pst, rs);
		}
		return list;
	}
	
	public ArrayList<ContactVO> Select(int no) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<ContactVO> list = new ArrayList<ContactVO>();
		try {
			pst = conn.prepareStatement("select * from contact where no = ?");
			pst.setInt(1, no);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				ContactVO vo = new ContactVO(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(vo);
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pst, rs);
		}
		return list;
	}
	
	public boolean tel_Exist(ContactVO vo) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			pst = conn.prepareStatement("select * from contact where tel = ?");
			pst.setString(1, vo.getTel());
			rs = pst.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(2));
				flag = true;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pst, rs);
		}
		return flag;
	}
	
	public ArrayList<ContactVO> getAll(){
		Connection conn = DBUtil.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<ContactVO> list = new ArrayList<ContactVO>();
		try {
			pst = conn.prepareStatement("select * from contact order by no");
			rs = pst.executeQuery();
			
			while(rs.next()){
				ContactVO vo = new ContactVO(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pst, rs);
		}
		return list;
	}
	
}

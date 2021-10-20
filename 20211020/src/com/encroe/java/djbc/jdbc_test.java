package com.encroe.java.djbc;
import java.sql.*;

public class jdbc_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String sql = "select * from employees";
		String sql = "create table test(id varchar2(10), pwd varchar2(10))";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Load Success");
//			conn = DriverManager.getConnection(url, "hr", "hr");
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB Connection Sucesss");
			
			st = conn.createStatement();
//			st.executeUpdate(sql);
//			st.executeUpdate("insert into test values('aa', '11')");
//			st.executeUpdate("insert into test values('bb', '22')");
//			st.executeUpdate("insert into test values('cc', '33')");
			
			String id = "dd";
			String pwd = "44";
//			String sql2 = "insert into test values('"+id+"','"+pwd+"')"; // 유지보수 떨어지고, 실수할 확률이 높다.
//			st.executeUpdate(sql2); -> 위 sql문을 사용할 때는 PreparedStatement를 사용하는 게 낫다
			
			pst = conn.prepareStatement("insert into test values(?, ?)");
			pst.setString(1, id);
			pst.setString(2, pwd);
			pst.executeUpdate();
			
			rs = st.executeQuery("select * from test");
			
			while(rs.next()) {
				String id_ = rs.getString(1); // 1번째 컬럼 조회
				String pwd_ = rs.getString("pwd"); // 컬럼 이름으로 조회
				System.out.println(id_+"\t"+pwd_);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(pst!=null) pst.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
	}

}

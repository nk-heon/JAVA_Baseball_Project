package Ex0730_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//데이터 베이스 접속 및 쿼리문 전송을 위한 클래스
//DAO(Data Access Object)

public class TestDAO {
	
	Connection con = null;
	// 쿼리문 실행을 위해 사용되는 클래스
	PreparedStatement pstmt = null;
	// 쿼리문 실행결과 저장용으로 사용되는 클래스
	ResultSet rs = null;
	
	// DB 접속을 위한 메소드
	public void dbConnection() {
		// static 메소드는 클래스 이름으로 직접 접근 가능
		con = DBConnection.makeConnection();
	}
	
	// CUSTOMER 테이블 전체 조회 메소드
	public void selectALL() {
		// 실행할 쿼리문을 미리 변수로 선언
		String sql = "SELECT * FROM CUSTOMER";
		try {
			// Connection 클래스에서 제공하는
			// preparedStatement 메소드를 활용하여
			// 쿼리문 전솔할 준비
			pstmt = con.prepareStatement(sql);
			// 쿼리문 실행하여 실행 결과를 rs에 저장
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("CUSTID"));
			    System.out.println(rs.getString("NAME"));
			    System.out.println(rs.getString("ADDRESS"));
			    System.out.println(rs.getString("PHONE"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void insertCustomer(CustomerDTO customerDTO) {
		String sql = "INSERT INTO CUSTOMER(CUSTID,NAME,ADDRESS,PHONE)"
				+ "VALUES(SEQ_CUSTID.NEXTVAL,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, 10);
			pstmt.setString(1, customerDTO.getName());
			pstmt.setNString(2, customerDTO.getAddress());
			pstmt.setNString(3, customerDTO.getPhone());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

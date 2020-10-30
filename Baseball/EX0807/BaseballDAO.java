package EX0807;

import java.sql.*;
import java.util.Random;


public class BaseballDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet re = null;
	
	public void DBConnection() {
		con = DBConnection.makeConnection();
	}

	public boolean hittername(BaseballDTO baseball) {
		String sql = "INSERT INTO BASEBALL(PLAYERNUMBER,PLAYERNAME)"
				+"VALUES(SEQ_BASEBALL.NEXTVAL,?)";
		
		boolean insertResult = false;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, baseball.getPlayername());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				insertResult = true;
			} else {
				insertResult = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult;
	}

	public void totalRetrun(BaseballDTO baseball) {
		String sql = "UPDATE BASEBALL SET HOMERUN = ?, FOUL = ?,BINGLE = ?,BALL = ?,STRIKE = ?,FLYOUT = ? WHERE PLAYERNAME = ?" ;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, baseball.getHomerun());
			pstmt.setInt(2, baseball.getFoul());
			pstmt.setInt(3, baseball.getBingle());
			pstmt.setInt(4, baseball.getBall());
			pstmt.setInt(5, baseball.getStrike());
			pstmt.setInt(6, baseball.getFlyout());
			pstmt.setString(7, baseball.getPlayername());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

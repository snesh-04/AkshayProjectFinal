package dio;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.AddAttendence;


public class AttendenceDio {

	private Connection conn;

	public AttendenceDio(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean Attendence(AddAttendence attandence) {
		
		boolean f = false;
		
		try {
			
			String sql = "INSERT INTO Attendence(date,staffer,status) VALUES(?,?,?)";

			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, attandence.getDate());
			pstm.setString(2, attandence.getStaffer());
			pstm.setString(3, attandence.getStatus());
			
			int execute = pstm.executeUpdate();
			if( execute == 1) {
				f= true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return f;
	}
}

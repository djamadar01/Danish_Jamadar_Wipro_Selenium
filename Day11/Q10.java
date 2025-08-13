//Write a program to display all students whose percentage is greater than 75 using JDBC and SQL WHERE clause.
package assingment11;

import java.sql.*;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = Q1.getConnection()){
			PreparedStatement pst = con.prepareStatement("SELECT * FROM Student WHERE percentage > 75");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) System.out.println(rs.getString(2) + " " + rs.getFloat(3));

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}



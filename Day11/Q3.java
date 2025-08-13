//Write a JDBC program to fetch and display all student records from the database
package assingment11;

import java.sql.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = Q1.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from student")) {
			System.out.println("ID\tName\tPercentage");
				while(rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}



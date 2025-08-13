//Create a JDBC-based program to count the total number of rows in a table.
package assingment11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = Q1.getConnection()){
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Student");
			if (rs.next()) System.out.println("Total rows: " + rs.getInt(1));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}



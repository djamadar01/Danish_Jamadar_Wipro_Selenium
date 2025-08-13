//9.	Develop a program to sort student data in ascending order by name using SQL in JDBC.
package assingment11;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = Q1.getConnection()){
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Student ORDER BY name ASC");
			while (rs.next()) System.out.println(rs.getString(2));

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}


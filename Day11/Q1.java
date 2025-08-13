//Write a Java program to connect to a MySQL database using JDBC.
package assingment11;

import java.sql.Connection;
import java.sql.DriverManager;

public class Q1 {
	public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "root");
    }
}

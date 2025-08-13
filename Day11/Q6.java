//Write a Java program to delete a student record from the database using JDBC.
package assingment11;

import java.sql.*;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = Q1.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();

            PreparedStatement pst = con.prepareStatement("DELETE FROM Student WHERE id = ?");
            pst.setInt(1, id);
            int rows = pst.executeUpdate();
            System.out.println(rows + " row deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}

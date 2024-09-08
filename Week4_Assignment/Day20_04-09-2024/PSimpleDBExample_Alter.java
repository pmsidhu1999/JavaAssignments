package com.mydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PSimpleDBExample_Alter {

	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/sept2",
				"root", "pass@word1");

			// mydb is database
			// mydbuser is name of database
			// mydbuser is password of database
			
			//SQL Injection
			
			PreparedStatement ps = connection.prepareStatement("update messages set ptype =? where ptype = ?");
			
			//(1,I) means 1 s the sequel no: and the "I" is the new value
			//(2, internal) means 2 is the sequel no: internal is the old value that need to be changed.
			
			ps.setString(1, "I");
			ps.setString(2, "Internal");
			
			int nrecs = ps.executeUpdate();
			
			System.out.println("Replaced "+ nrecs+" records with I");
			
			ps.setString(1, "E");
			ps.setString(2, "External");
			
			 nrecs = ps.executeUpdate();
			
			System.out.println("Replaced "+ nrecs+" records with E");
			
			ps.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends
} // class ends

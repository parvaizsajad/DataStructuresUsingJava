package ddd;

import java.sql.*;

public class dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/techblog";
		String username="root";
		String password ="";

		try{
		    Class.forName("com.mysql.cj.jdbc.Driver"); //setting classname of JDBC Driver
		    Connection con = DriverManager.getConnection(URL, username, password);
		    System.out.println(con);
		} catch(Exception ex){
		  System.out.println("Error Connecting to Database: "+ex);
		}


	}

}

package com.practice.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class practiceJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rakesh","root","Welcome1");
			Statement smt=con.createStatement();
			//smt.executeUpdate("insert into students values(1112,'sai',7890768,'knr')");
			smt.executeUpdate("insert into students values(1113,'sai kumar',7890768,'knr')");
			ResultSet re=smt.executeQuery("select * from Students");
			while(re.next())
				System.out.println(re.getInt(1)+","+re.getString(2)+" "+re.getLong(3)+" "+re.getString(4)); 
			
			System.out.println("hai rakesh.....");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

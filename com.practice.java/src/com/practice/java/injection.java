package com.practice.java;
import java.sql.*;
import java.io.*;

public class injection {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				
				InputStreamReader i=new InputStreamReader(System.in);
				BufferedReader b=new BufferedReader(i);
				
				System.out.println("please enter your rollNo:");
				String rollNo=b.readLine();
				
				System.out.println("please enter your name:");
				String name=b.readLine();
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","Welcome1");
				
				Statement smt=con.createStatement();
				
				String qry="insert into clss values("+rollNo+",'"+name+"')";
				System.out.println("our query is:"+qry);
				smt.executeUpdate(qry);
				System.out.println("hai rakesh.....");
				con.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}

		}

	}



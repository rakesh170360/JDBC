package com.practice.java;
import java.sql.*;
import java.io.*;

public class bankbalance {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {	
					InputStreamReader i=new InputStreamReader(System.in);
					BufferedReader b=new BufferedReader(i);
					
					System.out.println("please enter your username:");
					String uname=b.readLine();
					
					System.out.println("please enter your password:");
					String psw=b.readLine();
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","Welcome1");
					
					Statement smt=con.createStatement();
					
					String qry="select balance from bankbalance where username='"+uname+"' and password='"+psw+"'";
					System.out.println("our query is:"+qry);
					ResultSet re=smt.executeQuery(qry);
					if (re.next()) {
						System.out.println("balance is:"+re.getDouble(1));
					}
					else{
						System.out.println("invalid credentials... ");
					}
					System.out.println("hai rakesh.....");
					con.close();
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}






package Abhinav;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class helperrr{
	static int inputint(String a){
		System.out.println("Enter "+ a+ ": ");
		return new Scanner(System.in).nextInt();
	}
	static String inputString(String a) {
		System.out.println("Enter "+ a+ ": ");
		return new Scanner(System.in).nextLine();
	}
}
class Student{
	int roll, age;
	String name, branch;
	public Student() {
		name= helperrr.inputString("name");
		roll= helperrr.inputint("roll no");
		branch= helperrr.inputString("branch");
	}
}

public class jdbcStudent {
	public static void main(String args[]) {
		Connection con= DataBaseConnector.getconnection();
	}
}


class DataBaseConnector {
	public static Connection getconnection() {
		Connection con= null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost//test","root","");
			System.out.println("connection successful");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
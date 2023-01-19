package jdbc_01;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabase {
	public static void main(String[] args) throws SQLException {
		   
	//step1: create an instance for driver
	//Driver should be imported from com.sql.cj.jdbc.Driver
	//new Driver() throws SQL Exception
	Driver dbDriver=new Driver();
	
	//Step2: Register to the dbDriver 
	//DriverManager is in java.sql package
	DriverManager.registerDriver(dbDriver);
	
	//Step3:Establish database connection
	//connection should be imported from java.sql package
	Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil","root", "root");
	
	//Step4:create statement
	//statement should be imported from java.sql package
	Statement statement =connect.createStatement();
	
	//Step5:Execute query to fetch data
	ResultSet result = statement.executeQuery("select * from students;");
	while(result.next()) {
		System.out.println(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getString("address"));
	}
	//close database
	connect.close();
}
}
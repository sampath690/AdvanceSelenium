package jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class WriteDataFromDatabase {
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
		int result = statement.executeUpdate("insert into students(id,name,address) values (05, 'darshan', 'chikbalapur');");
		if(result==1) {
			System.out.println("DB Updated Sucessfully");
		}
		else {
			System.out.println("DB not Updated Sucessfully");
		}
		
}
}

package databasemysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseconnectionExp
{
public Connection getConnection()
{
	Connection conn = null;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","system123");
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return conn;
	}
	}

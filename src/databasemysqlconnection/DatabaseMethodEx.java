package databasemysqlconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMethodEx {

	public void createmethod(int id,String name,int age,int sal)
	{
		DatabaseconnectionExp connection = new DatabaseconnectionExp();
		Connection conn = connection.getConnection();
		try 
		{
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into student value('"+id+"','"+name+"','"+age+"','"+sal+"')");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			}
			catch(SQLException e)
			{
			e.printStackTrace();
			}
			}
		    }
	public int checkExistence(int id) 
	{
		DatabaseconnectionExp connection = new DatabaseconnectionExp();
		Connection conn=connection.getConnection();
		ResultSet rs = null;
		int count = 0;
		try {
			Statement stmt = conn.createStatement();
			String sql;
			sql = "select * FROM student WHERE stud_id ='"+id +"'";
			rs = stmt.executeQuery(sql);
			if(rs.next())
			{
				count = count + 1 ;
				return count;
			}
			/* return count; */
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return 0;
		
	}
	/**
	 *  if(rs.last()) {
		   count = + rs.getRow();
	   }
	 */
	
	public void selectmethod()
	{
		DatabaseconnectionExp connection = new DatabaseconnectionExp();
		Connection conn=connection.getConnection();
		try {
			Statement stmt = conn.createStatement();			
			/* String sql; */
			
		String sql= "Select * FROM student";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.print(rs.getString("stud_id")+" ");
				System.out.print(rs.getString("stud_name")+" ");
				System.out.print(rs.getString("stud_age")+" ");
				System.out.println(rs.getString("stud_sal")+" ");
			}
		//	System.out.println(rs);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public void updatemethod(int id,String name,int age,int sal)
	{
		DatabaseconnectionExp connection = new DatabaseconnectionExp();
		Connection conn=connection.getConnection();
		try {
			Statement stmt = conn.createStatement();
			String sql;
			
sql="Update EMPLOYEE.student set stud_name= '"+name+"', stud_age= '"+age+"',stud_sal= '"+sal+"' where stud_id = '"+id +"'";
	 stmt.executeUpdate(sql);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		}
	
	public void deletemethod(int id)
	{
		DatabaseconnectionExp connection = new DatabaseconnectionExp();
		Connection conn=connection.getConnection();
		try {
			Statement stmt = conn.createStatement();
			String sql;
			sql = "DELETE FROM student WHERE stud_id='"+id +"'";
			if(stmt.executeUpdate(sql)==1)
			{
				System.out.println("successfully deleted..");
			}
			else {
				System.out.println(" ");
				System.out.println("id is not found..");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}		
		
	}
	public void systemexit()
	{
		int choice=5;
		if(choice==5)
		{
			System.out.println("system exit");
			System.exit(0);
		}
	}
}

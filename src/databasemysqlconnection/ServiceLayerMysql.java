package databasemysqlconnection;

public class ServiceLayerMysql {
	
	public void callcreatmethod()
	{
		//DatabaseMethodEx var1 = new DatabaseMethodEx();
		DatabaseMethodCallEx var2 = new DatabaseMethodCallEx();
		var2.main();
		
		//var1.createmethod(id, name, age, sal);
	}
	public void callselectmethod()
	{
		DatabaseMethodCallEx var2 = new DatabaseMethodCallEx();
		var2.main();		
	}
	public void callupdatemethod()
	{
		DatabaseMethodCallEx var2 = new DatabaseMethodCallEx();
		var2.main();	
	}
	public void calldeletemethod()
	{
		DatabaseMethodCallEx var2 = new DatabaseMethodCallEx();
		var2.main();
	}
	public void systemexit()
	{
		DatabaseMethodCallEx var2 = new DatabaseMethodCallEx();
		var2.main();
	}
	
	public static void main(String[] args) 
	{
		ServiceLayerMysql var = new ServiceLayerMysql();
		var.callcreatmethod();
	var.callselectmethod();
	var.callupdatemethod();
	var.calldeletemethod();
	}
}

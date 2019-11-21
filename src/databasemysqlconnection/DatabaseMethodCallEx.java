package databasemysqlconnection;

import java.util.Scanner;

public class DatabaseMethodCallEx {

	//public static void main(String[] args) 
	public void main()
	{
		DatabaseMethodEx ref = new DatabaseMethodEx();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("press 1 for perform create method ");
			System.out.println("press 2 for perform select method ");
			System.out.println("press 3 for perform update method ");
			System.out.println("press 4 for perform delete method ");
			System.out.println("press 5 for System exit method ");
            System.out.println("choose ur choices");
			 choice = sc.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("plz enter student id.");
				int id=sc.nextInt();
				System.out.println("plz enter student name.");
				String name = sc.next();
				System.out.println("plz enter student age.");
				int age = sc.nextInt();
				System.out.println("plz enter student sal.");
				int sal = sc.nextInt();
				
				ref.createmethod(id,name,age,sal);
				
				System.out.println("  ");
				System.out.println("  ");
				break;
				
			case 2:
				
				ref.selectmethod();
				System.out.println("  ");
				System.out.println("  ");
				break;
				
			case 3:
				System.out.println("plz enter student id.");
				int stud_id = sc.nextInt();
				if(ref.checkExistence(stud_id)>0)
				{
				System.out.println("plz enter student name.");
				String stud_name = sc.next();
				System.out.println("plz enter student age.");
				int stud_age = sc.nextInt();
				System.out.println("plz enter student sal.");
				int stud_sal = sc.nextInt();
				
				ref.updatemethod(stud_id,stud_name,stud_age,stud_sal);
				System.out.println("  ");
				System.out.println("  ");
				}
				else {
					System.out.println(" ");
					System.out.println("id is not found.. ");
					System.out.println(" ");
				}
				break;
			case 4:
				System.out.println("plz enter student id.");
				int std_id=sc.nextInt();
				ref.deletemethod(std_id);
				System.out.println("  ");
				System.out.println("  ");
				break;
				
			case 5:
				ref.systemexit();
				System.out.println("  ");
				System.out.println("  ");
				default:
					System.out.println("  ");
					System.out.println("wrong choice..");
					System.out.println("  ");
					
				}		
		}while(choice!=5);
		}
	}

import java.util.Scanner;

 class Student {
  static String name,Dep_name,Clg_name;
 static int Roll_no;
 static Scanner sc=new Scanner(System.in);
 Student()
 {
	    
		System.out.println("Enter the Student Name:");
		name=sc.next();
		System.out.println("Enter the Student Rollnumber:");
		Roll_no=sc.nextInt();
		System.out.println("Enter the Student College Name:");
		Clg_name=sc.next();
		System.out.println("Enter the Student Department Name:");
		Dep_name=sc.next();
  }
 
 
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println("enter the option ");
		int Rank;
	     System.out.println("enter the college Rank:");
		 Rank=sc.nextInt();
		 switch(Rank)
			{
			case 1:
			{
				System.out.println("Indian institude of Techology,Madras");
				break;
			}
			case 2:
			{
				System.out.println("Anna University");
				break;
			}
			case 3:
			{
				System.out.println("Panimalar Engineering College");
				break;	
			}
			case 4:
			{
				System.out.println("Saveetha Engineering College");
				break;		
			}
			case 5:
			{
				System.out.println("Adhiparasakthi Engineering College");
				break;	
			}
			default :
			{
				System.out.println("Press Right number");
				break;
			}
			

		}

			
		
		
		
		
		
		
	}

}

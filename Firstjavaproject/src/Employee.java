import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Loginpage
{
	public void Check()
	{
String Username,Password;
Scanner s=new Scanner(System.in);
System.out.println("Enter the user name:");
Username=s.next();
System.out.println("Enter the password:");
Password=s.next();
System.out.println("\t\t******************************************");
System.out.println("\t\t\t  EMPLOYEE MANAGEMENT SYSTEM");
System.out.println("\t\t******************************************");
System.out.println("\t\t\t   ----------------------------");
System.out.println("\t\t\t     WELCOME TO ABC COMPANY");
System.out.println("\t\t\t   ----------------------------");

	}
	

}
 class EmployeeEx {
	private int emp_Id,salary;
	private String emp_name,email,position,contact;
	EmployeeEx(int  emp_Id,String emp_name,String email,String position ,int salary,String contact)
	{
		this.emp_Id=emp_Id;
		this.emp_name=emp_name;
		this.email=email;
		this.position=position;
		this.salary=salary;
		this.contact=contact;
		
	}
	public int getemp_Id()
	{
		return emp_Id;
	}
	public String getemp_name()
	{
		return emp_name;
	}
	public String getemail()
	{
		return email;
	}
	public String getposition()
	{
		return position;
	}
	public int getsalary()
	{
		return salary;
	}
	public String getcontact(){
		return contact;
	}
	public String toString(){
		return emp_Id+" "+emp_name+" "+email+" "+position+" "+salary+" "+contact;
	}
	}
public class Employee{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loginpage p=new Loginpage();
		p.Check();
		ArrayList<EmployeeEx> e=new ArrayList<EmployeeEx>();
		
		
	/*	Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		int ch;
		do{
			
		System.out.println("1.Add Employee details:");
		System.out.println("2.Display Employee details:");
		System.out.println("3.Search Employee details:");
		System.out.println("4.Delete Employee details:");
		System.out.println("5.Update Employee details:");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch){
			case 1:
				System.out.print("Enter the employee ID:");
				int emp_Id=sc.nextInt();
				System.out.println("Enter the employee Name:");
				String emp_name=sc1.next();
				System.out.print("Enter the employee email:");
				String email=sc1.next();
				System.out.print("Enter the employee Position:");
				String position=sc1.next();
				System.out.print("Enter the employee Salary:");
				int salary=sc1.nextInt();
				System.out.println("Enter the employee contact Number:");
				String contact=sc.next();
			    e.add(new EmployeeEx(emp_Id,emp_name,email,position,salary,contact));
		        break;	
		        
			case 2:
				System.out.println("--------------------------------");
				Iterator<EmployeeEx> i= e.iterator();
				while(i.hasNext())
				{
					EmployeeEx ex=i.next();
					System.out.println(ex);
				}
				System.out.println("--------------------------------");
				break;
				
			case 3:
				boolean found =false;
				System.out.println("Enter the Employee Id to search :");
				emp_Id=sc.nextInt();
				System.out.println("--------------------------------");
				i=e.iterator();
				while(i.hasNext())
				{
					EmployeeEx ex=i.next();
					if(ex.getemp_Id()==emp_Id)
						{
						System.out.println(ex);
				found =true;
						}
					}
			
				if(!found){
					System.out.println("Record not found");
				}
				System.out.println("--------------------------------");
				break;
			case 4:
				found =false;
				System.out.println("Enter the Employee Id to Delete :");
				emp_Id=sc.nextInt();
				System.out.println("--------------------------------");
				i=e.iterator();
				while(i.hasNext())
				{
					EmployeeEx ex=i.next();
					if(ex.getemp_Id()==emp_Id)
						{
						System.out.println(ex);
						i.remove();
				        found =true;
						}
					}
			
				if(!found){
					System.out.println("Record not found");
				}
				else{
					System.out.println("Employee Record is Deleted Successfully");	
				}
				System.out.println("--------------------------------");
				break;
			case 5:
				found =false;
				System.out.println("Enter the Employee Id to Update :");
				emp_Id=sc.nextInt();
				ListIterator<EmployeeEx>l=e.listIterator();
				i=e.iterator();
				while(l.hasNext())
				{
					EmployeeEx ex=l.next();
					if(ex.getemp_Id()==emp_Id)
						{
						System.out.println(ex);
					System.out.println("Enter new Name:");
					emp_name=sc1.next();
					System.out.println("Enter new salary:");
					salary=sc.nextInt();
					System.out.println("Enter new email:");
					email=sc1.next();
					System.out.println("Enter new position:");
					position=sc1.next();
					System.out.println("Enter new contact:");
					contact=sc1.next();
					l.set(new EmployeeEx( emp_Id, emp_name,email, position, salary, contact));
				        found =true;
						}
					}
			
				if(!found){
					System.out.println("Record not found");
				}
				else{
					System.out.println("Employee Record is  Updated Successfully");	
				}
			
				break;
				
		}
		}while(ch!=0);*/

	}

}

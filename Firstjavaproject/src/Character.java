import java.util.Scanner;
public class Character {
	public static void main(String [] arg)
	{
		char firstname,middlename,lastname;
		System.out.println("enter the charatername fistname,middlename,lastname:");
		Scanner sc=new Scanner(System.in);
		firstname=sc.next().charAt(0);
		middlename=sc.next().charAt(0);
		lastname=sc.next().charAt(0);
		System.out.println("The fistname "+firstname+"middlename"+middlename+lastname);
		
		
	}

}

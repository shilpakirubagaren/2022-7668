import java.util.Scanner;

public class FirstnameLastname {

	public static void stringconcat(String firstname, String middlename, String lastname){
		
		System.out.println(firstname+middlename+lastname);
	}
	public static void main(String [] arg){
		
		String firstname, middlename,lastname;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the firstname:");
		firstname=scanner.nextLine();
		System.out.println("Enter the middlename:");
		middlename=scanner.nextLine();
		System.out.println("Enter the lastname:");
		lastname=scanner.nextLine();
		stringconcat(firstname,middlename,lastname);
	}
}

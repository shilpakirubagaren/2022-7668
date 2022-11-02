import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		if(number>=0 && number<=100)//45>=0 && 45<=100 
		{
			System.out.println("no.is. btwn 0 to 100");
		}else
		{
			System.out.println("no.is. not btwn 0 to 100");
		}
		
		System.out.println("end of testing");
	
	}
}

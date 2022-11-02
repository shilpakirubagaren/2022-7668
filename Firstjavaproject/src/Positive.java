import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		int number;
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		
		/*if(number>=0)
		{
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
	*/
		if(number%5==0)
		{
			System.out.println("Multiple of 5");
		}
	
	else
	{
		
		System.out.println(" not Multiple of 5");
	}
	

}
}
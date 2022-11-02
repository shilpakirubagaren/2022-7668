import java.util.Scanner;
public class Arraydanamicruntime {
	
public static void main(String [] arg)
{
	double[] salaryref=new double[5];
	System.out.println("List the array:");
	Scanner scanner=new Scanner(System.in);
	salaryref[0]=scanner.nextDouble();
	salaryref[1]=scanner.nextDouble();
	salaryref[2]=scanner.nextDouble();
	salaryref[3]=scanner.nextDouble();
	salaryref[4]=scanner.nextDouble();
	System.out.println(salaryref[0]+""+salaryref[1]+""+salaryref[2]+""+salaryref[3]+""+salaryref[4]);
salaryref=new double[3];
System.out.println("List the array again:");
salaryref[0]=scanner.nextDouble();
salaryref[1]=scanner.nextDouble();
salaryref[2]=scanner.nextDouble();
System.out.println(salaryref[0]+""+salaryref[1]+""+salaryref[2]);
}

}

package Packgeone;
// write a program that prompt the user to input a positive integer .
//it should then output a message indicating whether the number is a prime number
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=33;
	    int	i=2;
		boolean result=false;
		while(i<=num/2)
		{
			// condition for not prime number here
		if(num%i==0)
		{
			result=true;
			break;
			}
		i++;
	}
	if(!result)
	{
		System.out.println("The number is prime number "+num);
	}
	else
	{
		System.out.println("The number is  not prime number "+num);
	}
	}
	}



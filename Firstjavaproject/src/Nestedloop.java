
public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                                             //print 1 2 3 4
		for(int j=1;j<=10 ; j++)//j=1  1<=10 true
			//j=2  2<=10 true //j=4 4<=10 true
			//j=3 3<10  true
		{
			for(int i=1; i<=10;i++) //i=1 1<=3 true
			{
				System.out.print(i*j);// 1 2  3 
			}
			
			System.out.println();
		}
		
	}




	}



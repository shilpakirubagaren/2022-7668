
public class StaticVariableEx {
		
		static int annualAmount=0;//static variable
		String name;//instance 
		
		public void payAmount(int amount)
		{
			annualAmount=annualAmount+amount;
		}
		public void displayAmount()
		{
			System.out.println(annualAmount);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	StaticVariableEx geetha=new StaticVariableEx();
	geetha.payAmount(200);
	geetha.displayAmount();

	StaticVariableEx raveena=new StaticVariableEx();
	raveena.payAmount(300);
	raveena.displayAmount();



		}

	}



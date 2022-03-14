package oops;
import java.util.ArrayList;

public class a2q3
{
	class CurrentAccount extends a2q3
	{
		int totalDeposits = 10000;
	    int creditLimit = 2000;
	    public int getCash()
	    {System.out.println(totalDeposits+creditLimit);
	    return creditLimit;
	    }
	}
	class SavingsAccount extends a2q3
	{
	 int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    public int getCash() 
    {
    	System.out.println(totalDeposits+fixedDepositAmount);
    	return fixedDepositAmount;	
    }	
    }
	public static int totalCashInBank(ArrayList<Integer> cash)
	{
		int sum=0;
		for(int i=1;i<=cash.size()-1;i++)
		{
			sum=+cash.get(i);
		}
		return 0;
	}
	public int getCash()
	{
		return 0;
	}
	

	public static void main(String[] args) {
		{
			ArrayList<Integer> cash=new ArrayList<>();
			 a2q3 s=new a2q3();
			 CurrentAccount obj1=s.new CurrentAccount();
			 SavingsAccount obj2=s.new SavingsAccount();
			 cash.add(obj1.getCash());
			 cash.add(obj2.getCash());
			 System.out.println(totalCashInBank(cash));
		

		}
	}

}

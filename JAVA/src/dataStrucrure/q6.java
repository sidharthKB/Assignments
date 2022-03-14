package dataStrucrure;
import java.util.Scanner;

class q6 
{
	String userid="Ajay",passworD="password";
	public String loginUser(String user,String pass)
	{
		int attempts=3;
		if(attempts!=0)
		{
			if(userid==user&&passworD==pass)
					{
	
					System.out.println("welcome Ajay");
					}
			else
			{
				System.out.println("you have entered wrong credentials,please enter the right credentials");
			}
	}
          else
{
	System.out.println("Contact admin");
	
   }
   return pass;
}
	 

   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   String userId=sc.next();
	   String password=sc.next();
	   q6 obj=new q6();
	   obj.loginUser(userId,password);
   }
   }
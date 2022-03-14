package exceptionhandling;
import java.util.Scanner;
public class q1 
{
	public static void main(String[] args)
	{
		try {
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int output=num1/num2;
			System.out.println("Result:"+output);
			
		}
		catch(ArithmeticException e) {
			System.out.println("You shouldn't divide a number by zero");
		}
	}
}



package oops;

abstract class vehicle
{
	abstract void start();
	{
		System.out.println("Hello");
		
	}
}
abstract final class car
{
	
}
class bike extends vehicle
{
	@Override
	void start()
	{
		System.out.println("hi");
	}

}
public class a2q4 extends vehicle
{
	public static void main(String[] args)
	{
		vehicle s=new vehicle();
		bike bus=new bike();
		
		

	}

}

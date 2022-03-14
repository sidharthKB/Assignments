package oops;

public class a2q1 {

	class SingletonInheritenceCheck
	{
		private SingletonInheritenceCheck() {}
	}
	class hello extends SingletonInheritenceCheck
	{
		void SingletonInheritenceCheck()
		{
	}
	public static void main(String[] args) 
	{
		SingletonInheritenceCheck obj1=new SingletonInheritenceCheck();
		SingletonInheritenceCheck obj2=new hello();
	}

	
}
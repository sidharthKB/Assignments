package oops;
import java.util.ArrayList;

class Employee
{
	class Manager extends a2q2
	{
		public int getSalary(int salary) {
	        int incentive = 5000;
	        System.out.println(salary+incentive);
	        return incentive;
	}
}
	class Labour extends a2q2
	{
		public int getSalary(int salary) 
		{
	        int overtime = 500;
	        System.out.println(salary+overtime);
	        return overtime;
	}
	}
}
public class a2q2 
{
	static  int salary = 10000;
    public int getSalary(int salary)
    {
		return salary;
    	
    }
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
    {
    	int sum=0;
    	for(int i=0;i<=employeeSalaries.size()-1;i++)
    	{
    		sum+=employeeSalaries.get(i);
    	}
    	return sum;
    }

	public static void main(String[] args) 
	{
		ArrayList<Integer> employeeSalaries=new ArrayList<>();
		Employee s=new Employee();
		Employee.Labour obj1=s.new Labour();
		Employee.Manager obj2=s.new Manager();
		employeeSalaries.add(obj1.getSalary(salary));
		employeeSalaries.add(obj2.getSalary(salary));
        System.out.println(totalEmployeesSalary(employeeSalaries));
	}
}



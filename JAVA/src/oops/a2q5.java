package oops;

class Rectangle5 extends Shape5 
{
        public String draw(String p) 
    {
    	return p="Drawing Line";
    }
}
class Line5 extends Shape5
{
    public String draw(String d) 
    {
      return d="Drawing Line";	
    }
 }
class Cube5 extends Shape5 
{
    public String draw(String p)
    {
    	return p="Drawing Line";
    }
}
abstract class Shape5 
{
    abstract public String draw(String p);
}
public class a2q5 
{
public static void main(String[] args)
{
	 Shape5 s=new Rectangle5();
	 Shape5 l=new Line5();
	 Shape5 c=new Cube5();
	 System.out.println(s.draw(null));
}
}

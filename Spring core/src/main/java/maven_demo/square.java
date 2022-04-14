package maven_demo;

import org.springframework.beans.factory.annotation.Autowired;

public class square {
	
		private int a;
		@Autowired
		rectangle rect;
	   public int getA() {
			return a;
		}
	   public void setA(int a) {
			this.a = a;
		}
	void area()
	   {
		   System.out.println("Area of square="+(a*a));
		   rect.r(1,2);
	   }
	
	 class rectangle
	{
		  int b;
		  int l;

		 public int getB() {
		 	return b;
		 }

		 public void setB(int b) {
		 	this.b = b;
		 }

		 public int getL() {
		 	return l;
		 }

		 public void setL(int l) {
		 	this.l = l;
		 }

		 public void r(int b,int l)
		 {
		 	System.out.println("Reactangle area="+l*b);
		 }
	}
}

package annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
public class q1 { 
	
	}
	class TestMethod{
		@Test
	     void run() {
	    	 System.out.println("HOW");
	     }
	}
	public class annotation1 {
		public static void main(String[] args) {
			TestMethod s = new TestMethod();
			s.run();
		}
	}
}

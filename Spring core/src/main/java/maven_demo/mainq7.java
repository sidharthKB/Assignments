package maven_demo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mainq7 {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("q7.xml");
		q7 SpEL = (q7) context.getBean("q7");
		System.out.println(SpEL.Display());
		context.close();
	}

}



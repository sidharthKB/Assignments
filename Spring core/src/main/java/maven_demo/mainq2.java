package maven_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainq2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("q2.xml");
		Question a=(Question) context.getBean("ans");
		a.Details();
		
	}

}

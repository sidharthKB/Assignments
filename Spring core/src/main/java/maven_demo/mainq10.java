package maven_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainq10 {
	public static void main(String[] args) 
	{
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("q10.xml");
		q10 appcontext= (q10)context.getBean("app");
		ApplicationContext appCon =appcontext.getContext();	
		 helloworld obj = (helloworld) context.getBean("hello");
		  obj.print();	
		      context.registerShutdownHook();

	}

}



package maven_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainq1 {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("q1.xml");
	q1 c=(q1) context.getBean("customer");
	c.adr();
	customerq1 a=(customerq1) context.getBean("info");
	a.details();

	}

}

package maven_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainq4 {
	

	public static void main(String[] args) 
	{  
	    ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
	    q4 s = (q4) context.getBean(q4.class);
        s.run();
        brand b= (brand) context.getBean(brand.class);
        b.bren();
        bike a = (bike) context.getBean(bike.class);
        a.po();

	}

	
		
	
}

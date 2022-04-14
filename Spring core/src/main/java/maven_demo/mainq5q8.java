package maven_demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import maven_demo.square.rectangle;
public class mainq5q8 {
	public static void main(String[] args) 
	{
		
		  ApplicationContext context=new ClassPathXmlApplicationContext("q5q8.xml"); 
		  
			  
				
				  q5 t = (q5) context.getBean("abc");
				  t.print();
		          q8 b = (q8) context.getBean("be");
                  b.sys();
                  b.init();
                  b.dest();
                  b.initbeaninit();
                  b.destbeaninit();
        
	}

}

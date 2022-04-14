package maven_demo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
public class q9 implements BeanPostProcessor{
	
		public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
		{
			System.out.println(beanName+" Before Initialization");
			return bean;
		}
		public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
		{
			System.out.println(beanName+" After Initialization\n");
			return bean;
		}

}



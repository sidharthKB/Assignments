package maven_demo;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
public class q10 {
	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
	}
	public void setApplicationContext(ApplicationContext context) throws BeansException
	{
		this.context=context;
	}


}

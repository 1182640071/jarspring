package myself.jarspring;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import myself.jarspring.c.Infomation;
import myself.jarspring.c.Test2;


/**
 * 2018.06.07
 * created by wangml
 *此demo用于实现非web项目结合spring框架，并吐出jmx监控信息
 */
@Component
public class App 
{
	
	public static ApplicationContext context;
	
	static{
		context = new ClassPathXmlApplicationContext("spring.xml"); 
	}
	
    public static void main( String[] args )
    {
    	Test2 t2 = (Test2) context.getBean("test2");
    	t2.tt();
    	
    	System.out.println(Infomation.getLogList().size());
    	while(true){
    		try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }  
}

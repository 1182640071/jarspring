package myself.jarspring;

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
		System.out.println(11111111);
		try {
			context = new ClassPathXmlApplicationContext("classpath:spring/spring.xml"); 
		} catch (Exception e) {
			System.out.println(2222222);
			System.out.println(e);
		}
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

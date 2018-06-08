package myself.jarspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import myself.jarspring.c.Test2;



/**
 * 2018.06.07
 * created by wangml
 *此demo用于实现非web项目结合spring框架，并吐出jmx监控信息
 */
@Component
public class App 
{
	
	public static ClassPathXmlApplicationContext context;
	
	static{
		try {
//			context = new ClassPathXmlApplicationContext("classpath:spring/spring.xml"); 
			context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring/spring.xml","classpath:spring/dubbo.xml"});
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
    public static void main( String[] args )
    {
    	context.start();
    	Test2 t2 = (Test2) context.getBean("test2");
    	t2.tt();
    	
    	while(true){
    		try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }  
}

package myself.jarspring.c;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import myself.jarspring.dubbo.server.GetLog;
import myself.jarspring.t.Test1;

@Component  
public class Test2 {
	
	@Resource
	private Test1 T1;
	
	@Reference
	private GetLog GL;
	
    public void tt(){
    	System.out.println("这是t2");
    	System.out.println(T1);
    	T1.test();
    	String rs = GL.getLog(5);
    	System.out.println(rs);
//    	for(String i : list){
//    		System.out.println("-=-=-=-=-=" + i);
//    		System.out.println(i);
//    	}
    	Infomation.getLogList().add("123");
    }

}

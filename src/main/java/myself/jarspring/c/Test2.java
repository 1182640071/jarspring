package myself.jarspring.c;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import myself.jarspring.t.Test1;

@Service
public class Test2 {
	
	@Resource
	private Test1 T1;
	
    public void tt(){
    	System.out.println("这是t2");
    	System.out.println(T1);
    	T1.test();
    	
    	Infomation.getLogList().add("123");
    }

}

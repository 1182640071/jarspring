package myself.jarspring.t;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Test1 {
	
//	@Resource
//	Test1 t1;
//	
//	public Test1(){
//		System.out.println(t1);
//	}

	
	public  String test(){
		System.out.println("test1");
		return "test";
	}
	
	
	
}

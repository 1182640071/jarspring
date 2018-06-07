package myself.jarspring.c;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

@ManagedResource(objectName = "devops1:type=DevOpsMonitor,app=AutOperation", description = "操作日志队列长度")
@Service
public class Infomation {
	private static List<String> logList = new ArrayList<String>();
		
	public static List<String> getLogList() {
		return logList;
	}

	public static void setLogList(List<String> logList) {
		Infomation.logList = logList;
	}

	@ManagedAttribute(description = "操作日志队列长度")
	public long getLogLength() {
		return logList.size();
	}
}

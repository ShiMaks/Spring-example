package by.spring.example;

import org.springframework.stereotype.Component;

@Component("classD")
public class ClassD {
	
	public ClassD() {
		
	}
	
//	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

}

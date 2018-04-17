package by.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationJava {
	
	@Bean(name = "classASecond", initMethod = "init", destroyMethod = "destroy")
	public ClassA classASecond(@Autowired ClassC classC) {
		return new ClassA();
	}
	
	@Bean(name = "third",  initMethod = "init", destroyMethod = "destroy")
	public ClassA classAThird(@Autowired ClassC classC) {
		return new ClassA();
	}
	
	@Bean(name = "classB",   initMethod = "init", destroyMethod = "destroy")
	public ClassB classB() {
		return new ClassB();
	}
	
	@Bean(name = "classC")
	@Scope(value = "prototype")
	public ClassC classC() {
		return new ClassC();
	}
}

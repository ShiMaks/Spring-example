package by.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contextApp = new ClassPathXmlApplicationContext("context.xml");
		
		ClassA classA = contextApp.getBean("classA", ClassA.class);
		
		contextApp.destroy();

	}

}

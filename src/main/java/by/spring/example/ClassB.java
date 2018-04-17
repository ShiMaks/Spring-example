package by.spring.example;

public class ClassB {
	
	private ClassD classD;
	
	public ClassB() {
		
	}
	
	public ClassB(ClassD classD) {
		this.classD = classD;
	}
	
	public void init() {
		System.out.println("Init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}

}

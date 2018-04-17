package by.spring.example;

//@Component("classA")
public class ClassA {
	
	private ClassC classC;
	private ClassB classB;
	
//	@Autowired
	public ClassA(ClassC classC, ClassB classB) {
		this.classC = classC;
		this.classB = classB;
	}
	
	public ClassA() {
		
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

package reflect;

class Person {
	public String name;
	protected int age;
	int id;
	private String home;//四种权限的成员变量
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, int id, String home) {
		
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.home = home;
	}
	
	public void eat(String place,String food) {
		System.out.println(name+"在"+place+"吃"+food);
	}
	
	private void drink() {
		System.out.println("喝饮料");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", home=" + home + "]";
	}
	
	
	
}

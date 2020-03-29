package ex02;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String n , int a) {
		// TODO 磊悼 积己等 积己磊 胶庞
		this.name = n;
		this.age = a;
	}
	public void info() {
		System.out.println(name+age);
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}

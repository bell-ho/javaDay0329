package ex01;

public class MainClass {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		obj1 = null;
		obj1.info();
		//널인 상태에서 메소드를 호출하면 nullPoint에러가 뜸
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//레퍼런스 출력 메모리가 다 다름
	}
}

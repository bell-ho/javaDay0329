package ex01;

public class MainClass02 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		ObjectClass02 obj1 = new ObjectClass02("hello", arr);
		
		ObjectClass02 obj2 = new ObjectClass02(10,20);
		obj2.info();
	}
	// 생성자가 없지만 컴파일 하면서 자동으로 생성자를 만들어 줘서 객체생성을 할수 있게됨
}

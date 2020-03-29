package ex01;

public class ObjectClass02 {
	public int x;
	public int y;
	
	public ObjectClass02(String n, int[] arr) {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("생성자생성");
		
		System.out.println(n);
		System.out.println(arr);
	}
	// 생성자가 없어도 컴파일시 자동으로 하나 만들어놓음
	public ObjectClass02(int x , int y) {
		// TODO 자동 생성된 생성자 스텁
		this.x = x; //this.x는 전역변수 x이고 초기화된 x는 (매개변수로 전달받은) 지역변수이다
		this.y = y;
	}
	public void info() {
		System.out.println(x);
		System.out.println(y);
	}
}

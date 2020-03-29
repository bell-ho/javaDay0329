package ex06;

public class InterfaceClass implements InterfaceA, InterfaceB {
	// 다형성, 다중구현을 할수있음
	
	public InterfaceClass() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("인터페이스 생성");
	}
	
	@Override
	public void funA() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("A");
	}

	@Override
	public void funB() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("B");

	}

}

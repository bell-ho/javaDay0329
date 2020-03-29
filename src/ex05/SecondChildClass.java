package ex05;

public class SecondChildClass extends ParentClass{
	public SecondChildClass() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("new SecondChildClass()둘째자식클래스 생성");

	}
	@Override
	public void make() {
		System.out.println("두번째 자식클래스 메소드");
	}
}

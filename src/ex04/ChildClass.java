package ex04;

public class ChildClass extends ParentClass{
	public ChildClass() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("자식클래스 생성");
	}
	public void cf() {
		System.out.println("자식클래스 메소드실행");
	}
	public void make() {
		System.out.println("오버라이드(재정의)한 자식클래스 메소드");
	}
}

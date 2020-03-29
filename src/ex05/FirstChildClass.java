package ex05;

public class FirstChildClass extends ParentClass{
	public FirstChildClass() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("new FirstChildClass();첫자식클래스 생성");
	}
	@Override
	public void make() {
		System.out.println("첫번째 자식클래스 메소드");
	}
}

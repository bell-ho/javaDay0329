package ex04;

public class ParentClass {
	public ParentClass() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("부모클래스생성");
	}
	public void pf() {
		System.out.println("부모클래스 메소드실행");
	}
	private void privateParent() {
		System.out.println("부모 프라이빗 메소드");
	}
	public void make() {
		System.out.println("기존의 부모클래스 메소드");
	}
}

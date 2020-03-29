package ex03;

public class ParentClass {
//	public static void main(String[] args) { //메인 메소드는 객체 생성을 위한 첫 실행 메소드 이다.
//		ChildClass c = new ChildClass(); //생성자를 만들면 생성자안의 이벤트들이 실행됨
//	}
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
}

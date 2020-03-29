package ex03;

public class MainClass {
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.cf();
		c.pf();
		//생성시 최상위 클래스로 올라가서 부모클래스생성 실행
		//그 부모를를 상속받은 자식클래스 생성 실행
		//그다음 순서대로 cf() pf()
		
		
//		c.privateParent(); 상속받으면 다쓸수 있지만 , 예외로 privte로 접근을 막아 놓으면 못쓴다
	}
}

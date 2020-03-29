package ex07;

public class ClassEx extends AbstractClassEx {
	public ClassEx() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("ClassEx 생성지");
	}
	public ClassEx(int i , String s) {
		// TODO 자동 생성된 생성자 스텁
		super(i,s); //상위클래스로 올라감
	}
	@Override
	public void fun2() { //반드시 만들어야함
		// TODO 자동 생성된 메소드 스텁
		System.out.println("추상클래스에서 받은 메소드");
		
	}
}

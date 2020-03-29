package ex06;

public class ToyPerson implements Toy { // 인터페이스를 재정의함
	@Override
	public void eat() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("먹을수 있음");
	}

	@Override
	public void ride() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("탈수 있음");
	}

	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("달릴수 있음");
	}

	@Override
	public void walk() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("걸을수 있음");

	}
}

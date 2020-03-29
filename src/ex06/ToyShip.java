package ex06;

public class ToyShip implements Toy { // 인터페이스를 재정의함

	@Override
	public void eat() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("먹을수 없음");
	}

	@Override
	public void ride() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("탈 수 있음");

	}

	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("달릴수 없음");

	}

	@Override
	public void walk() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("걸을수 없음");

	}
}

package ex02;

public class MainClass {
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 90);
		//main메소드안에서 실행해야함
		st1.info();
		st1.setScore(100);
		st1.info();
		
	}

}

package ex02;

public class MainClasss2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Person p1 = new Person("이종호", 29);
		Person p2 = new Person("최윤지", 27);
		
		p1.info();
		p2.info();
		
		p1.setName("이종훈");
		p1.info();
		
		System.out.println(p1.getName()); //<==이렇게 접근해야함 p1의 name을 가져와
	}

}

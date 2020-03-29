package ex05;

public class MainClass {
	public static void main(String[] args) {
		
		ParentClass[] parr = new ParentClass[2]; //같은자료형이라 배열에 담음
		
		
		ParentClass fc = new FirstChildClass();
		ParentClass sc = new SecondChildClass();
		//상위클래스를 상속받았기때문에 상위클래스의 타입이여도 상관없음
		
		parr[0] = fc;
		parr[1] = sc;
		
		fc.make();
		sc.make();
		
	}
}
 
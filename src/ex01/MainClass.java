package ex01;

public class MainClass {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		obj1 = null;
		obj1.info();
		//���� ���¿��� �޼ҵ带 ȣ���ϸ� nullPoint������ ��
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//���۷��� ��� �޸𸮰� �� �ٸ�
	}
}

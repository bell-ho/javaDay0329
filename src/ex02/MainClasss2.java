package ex02;

public class MainClasss2 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Person p1 = new Person("����ȣ", 29);
		Person p2 = new Person("������", 27);
		
		p1.info();
		p2.info();
		
		p1.setName("������");
		p1.info();
		
		System.out.println(p1.getName()); //<==�̷��� �����ؾ��� p1�� name�� ������
	}

}

package ex05;

public class FirstChildClass extends ParentClass{
	public FirstChildClass() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("new FirstChildClass();ù�ڽ�Ŭ���� ����");
	}
	@Override
	public void make() {
		System.out.println("ù��° �ڽ�Ŭ���� �޼ҵ�");
	}
}

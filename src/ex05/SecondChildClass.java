package ex05;

public class SecondChildClass extends ParentClass{
	public SecondChildClass() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("new SecondChildClass()��°�ڽ�Ŭ���� ����");

	}
	@Override
	public void make() {
		System.out.println("�ι�° �ڽ�Ŭ���� �޼ҵ�");
	}
}

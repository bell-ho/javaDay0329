package ex06;

public class InterfaceClass implements InterfaceA, InterfaceB {
	// ������, ���߱����� �Ҽ�����
	
	public InterfaceClass() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("�������̽� ����");
	}
	
	@Override
	public void funA() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("A");
	}

	@Override
	public void funB() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("B");

	}

}

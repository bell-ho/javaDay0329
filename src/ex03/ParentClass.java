package ex03;

public class ParentClass {
//	public static void main(String[] args) { //���� �޼ҵ�� ��ü ������ ���� ù ���� �޼ҵ� �̴�.
//		ChildClass c = new ChildClass(); //�����ڸ� ����� �����ھ��� �̺�Ʈ���� �����
//	}
	public ParentClass() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("�θ�Ŭ��������");
	}
	public void pf() {
		System.out.println("�θ�Ŭ���� �޼ҵ����");
	}
	private void privateParent() {
		System.out.println("�θ� �����̺� �޼ҵ�");
	}
}

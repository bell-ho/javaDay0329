package ex07;

public class ClassEx extends AbstractClassEx {
	public ClassEx() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("ClassEx ������");
	}
	public ClassEx(int i , String s) {
		// TODO �ڵ� ������ ������ ����
		super(i,s); //����Ŭ������ �ö�
	}
	@Override
	public void fun2() { //�ݵ�� ��������
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�߻�Ŭ�������� ���� �޼ҵ�");
		
	}
}

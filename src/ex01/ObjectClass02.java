package ex01;

public class ObjectClass02 {
	public int x;
	public int y;
	
	public ObjectClass02(String n, int[] arr) {
		// TODO �ڵ� ������ ������ ����
		System.out.println("�����ڻ���");
		
		System.out.println(n);
		System.out.println(arr);
	}
	// �����ڰ� ��� �����Ͻ� �ڵ����� �ϳ� ��������
	public ObjectClass02(int x , int y) {
		// TODO �ڵ� ������ ������ ����
		this.x = x; //this.x�� �������� x�̰� �ʱ�ȭ�� x�� (�Ű������� ���޹���) ���������̴�
		this.y = y;
	}
	public void info() {
		System.out.println(x);
		System.out.println(y);
	}
}

package ex01;

public class MainClass02 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		ObjectClass02 obj1 = new ObjectClass02("hello", arr);
		
		ObjectClass02 obj2 = new ObjectClass02(10,20);
		obj2.info();
	}
	// �����ڰ� ������ ������ �ϸ鼭 �ڵ����� �����ڸ� ����� �༭ ��ü������ �Ҽ� �ְԵ�
}

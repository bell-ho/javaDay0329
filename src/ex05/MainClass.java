package ex05;

public class MainClass {
	public static void main(String[] args) {
		
		ParentClass[] parr = new ParentClass[2]; //�����ڷ����̶� �迭�� ����
		
		
		ParentClass fc = new FirstChildClass();
		ParentClass sc = new SecondChildClass();
		//����Ŭ������ ��ӹ޾ұ⶧���� ����Ŭ������ Ÿ���̿��� �������
		
		parr[0] = fc;
		parr[1] = sc;
		
		fc.make();
		sc.make();
		
	}
}
 
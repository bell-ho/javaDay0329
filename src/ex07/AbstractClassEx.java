package ex07;

public abstract class AbstractClassEx {
	int num;
	String str;
	
	public AbstractClassEx() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("AbstractClassEx������");
	}
	public AbstractClassEx(int i , String s) {
		// TODO �ڵ� ������ ������ ����
		System.out.println("AbstractClassEx������");
		
		this.num = i;
		this.str = s;
	}
	
	public void info() {
		System.out.println(num+str);
	}
	
	public void fun1() {
		System.out.println("fun1 start");
	}
	public abstract void fun2(); //�߻�޼ҵ�
}

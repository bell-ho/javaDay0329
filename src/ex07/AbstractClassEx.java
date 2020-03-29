package ex07;

public abstract class AbstractClassEx {
	int num;
	String str;
	
	public AbstractClassEx() {
		// TODO 磊悼 积己等 积己磊 胶庞
		System.out.println("AbstractClassEx积己磊");
	}
	public AbstractClassEx(int i , String s) {
		// TODO 磊悼 积己等 积己磊 胶庞
		System.out.println("AbstractClassEx积己磊");
		
		this.num = i;
		this.str = s;
	}
	
	public void info() {
		System.out.println(num+str);
	}
	
	public void fun1() {
		System.out.println("fun1 start");
	}
	public abstract void fun2(); //眠惑皋家靛
}

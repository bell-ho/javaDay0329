package bank;

public class Eymploy {
	int amount = 0;
	int add = 0;
	int send = 0;
	public String name;
	
	public Eymploy() {
		// TODO �ڵ� ������ ������ ����
	}
	public void addBank(int a) {
		this.amount = amount + a;
		System.out.println(name+"����"+a+"���� �Ա��Ͽ����ϴ�");
	}
	public void send(int s) {
		this.amount = amount - s;
		System.out.println(name+"����"+s+"���� ����Ͽ����ϴ�");
	}
	public void info() {
		System.out.println(name+"���� �ܾ���"+amount+"�Դϴ�");
	}
}

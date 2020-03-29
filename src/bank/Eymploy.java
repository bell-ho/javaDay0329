package bank;

public class Eymploy {
	int amount = 0;
	int add = 0;
	int send = 0;
	public String name;
	
	public Eymploy() {
		// TODO 자동 생성된 생성자 스텁
	}
	public void addBank(int a) {
		this.amount = amount + a;
		System.out.println(name+"님이"+a+"원을 입금하였습니다");
	}
	public void send(int s) {
		this.amount = amount - s;
		System.out.println(name+"님이"+s+"원을 출금하였습니다");
	}
	public void info() {
		System.out.println(name+"님의 잔액은"+amount+"입니다");
	}
}

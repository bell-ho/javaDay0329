package bank;

public class MainClass {
	
	public static void main(String[] args) {
		Eymploy em1 = new Eymploy();
		
		em1.name = "이종호";
		em1.amount = 100;
		
		em1.info();
		em1.addBank(5000);
		em1.info();
		em1.send(3000);
		em1.info();
		
		Eymploy em2 = new Eymploy();
		em2.name = "최윤지";
		em2.amount = 10000000;
		
		em2.addBank(100000);
		em2.info();
	}
}

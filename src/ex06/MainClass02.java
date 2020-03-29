package ex06;

public class MainClass02 {
	public static void main(String[] args) {
		Toy ship = new ToyShip();
		Toy person = new ToyPerson();

		Toy toys[] = { ship, person }; // 같은타입이라 배열에 담음

		for (int i = 0; i < toys.length; i++) {
			toys[i].eat();
			toys[i].ride();
			toys[i].run();
			toys[i].walk();

			System.out.println();
		}
	}
}

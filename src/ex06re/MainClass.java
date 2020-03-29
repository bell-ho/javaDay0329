package ex06re;

public class MainClass {
	public static void main(String[] args) {

		Computer sc = new Samsung();
		Computer lc = new Lg();

		Computer computer[] = { sc, lc };

		for (int i = 0; i < computer.length; i++) {
			computer[i].frame();
			computer[i].monitor();
			computer[i].speaker();
			computer[i].mouse();

			System.out.println();
		}
	}
}

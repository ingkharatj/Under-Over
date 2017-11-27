import java.util.Random;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	static int newRandom() {
		return rand.nextInt(6) + 1;
	}

	public static void main(String[] args) {

		name.listname();

		int money = 0;
		while (true) {

			int a = newRandom();
			int b = newRandom();
			System.out.printf("%s money: ");
			System.out.println(money);
			System.out.print("Input your bet: ");
			int bet = sc.nextInt();
			System.out.print("Input your Result: ");
			int result = sc.nextInt();
			System.out.println("First Dice is " + a);
			System.out.println("Second Dice is " + b);
			System.out.println("Result is " + (a + b));
			int sum = a + b;
			if (result == a + b && a + b <= 6 && a + b >= 2) {
				money = money + bet * 2;
				System.out.println("You win");
			}
			if (result == a + b && a + b <= 12 && a + b >= 8) {
				money = money + bet * 2;
				System.out.println("You win");
			}
			if (result == a + b && a + b == 7) {
				money = money + bet * 4;
				System.out.println("You win");
			}
			if (result != a + b) {

				money = money - bet;
				System.out.println("You lose");
			} else {
				break;
			}
			System.out.println("Do you want to play again?");
			System.out.print("(y)es or n(o): ");
			String x = sc.next();
			if (x.equals("n")) {
				System.out.print("Your money: ");
				System.out.println(money);
				break;
			}
			if (x.equals("y")) {

			}
		}

	}

}

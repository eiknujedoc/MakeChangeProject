import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Amount Due:_");
		double balance = kb.nextDouble();
		System.out.println("Enter Amount Tendered:_");
		double payment = kb.nextDouble();
		double changeDue = balance - payment;
		if (changeDue <= 0) {
			System.out.println("Change due: ");
			System.out.printf("%.2f", changeDue);
			makeChange(changeDue);
		} else
			System.out.println("Error");

	}

	private static double makeChange(double changeDue) {
		double[] currency = { 20, 10, 5, 1, .25, .1, .05, .01 };
		System.out.println();
		System.out.println();
		changeDue = (changeDue * -1);
		do {
			for (int i = 0; i < currency.length; i++) {
				do {
					if ((changeDue >= currency[i] || (changeDue < 0.01 && changeDue > 0))) {
						if ((changeDue < .01 && changeDue > 0)) { // This looks for a rounding error on the last penny
							System.out.printf("0.01");
						} else
							System.out.printf("%.2f\n", currency[i]);

						changeDue = changeDue - currency[i];
					}
				} while (changeDue > currency[i]);
			}
		} while (changeDue >= 0.0);
		return changeDue;
	}
}

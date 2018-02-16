import java.util.Scanner;

public class Lab1 {
	private int number;

	Lab1() {
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Write the number x: 1 < x < 9999");
			System.out.print("x = ");
			int number = scanner.nextInt();
			if ((number > 0) && (number < 9999)) {
				this.number = number;
				break;
			} else System.out.println("Incorrect input range");
		}
	}

	private boolean isEven() {
		return (number % 2) == 0;
	}

	private String Length() {
		String str;
		if (number < 9) {
			str = "однозначное";
		} else if (number < 99) {
			str = "двузначное";
		} else if (number < 999) {
			str = "трехзначное";
		} else str = "четырехзначное";
		return str;
	}

	@Override
	public String toString() {
		String answer = isEven() ? "четное " : "нечетное ";
		answer += Length();
		return answer + " число";

	}
}

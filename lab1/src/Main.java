import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Write the number x: 1 < x < 9999");
			System.out.print("x = ");
			number = scanner.nextInt();
			if ((number > 0) && (number < 9999)) {
				break;
			} else System.out.println("Incorrect input range");
		}

		List<IAnalysisNumber> analazers = AnalysingNumberFactory.getAnalazers();
		String result = "";
		for (IAnalysisNumber analazer : analazers) {
			result += analazer.analyze(number) + " ";
		}
		System.out.println(result + " число");

	}
}

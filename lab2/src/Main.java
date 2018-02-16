import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write string");
		Lab2 lab = new Lab2(scanner.next());
		System.out.println(lab);
	}

}

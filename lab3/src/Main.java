import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array length:");

		int arr[] = new int[scanner.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]= ");
			arr[i] = scanner.nextInt();
		}

		Lab3 lab = new Lab3(arr);
		lab.count();
		System.out.println(lab);
	}
}

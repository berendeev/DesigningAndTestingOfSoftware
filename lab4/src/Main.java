import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array length:");

		int N = 0;

		while (N < 6) {
			System.out.println("Write N>=6");
			System.out.print("N= ");
			N = scanner.nextInt();
		}

		int arr[] = new int[N];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]= ");
			arr[i] = scanner.nextInt();
		}

		Lab4 lab = new Lab4(arr);
		lab.count();
		System.out.println(lab);
	}
}

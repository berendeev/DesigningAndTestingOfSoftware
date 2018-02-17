public class Lab7 {
	int N;
	int M;
	private int[][] arr;

	public Lab7() {
		N = 4;
		M = 4;
		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = i * j + 1;
			}
		}
	}

	private int countOfLargeMean(double average) {
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (i < j) {
					if (arr[i][j] > average) count++;
				}
			}
		}
		return count;
	}

	private int sumOfOfLargeMean(double average) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (i > j) {
					if (arr[i][j] > average) sum += arr[i][j];
				}
			}
		}
		return sum;
	}

	private double average() {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sum += arr[i][j];
			}
		}
		return sum / (N * M);
	}

	@Override
	public String toString() {
		String ans = "My array is \n";
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				ans += arr[i][j] + " ";
			}
			ans += "\n";
		}
		return ans +
				"Average is " + average() + "\n" +
				"Count of large mean is " + countOfLargeMean(average()) + "\n" +
				"Sum of large mean is " + sumOfOfLargeMean(average());
	}
}

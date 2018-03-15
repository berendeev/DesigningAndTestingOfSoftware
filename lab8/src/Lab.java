import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab {
	List<int[]> rowsList;

	Lab(int[][] arr) {
		rowsList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			rowsList.add(arr[i]);
		}

		int number = findSum();
		int[] additionalRow = new int[rowsList.get(0).length];
		for (int i = 0; i < additionalRow.length; i++) {
			additionalRow[i] = number;
		}
		for (int i = 0; i < rowsList.size(); i += 2) {
			rowsList.add(i + 1, additionalRow);
		}
	}

	public int findSum() {
		List<Integer> values = new ArrayList<>();
		for (int i = 0; i < rowsList.size(); i++) {
			for (int j = 0; j < rowsList.get(i).length; j++) {
				values.add(rowsList.get(i)[j]);
			}
		}
		int sumOfValues =
				values.stream()
						.filter((x) -> x < 0)
						.filter((x) -> (x % 2) != 0)
						.min(Integer::compare)
						.orElse(0) +
						values.stream()
								.filter((x) -> x > 0)
								.filter((x) -> (x % 2) == 0)
								.max(Integer::compare)
								.orElse(0);
		return sumOfValues;
	}


	@Override
	public String toString() {
		String print = "";
		for (int[] v : rowsList) {
			print += Arrays.toString(v);
		}
		return print;
	}
}


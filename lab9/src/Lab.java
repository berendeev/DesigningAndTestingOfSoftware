import java.util.ArrayList;
import java.util.List;

public class Lab {
	int[][] array;

	public Lab(int[][] arr) {
		this.array = arr;
		List<Integer> aroundValues = new ArrayList();
		for (int i = 0; i < array[0].length; i++) {
			aroundValues.add(array[0][i]);
			aroundValues.add(array[array.length - 1][i]);
		}
		for (int i = 1; i < array.length - 1; i++) {
			aroundValues.add(array[i][0]);
			aroundValues.add(array[i][array[i].length - 1]);
		}
		aroundValues.sort(Integer::compareTo);

		rewrite(aroundValues, array);

	}

	private void rewrite(List<Integer> aroundValues, int[][] array) {
		int count = 0;

		int sizeOfColumn = array[0].length;
		for (int i = 0; i < sizeOfColumn; i++) {
			array[0][i] = aroundValues.get(count++);
		}

		int sizeOfRow = array.length;
		for (int i = 1; i < sizeOfRow; i++) {
			int lastColumn = array[i].length - 1;
			array[i][lastColumn] = aroundValues.get(count++);
		}
		int lastRow = array.length - 1;
		for (int i = array[lastRow].length - 2; i > 0; i--) {
			array[lastRow][i] = aroundValues.get(count++);
		}

		for (int i = array.length - 1; i > 0; i--) {
			array[i][0] = aroundValues.get(count++);
		}
	}

	@Override
	public String toString() {
		String print = "";
		for (int i = 0; i < array.length; i++) {
			print += "[ ";
			for (int j = 0; j < array[i].length; j++) {
				print += array[i][j] + ", ";
			}
			print += "]\n";
		}
		return print;
	}
}

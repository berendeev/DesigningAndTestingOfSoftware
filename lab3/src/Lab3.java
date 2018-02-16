public class Lab3 {
	private int arr[];

	Lab3(int arr[]) {
		this.arr = arr.clone();
	}

	public void count() {
		int lastElement = arr[arr.length - 1];
		for (int i = 1; i < arr.length - 1; i++) {
			if ((arr[i] % 2) == 0) arr[i] += lastElement;
		}
	}

	@Override
	public String toString() {
		String arrString = "";
		for (int num : arr) {
			arrString += String.valueOf(num) + " ";
		}
		return arrString;
	}
}

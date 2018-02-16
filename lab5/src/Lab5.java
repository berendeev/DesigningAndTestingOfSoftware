public class Lab5 {
	private int arr[];

	Lab5(int[] arr) {
		this.arr = arr.clone();
	}

	public void count() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (isEven(arr[i])) {
					insert(i, 1);
					i += 1;
				}
			} else if (arr[i] > 0) {
				if (!isEven(arr[i])) {
					insert(i, 0);
				}
			}
		}
	}

	private void insert(int index, int value) {
		int[] newArr = new int[arr.length + 1];

		System.arraycopy(arr, 0, newArr, 0, index + 1);
		System.arraycopy(arr, index + 1, newArr, index + 2, arr.length - (index + 1));

		newArr[index + 1] = value;

		arr = newArr;
	}

	private boolean isEven(int number) {
		return (number % 2) == 0;
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

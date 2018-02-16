public class Lab6 {
	private int arr[];

	Lab6(int[] arr) {
		this.arr = arr.clone();
	}

	public void count() {
		Integer maxMultiplesOf3 = null;
		int posMaxMultiplesOf3 = -1;
		Integer minEven = null;
		int posMinEven = -1;

		for (int i = 0; i < arr.length; i++) {
			if (isEven(arr[i])) {
				if (minEven == null) {
					minEven = arr[i];
					posMinEven = i;
				} else {
					if (minEven > arr[i]) {
						minEven = arr[i];
						posMinEven = i;
					}
				}
			}
		}
		System.err.println("Min " + arr[posMinEven]);
		delete(posMinEven);

		for (int i = 0; i < arr.length; i++) {
			if (isMultiple(arr[i], 3)) {
				if (maxMultiplesOf3 == null) {
					maxMultiplesOf3 = arr[i];
					posMaxMultiplesOf3 = i;
				} else {
					if (maxMultiplesOf3 < arr[i]) {
						maxMultiplesOf3 = arr[i];
						posMaxMultiplesOf3 = i;
					}
				}
			}
		}
		System.err.println("Max " + arr[posMaxMultiplesOf3]);
		delete(posMaxMultiplesOf3);

	}


	private boolean isMultiple(int number, int value) {
		return (number % value) == 0;
	}

	private boolean isEven(int number) {
		return (number % 2) == 0;

	}

	private void delete(int index) {
		int[] newArr = new int[arr.length - 1];
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.arraycopy(arr, 0, newArr, 0, newArr.length);

		arr = newArr;
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

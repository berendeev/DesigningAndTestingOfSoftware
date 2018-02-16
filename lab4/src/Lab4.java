public class Lab4 {
	private int arr[];

	Lab4(int[] arr) {
		this.arr = arr.clone();
	}

	public void count() {
		int temp = arr[3];
		arr[3] = arr[5];
		arr[5] = temp;
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

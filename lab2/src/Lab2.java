public class Lab2 {
	private String string;

	public Lab2(String string) {
		this.string = string;
	}

	public int count() {
		int count = 0;
		String vowels = "аоиеёэыуюя";
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (string.toLowerCase().charAt(i) == vowels.charAt(j)) count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return String.valueOf(count());
	}
}

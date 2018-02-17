import java.util.HashSet;
import java.util.Set;

public class Lab2 {
	private String string;

	public Lab2(String string) {
		this.string = string;
	}

	public int count() {
		int count = 0;
		Set<Character> vowels = new HashSet<>();
		vowels.add('а');
		vowels.add('о');
		vowels.add('и');
		vowels.add('е');
		vowels.add('ё');
		vowels.add('э');
		vowels.add('ы');
		vowels.add('у');
		vowels.add('ю');
		vowels.add('я');
		for (int i = 0; i < string.length(); i++) {
			if (vowels.contains(string.toLowerCase().charAt(i))) count++;
		}
		return count;
	}

	@Override
	public String toString() {
		return String.valueOf(count());
	}
}

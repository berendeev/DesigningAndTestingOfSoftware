public class Digit implements IAnalysisNumber {

	@Override
	public String analyze(int number) {
		String str;
		if (number < 9) {
			str = "однозначное";
		} else if (number < 99) {
			str = "двузначное";
		} else if (number < 999) {
			str = "трехзначное";
		} else str = "четырехзначное";
		return str;
	}
}

public class Even implements IAnalysisNumber {

	@Override
	public String analyze(int number) {
		return isEven(number) ? "четное" : "нечетное";
	}

	private boolean isEven(int number) {
		return (number % 2) == 0;
	}
}

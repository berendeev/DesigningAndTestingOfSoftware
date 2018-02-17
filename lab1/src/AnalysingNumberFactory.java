import java.util.ArrayList;

public class AnalysingNumberFactory {
	public static ArrayList<IAnalysisNumber> getAnalazers(){
		ArrayList<IAnalysisNumber> result = new ArrayList<>();
		result.add(new Digit());
		result.add(new Even());
		return result;
	}
}

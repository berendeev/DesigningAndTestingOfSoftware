import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader in;
		DataOutputStream out;
		try {
			in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("D:\\Java\\DesigningAndTestingOfSoftware\\lab10\\src\\input.txt"),
							"UTF8"));
			out = new DataOutputStream(
					new FileOutputStream("D:\\Java\\DesigningAndTestingOfSoftware\\lab10\\src\\output.txt"));

			String string = in.readLine();
			System.out.println(string);
			Lab lab = new Lab(string);
			out.writeChars(lab.toString());
//			System.out.println(lab);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

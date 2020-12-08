package homework5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

	public static void allFilesCopy(File file1, File file2, File file3) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(file1));
				BufferedWriter bW = new BufferedWriter(new FileWriter(file3))) {
			String lines = " ";
			for (; (lines = br.readLine()) != null;)
				for (String text : lines.split(" ")) {
					if (words(file2, text)) {
						bW.write(text);
						bW.write(" ");
					}
				}
		} catch (IOException e) {
			System.err.println("error");
		}
	}

	private static boolean words(File file, String str) {
		try (BufferedReader bR = new BufferedReader(new FileReader(file))) {
			String buffer = "";
			for (; (buffer = bR.readLine()) != null;) {
				for (String st : buffer.split(" ")) {
					if (st.equals(str)) {
						return true;
					}
				}
			}
		} catch (IOException e) {
			System.err.println("error");
		}
		return false;
	}
}

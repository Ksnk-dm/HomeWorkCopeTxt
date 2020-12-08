package homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("1.txt");
		File file2 = new File("2.txt");
		File file3 = new File("3.txt");
		try {
			Files.allFilesCopy(file1, file2, file3);
			System.out.println("Copied file text:");
			try (BufferedReader f = new BufferedReader(new FileReader("3.txt"))) {
				String str = "";
				for (; (str = f.readLine()) != null;)
					System.out.println(str);

			}

		} catch (IOException e) {
			System.err.println("error");
		}

	}

}

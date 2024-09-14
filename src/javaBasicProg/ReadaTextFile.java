package javaBasicProg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadaTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\This PC\\OneDrive\\Documents\\StudentTable.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}

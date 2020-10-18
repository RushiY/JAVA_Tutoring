package sorts_and_searches;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReaader {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("test2.txt"));

		while (scan.hasNext()) {
			System.out.print(scan.next() + " ");
		}
	}
}

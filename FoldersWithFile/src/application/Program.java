package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Directories: ");
		try {
			for (File folder : folders) {
				System.out.println(folder);
			}
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}

		File[] files = path.listFiles(File::isFile);

		System.out.println("Files: ");
		try {
			for (File file : files) {
				System.out.println(file);
			}
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}

		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory successfuly created: " + success);

		sc.close();

	}

}

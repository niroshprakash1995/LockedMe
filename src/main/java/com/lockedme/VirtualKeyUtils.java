package com.lockedme;

import java.io.File;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VirtualKeyUtils {
	public void listFiles() {
		String rootPath = System.getProperty("user.dir");
		File file = new File(rootPath);
		String[] fileList = file.list();
		if (fileList.length == 0) {
			System.out.println("There are no files in this directory.\n");
		} else {
			Arrays.sort(fileList);
			System.out.println("The current filenames are:");
			for (String name : fileList) {
				System.out.println(name);
			}
		}
	}

	public void businessOperations() {
		System.out.println("****Please select from the below business operations:");
		System.out.println("1-Add a file to the existing directory list");
		System.out.println("2-Delete a user specified file from the existing directory list");
		System.out.println("3-Search a user specified file from the main directory");
		System.out.println("4-Return to main menu");
		Scanner sc = new Scanner(System.in);
		BusinessOperations b = new BusinessOperations();
		VirtualKey v = new VirtualKey();
		try {
			int businessOption = sc.nextInt();
			switch (businessOption) {
			case 1:
				b.addFile();
				break;
			case 2:
				b.deleteFile();
				break;
			case 3:
				b.searchFile();
				break;
			case 4:
				v.mainMenu();
				break;
			default:
				System.out.println("Invalid option. Please try again.\n");
				businessOperations();
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please try again.\n");
			businessOperations();
		}
		sc.close();

	}

}

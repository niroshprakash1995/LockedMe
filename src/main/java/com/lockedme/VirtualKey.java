package com.lockedme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VirtualKey {

	public static void main(String[] args) {

		VirtualKey v = new VirtualKey();

		System.out.println("Welcome to LockedMe.com\n");
		System.out.println("***************Developer details***************");
		System.out.println("Developer name: Nirosh Prakash");
		System.out.println("Developer company: Company Lockers Pvt. Ltd.");
		System.out.println("***********************************************\n");

		v.mainMenu();

		System.out.println("Thank you for using the LockMe.com application!");

	}

	public void mainMenu() {
		System.out.println("\n****Please select from the below options:");
		System.out.println("1-Retrieve file names in ascending order");
		System.out.println("2-Business level operations (Add, Delete and Search)");
		System.out.println("3-Close application");

		VirtualKeyUtils virtualKeyUtils = new VirtualKeyUtils();
		Scanner sc = new Scanner(System.in);
		try {
			int mainOption = sc.nextInt();
			switch (mainOption) {
			case 1:
				virtualKeyUtils.listFiles();
				break;
			case 2:
				virtualKeyUtils.businessOperations();
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid option. Please try again.\n");
				mainMenu();
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please try again.\n");
			mainMenu();
		}
		sc.close();
	}

}

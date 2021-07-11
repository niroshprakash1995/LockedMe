package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessOperations {
	public void addFile()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the filename you want to create:");
		String filename = sc.nextLine();
		File fileObj = new File("C:\\Users\\nprakash\\Desktop\\test\\" + filename);
		try {
			if(fileObj.createNewFile()) {
				System.out.println("File created: " + fileObj.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	public void deleteFile()
	{
		Scanner sc = new Scanner(System.in);
		boolean fileFound = false;
		System.out.println("Please enter the filename you want to delete:");
		String filename = sc.nextLine();
		File fileObj = new File("C:\\Users\\nprakash\\Desktop\\test\\");
		String[] fileList = fileObj.list();
		for(int i=0; i<fileList.length; i++) {
			if(fileList[i].equals(filename))
			{
				fileObj = new File("C:\\Users\\nprakash\\Desktop\\test\\" + filename);
				fileObj.delete();
				System.out.println("File deleted: " + fileObj.getName());
				fileFound = true;
			}
		}
		if(!fileFound){
			System.out.println("Failed to delete the file/File does not exist.");
		}
		sc.close();
	}
	
	public void searchFile()
	{
		Scanner sc = new Scanner(System.in);
		boolean fileFound = false;
		System.out.println("Please enter the filename you want to search:");
		String filename = sc.nextLine();
		File fileObj = new File("C:\\Users\\nprakash\\Desktop\\test\\");
		String[] fileList = fileObj.list();
		for(int i=0; i<fileList.length; i++) {
			if(fileList[i].equals(filename))
			{
				System.out.println("File found.");
				fileFound = true;
			}
		}
		if(!fileFound){
			System.out.println("File not found.");
		}
		sc.close();
		
	}

}

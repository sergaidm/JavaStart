package ru.yandex.sergaidm;

//Create a method that displays a list of all the directories 
//contained in the directory that is the parameter of this method.

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File folder = new File(".");

		File folderTwo = new File("Folder");
		folderTwo.mkdirs();

		int n = 1;
		while (n <= 10) {
			createFolders(n);
			n++;
		}

		listOfFolders(folderTwo);

	}

	public static void createFolders(int n) {
		File folder = new File("Folder/Folder" + n);
		folder.mkdir();

	}

	public static void listOfFolders(File folder) {

		File[] files = folder.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println(file);
			}
		}
	}

}

package ru.yandex.sergaidm;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		printFolderInfo("/E:\\");
	}

	public static void printFolderInfo(String folderName) {
		File folder = new File(folderName);
		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Illegal arguments");
			return;
		}
		String[] fileList = folder.list();
		for (String fileName : fileList) {
			File tempfile = new File(folder, fileName);
			if (tempfile.isDirectory()) {
				System.out.println(fileName);
			}
		}
	}

}

package ru.yandex.sergaidm;

//Create a console text editor with the ability to save typed text to a file.

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File textRedactor = new File("Notepade.txt");

		try {
			textRedactor.createNewFile();
		} catch (IOException e) {
			System.out.println("Error file create");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a text");

		String text = sc.nextLine();

		try (PrintWriter pw = new PrintWriter("Notepade.txt")) {
			pw.println(text);
		} catch (IOException e) {
			System.out.println("Error file write");
		}

		System.out.println("Your text saved in file Notepade.txt");
	}
}

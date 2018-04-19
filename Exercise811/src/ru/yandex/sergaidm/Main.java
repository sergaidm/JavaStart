package ru.yandex.sergaidm;

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
		System.out.println("Input a text. For exit input \"Exit\": ");
		try (PrintWriter pw = new PrintWriter("Notepade.txt")) {
			String text = sc.nextLine();
			for (; text.compareToIgnoreCase("exit") != 0;) {
				pw.println(text);
				text = sc.nextLine();
			}
		} catch (IOException e) {
			System.out.println("Error file write");
		}
		System.out.println("Your text saved in file Notepade.txt");

	}
}

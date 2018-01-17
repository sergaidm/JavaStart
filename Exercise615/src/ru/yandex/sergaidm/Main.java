package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input sentence: ");
		String text = sc.nextLine();

		System.out.println("Number of words in the sentence = " + countWords(text));

	}

	public static int countWords(String text) {

		String[] t = text.split("[ ]");
		int i = 0;
		while (i < t.length) {
			i++;
		}
		return i;
	}

}

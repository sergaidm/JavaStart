package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite predlojenie");
		String text = sc.nextLine();

		System.out.println("Kolichestvo slov v predlojenii = " + countWords(text));

	}

	public static int countWords(String text) {
		int count = 1;

		char[] s = { ' ', '.', ',', ':', ';', '!', '?' };
		char[] t = text.toCharArray();

		for (int i = 0; i < t.length; i++) {
			int j = 0;
			if (t[i] != s[j]) {
				j++;
				continue;
			} else {
				count++;
			}
		}

		return count;
	}

}

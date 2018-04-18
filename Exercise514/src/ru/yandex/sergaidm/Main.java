package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		String text = sc.nextLine();
		char[] array = text.toCharArray();
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'b' || array[i] == 'B') {
				n++;
			}
		}
		System.out.println("Number of symbols 'b' in the text: " + n);
	}

}

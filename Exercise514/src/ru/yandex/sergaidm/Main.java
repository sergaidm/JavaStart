package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Napishite predlojenie");
		String text = sc.nextLine();
		System.out.println(text);

		char[] array = text.toCharArray();
		System.out.println(Arrays.toString(array));

		int n = 0;
		for (int i = 0; i < array.length; i++) {
				if (array[i] == 'b' || array[i] == 'B') {
				n += 1;
			}
		}

		System.out.println("Kolichestvo simvolov 'b' v predlojenii = " + n);
	}

}

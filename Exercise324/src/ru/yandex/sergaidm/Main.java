package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Vvedite chislo iz 6 cifr");
		number = sc.nextInt();
		int c1 = number / 100000;
		int c2 = number % 100000 / 10000;
		int c3 = number % 10000 / 1000;
		int c4 = number % 1000 / 100;
		int c5 = number % 100 / 10;
		int c6 = number % 10;
		if ((c1 == c6) & (c2 == c5) & (c3 == c4)) {
			System.out.println("Chislo yavlyaetsya palindromom");
		} else {
			System.out.println("Chislo palindromom ne yavlyaetsya");
		}

	}

}
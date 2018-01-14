package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite dlinu pryamougol'nuka a = ");
		int a = sc.nextInt();
		System.out.println("Vvedite shirinu pryamougol'nuka b = ");
		int b = sc.nextInt();

		drawRectangle(a, b);

	}

	public static void drawRectangle(int a, int b) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1 || i == a || j == 1 || j == b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}

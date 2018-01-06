package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = 0;
		System.out.println("Vvedite shirinu pesochnyh chasov");
		w = sc.nextInt();
		if (w % 2 != 0) {

			int p1 = 1;
			int p2 = w;
			for (int i = 1; i <= w; i++) {
				for (int j = 1; j <= w; j++) {
					if (p1 <= p2) {
						if (j >= p1 & j <= p2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}

					} else {
						if ((j >= p2) & (j <= p1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
				p1++;
				p2--;

			}
		} else {
			System.out.println("Vvedite nechetnoe chislo");
		}
	}
}

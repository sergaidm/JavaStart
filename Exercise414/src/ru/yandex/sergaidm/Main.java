package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int w = 0;
		int h = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the width of rectangle: ");
		w = sc.nextInt();
		System.out.println("Input the height of rectangle: ");
		h = sc.nextInt();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if ((i == 1 & j > 1 & j < w) || (i == h & j > 1 & j < w)) {
					System.out.print("*");
				} else if (j > 1 & j < w) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}

package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Vvedite kolichestvo polos oboev");
		n = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}
	}
}
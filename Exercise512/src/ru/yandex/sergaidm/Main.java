package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite razmer massiva n = ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Vvedite znacheniya massiva");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(a));

	}

}

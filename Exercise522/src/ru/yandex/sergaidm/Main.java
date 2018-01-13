package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite dlinu massiva n = ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10);
		}
		System.out.println("Massiv a: " + Arrays.toString(a));

			for (int i = 0; i < a.length/2; i++) {
				
				int p = a[i];
				a[i] = a[a.length - i - 1];
				a[a.length - i - 1] = p;
											
		}

		System.out.println("Zerkal'nyi massiv: " + Arrays.toString(a));

	}

}

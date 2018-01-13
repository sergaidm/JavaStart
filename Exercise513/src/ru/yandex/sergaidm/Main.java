package ru.yandex.sergaidm;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 15);
		}
		System.out.println(Arrays.toString(a));

		int[] b = Arrays.copyOf(a, 30);

		for (int i = 15; i < b.length; i++) {
			b[i] = 2 * b[i - 15];
		}

		System.out.println(Arrays.toString(b));
	}

}

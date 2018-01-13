package ru.yandex.sergaidm;

public class Main {

	public static void main(String[] args) {
		int[] a = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				b++;
			}

		}
		System.out.println("Kolichestvo nechetnyh cyfr v massive = " + b);
	}

}

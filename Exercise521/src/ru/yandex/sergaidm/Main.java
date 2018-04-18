package ru.yandex.sergaidm;

public class Main {

	public static void main(String[] args) {

		int temp;
		int[][] array = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };

		System.out.println("Base array: " + System.lineSeparator());
		for (int[] k : array) {
			for (int j : k) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int rot = 0; rot < 3; rot++) {
			for (int i = 0; i < array.length / 2; i++) {
				for (int j = i; j < array.length - 1 - i; j++) {
					temp = array[i][j];
					array[i][j] = array[array.length - 1 - j][i];
					array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
					array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
					array[j][array.length - 1 - i] = temp;
				}
			}
			System.out.println(
					System.lineSeparator() + "Rotate of " + (90 * (rot + 1)) + " degrees: " + System.lineSeparator());
			for (int[] k : array) {
				for (int j : k) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
	}

}

package ru.yandex.sergaidm;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[15];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 15);
		}
		System.out.println(Arrays.toString(array));
		int[] b = Arrays.copyOf(array, 30);
		for (int i = 15; i < b.length; i++) {
			b[i] = 2 * b[i - 15];
		}
		System.out.println(Arrays.toString(b));
	}

}

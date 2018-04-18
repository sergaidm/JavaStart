package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array n = ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println("Base array: " + Arrays.toString(array));

		for (int i = 0; i < array.length / 2; i++) {
			int element = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = element;
		}
		System.out.println("\"Mirrored\" array: " + Arrays.toString(array));
		
	}

}

package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite razmer massiva n = ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array));

		int max = getMax(array);

		System.out.println("Maximal'noe chislo massiva = " + max);

	}

	public static int getMax(int[] array) {

		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}

}

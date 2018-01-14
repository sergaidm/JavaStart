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

		System.out.println("Vvedite znachenie elementa massiva: ");
		int element = sc.nextInt();

		System.out.println("Indeks naydennogo elementa massiva = " + findElement(array, element));

	}

	public static int findElement(int[] array, int element) {
		
		int ind = -1;
		for (int i = 0; i < array.length; i++) {
			if (element == array[i]) {
				ind = i;
			}

		}

		return ind;
	}

}

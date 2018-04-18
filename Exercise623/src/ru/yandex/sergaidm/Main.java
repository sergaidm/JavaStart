package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array: ");
		int n = sc.nextInt();
		int[] array = generateArray(n);
		boolean flag = true;
		int i = 0;
		int j = 0;
		int var = 0;
		for (; flag;) {
			printArray(array);
			var++;
			i = findMinI(array);
			j = findMinJ(array, array[i]);
			if (j != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				inversion(array, i + 1);
			} else {
				flag = false;
			}
		}
		System.out.println("Number of permutations: " + var);
	}

	public static int[] generateArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static int findMinI(int[] array) {
		int i = 0;
		for (int j = array.length - 1; j > 0; j--) {
			if (array[j] > array[j - 1]) {
				i = j - 1;
				break;
			}
		}
		return i;
	}

	public static int findMinJ(int[] array, int minI) {
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] > minI) {
				return i;
			}
		}
		return 0;
	}

	public static void inversion(int[] array, int start) {
		Arrays.sort(array, start, array.length);
	}

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}

}

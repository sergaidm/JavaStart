package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("Base array: " + Arrays.toString(array));
		System.out.println("Input value of array element: ");
		int element = sc.nextInt();
		System.out.println("Index of the found array element: " + findElement(array, element));

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

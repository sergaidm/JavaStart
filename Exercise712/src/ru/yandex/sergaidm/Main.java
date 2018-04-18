package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("Standart version of method \"Arrays to String\": " + Arrays.toString(array));
		System.out.println("Own version of method \"Arrays to String\":      " + ArraysToString(array));

	}

	public static String ArraysToString(int[] a) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				sb.append(a[i] + "]");
			} else {
				sb.append(a[i] + ", ");
			}
		}		
		return sb.toString();
	}

}

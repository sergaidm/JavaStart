package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Input values of elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
	}

}

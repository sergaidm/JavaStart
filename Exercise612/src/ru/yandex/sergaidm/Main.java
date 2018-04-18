package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		String text = sc.nextLine();
		System.out.println("Input integer number: ");
		int i = sc.nextInt();
		System.out.println("Input fractional number: ");
		double d = sc.nextDouble();
		System.out.println("Concatenate a string with a sum of numbers: " + getConcat(text, i, d));
	}

	public static String getConcat(String a, int b, double c) {
		return a + " " + (c + b);
	}

}

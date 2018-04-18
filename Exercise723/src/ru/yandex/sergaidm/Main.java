package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input row of numbers: ");
		String rowNumbers = sc.nextLine();
		System.out.println("Minimum number of row of numbers: " + minNumber(rowNumbers));
	}

	public static String minNumber(String text) {
		int min = 1;
		String minNumber = "";
		for (; min <= text.length() / 2;) {
			minNumber = text.substring(0, min);
			boolean f = true;
			for (int i = min; i < text.length(); i = i + min) {
				if (minNumber.compareTo(text.substring(i, i + min)) != 0) {
					f = false;
					break;
				}
			}
			if (f) {
				break;
			}
			min++;
		}
		return minNumber;
	}

}

package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number in binary format: ");
		String num = sc.nextLine();

		char[] t = num.toCharArray();
		
		for (int i = t.length - 1; i >= 0; i--) {
			char s = num.charAt(num.length() - 1 - i);
			if (s == '1') {
				t[i] = 1;

			} else if (s == '0') {
				t[i] = 0;
			}
		}

		int n = 0;
		for (int i = 0; i < t.length; i++) {

			n += (int) (Math.pow(2, i)) * t[i];
		}

		System.out.println("Your number in denary format: " + n);

	}

}

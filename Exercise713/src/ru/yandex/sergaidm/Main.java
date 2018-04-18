package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number in binary format: ");
		int n = 0;
		char[] num = sc.nextLine().toCharArray();		
		for (int i = num.length - 1; i >= 0; i--) {
			n += Integer.valueOf("" + num[i]) << num.length - i - 1;
		}
		String number = new String(num);
		System.out.println("Number " + number + " in denary format: " + n);

	}

}

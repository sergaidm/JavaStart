package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int f = 1;
		System.out.println("Input number n: ");
		n = sc.nextInt();
		if (n > 4 & n < 16) {
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			System.out.println("Factorial of number " + n + " = " + f);
		} else {
			System.out.println("Input number from 5 to 15");
		}
		
	}
}

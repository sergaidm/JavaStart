package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Input a four-digit number: ");
		number = sc.nextInt();
		int c1 = number / 1000;
		int c2 = number % 1000 / 100;
		int c3 = number % 100 / 10;
		int c4 = number % 10;
		int s1 = c1 + c2;
		int s2 = c3 + c4;
		if (s1 > 9) {
			s1 = 1 + (s1 % 10);
		}
		if (s2 > 9) {
			s2 = 1 + (s2 % 10);
		}
		if (s1 == s2) {
			System.out.println("This number is a \"lucky ticket\"");
		} else {
			System.out.println("This number is not a \"lucky ticket\"");
		}

	}

}

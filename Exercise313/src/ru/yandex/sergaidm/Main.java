package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Input a year: ");
		year = sc.nextInt();
		if (year % 4 == 0 & year % 400 == 0) {
			System.out.println("In this year 366 days");
		} else if (year % 4 == 0 & year % 100 == 0) {
			System.out.println("In this year 365 days");
		} else if (year % 4 == 0) {
			System.out.println("In this year 366 days");
		} else {
			System.out.println("In this year 365 days");
		}

	}
}

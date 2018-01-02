package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Vvedite god");
		year = sc.nextInt();

		if (year % 4 == 0 & year % 400 == 0) {
			System.out.println("V etom godu 366 dnei");
		} else if (year % 4 == 0 & year % 100 == 0) {
			System.out.println("V etom godu 365 dnei");
		} else if (year % 4 == 0) {
			System.out.println("V etom godu 366 dnei");
		} else {
			System.out.println("V etom godu 365 dnei");
		}

	}
}

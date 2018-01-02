package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double max;
		System.out.println("Vvedite chislo a");
		a = sc.nextDouble();
		System.out.println("Vvedite chislo b");
		b = sc.nextDouble();
		System.out.println("Vvedite chislo c");
		c = sc.nextDouble();
		System.out.println("Vvedite chislo d");
		d = sc.nextDouble();
		if ((d >= c) & (d >= b) & (d >= a)) {
			max = d;
		} else if ((c >= d) & (c >= b) & (c >= a)) {
			max = c;
		} else if ((b >= d) & (b >= c) & (b >= a)) {
			max = b;
		} else if ((a >= d) & (a >= b) & (a >= c)) {
			max = a;
		} else {
			max = Double.valueOf("Net takogo chisla");
		}

		System.out.println("Maximal'noe chislo = " + max);

	}

}

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
		System.out.println("Input number a");
		a = sc.nextDouble();
		System.out.println("Input number b");
		b = sc.nextDouble();
		System.out.println("Input number c");
		c = sc.nextDouble();
		System.out.println("Input number d");
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
			max = Double.valueOf("There is no such number");
		}
		System.out.println("The maximum number = " + max);

	}

}

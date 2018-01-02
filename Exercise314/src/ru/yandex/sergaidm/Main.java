package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite storony treugol'nika:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (((a + b) > c) & ((a + c) > b) & ((b + c) > a)) {
			System.out.println("Takoi treugol'nik sushchestvuet");
		} else {
			System.out.println("Takogo treugol'nika ne sushchestvuet");
		}
	}

}

package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input sides of triangle : ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (((a + b) > c) & ((a + c) > b) & ((b + c) > a)) {
			System.out.println("This triangle is exists");
		} else {
			System.out.println("This triangle doesn't exist");
		}
	}

}

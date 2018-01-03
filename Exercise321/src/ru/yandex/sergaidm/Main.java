package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r = 4;
		double x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite koordinaty x i y:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r, 2)) {
			System.out.println("Vvedennye koordinaty lejat vnutri kruga");
		} else {
			System.out.println("Vvedennye koordinaty lejat za predelami kruga");
		}

	}

}

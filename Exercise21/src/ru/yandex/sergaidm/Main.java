package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Vvedite pyatiznachnoe chislo");
		number = sc.nextInt();
		System.out.println(number);
		int c1 = number / 10000;
		int c2 = number % 10000 / 1000;
		int c3 = number % 1000 / 100;
		int c4 = number % 100 / 10;
		int c5 = number % 10;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}
}
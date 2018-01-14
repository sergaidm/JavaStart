package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite predlojenie");
		String a = sc.nextLine();
		System.out.println("Vvedite celoe chislo: ");
		int b = sc.nextInt();
		System.out.println("Vvedite veshestvennoe chislo: ");
		double c = sc.nextDouble();

		String d = getConcat(a, b, c);
		System.out.println("Konkatenaciya stroki s summoy chisel: " + d);
	}

	public static String getConcat(String a, int b, double c) {
		return a + " " + (c + b);
	}

}

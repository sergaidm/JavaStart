package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Input radius of circle r = ");
		r = sc.nextDouble();
		System.out.println(r);
		double c = 2 * Math.PI * r;
		System.out.println("Circle length c = " + c);

	}

}
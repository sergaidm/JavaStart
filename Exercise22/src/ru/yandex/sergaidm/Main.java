package ru.yandex.sergaidm;

public class Main {

	public static void main(String[] args) {
		double a = 5;
		double b = 7;
		double c = 8;
		double p = (a + b + c) / 2;
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Ploshchad treugolnika S = " + S);

	}

}

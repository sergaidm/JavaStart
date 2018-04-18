package ru.yandex.sergaidm;

public class Main {

	public static void main(String[] args) {
		for (int i = 2; i <= 11; i++) {
			System.out.println(getNumber("PI", Math.PI, i));
		}
	}

	public static String getNumber(String constantName, double value, int n) {
		String text = String.format(constantName + " = %." + n + "f", value);
		return text;
	}
}

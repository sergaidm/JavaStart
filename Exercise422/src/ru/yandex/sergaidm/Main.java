package ru.yandex.sergaidm;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0 & (i / 2) == 1 || (i % 3) == 0 & (i / 3) == 1 || (i % 5) == 0 & (i / 5) == 1
					|| (i % 7) == 0 & (i / 7) == 1) {
			} else if (i == 1 || (i % 2) == 0 || (i % 3) == 0 || (i % 4) == 0 || (i % 5) == 0 || (i % 6) == 0
					|| (i % 7) == 0 || (i % 8) == 0 || (i % 9) == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
}
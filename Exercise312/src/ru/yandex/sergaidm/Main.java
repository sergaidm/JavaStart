package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flat;
		int frontDoor;
		int floor;
		System.out.println("Vvedite nomer kvartiry flat = ");
		flat = sc.nextInt();

		if (flat >= 1 & flat <= 4 * 4 * 9) {
			frontDoor = ((flat - 1) / (9 * 4)) + 1;
			flat = flat - 36 * (frontDoor - 1);
			floor = (flat + 3) / 4;

			System.out.println("Kvartira raspolojena v pod'ezde " + frontDoor);
			System.out.println("Kvartira raspolojena na etaje " + floor);

		} else {
			System.out.println("V etom dome takoi kvartiry net");
		}

	}

}

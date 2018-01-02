package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floor = 9;
		int frontDoor = 4;
		int flatsOnTheFloor = 4;
		int numberOfFlats = floor * frontDoor * flatsOnTheFloor;
		int flat;
		System.out.println("Vvedite nomer kvartiry flat = ");
		flat = sc.nextInt();
		if (1 <= flat & flat <= (floor * flatsOnTheFloor)) {
			System.out.println("Kvartira raspolojena v 1 pod'ezde");
		}
		if ((floor * flatsOnTheFloor) + 1 <= flat & flat <= (2 * (floor * flatsOnTheFloor))) {
			System.out.println("Kvartira raspolojena vo 2 pod'ezde");
		}
		if ((2 * (floor * flatsOnTheFloor) + 1) <= flat & flat <= (3 * (floor * flatsOnTheFloor))) {
			System.out.println("Kvartira raspolojena v 3 pod'ezde");
		}
		if ((3 * (floor * flatsOnTheFloor) + 1) <= flat & flat <= (4 * (floor * flatsOnTheFloor))) {
			System.out.println("Kvartira raspolojena v 4 pod'ezde");
		}

		

		if (flat > numberOfFlats || flat < 1) {
			System.out.println("V etom dome takoi kvartiry net");
		}

	}

}

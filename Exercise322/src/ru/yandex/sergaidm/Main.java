package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		double ax = 0;
		double ay = 0;
		double bx = 4;
		double by = 4;
		double cx = 6;
		double cy = 1;
		double u11;
		double u12;
		double u21;
		double u22;
		double u31;
		double u32;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite koordinaty x i y:");
		x = sc.nextDouble();
		y = sc.nextDouble();

		/* Vychislim uravneniya pryamyh, obrazovyvayushchih treugol'nik */

		u11 = (x - ax) / (by - ay);
		u12 = (y - ay) / (by - ay);

		if (u11 == u12) {
			y = x;/* Uravnenie pervoi pryamoi */
		}

		u21 = (x - bx) / (cx - bx);
		u22 = (y - by) / (cy - by);

		if (u21 == u22) {
			y = -1.5 * x + 10;/* Uravnenie vtoroi pryamoi */
		}

		u31 = (x - ax) / (cx - ax);
		u32 = (y - cy) / (cy - ay);

		if (u31 == u32) {
			y = x / 6;/* Uravnenie tret'ei pryamoi */
		}

		if ((y <= x) & (y <= -1.5 * x + 10) & (y >= x / 6)) {
			System.out.println("Vvedennye koordinaty lejat vnutri treugol'nika");
		} else {
			System.out.println("Vvedennye koordinaty lejat za predelami treugol'nika");
		}

	}

}
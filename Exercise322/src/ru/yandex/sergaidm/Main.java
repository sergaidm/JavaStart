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
		Scanner sc = new Scanner(System.in);
		System.out.println("Input coordinates of point x i y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		double a = (ax - x) * (by - ay) - (bx - ax) * (ay - y);
		double b = (bx - x) * (cy - by) - (cx - bx) * (by - y);
		double c = (cx - x) * (ay - cy) - (ax - cx) * (cy - y);
		if (a >= 0 & b >= 0 &  c >= 0 || a <= 0 & b <= 0 & c <= 0) {
			System.out.println("This point is located inside the triangle");
		} else {
			System.out.println("This point is located outside the triangle");
		}

	}

}
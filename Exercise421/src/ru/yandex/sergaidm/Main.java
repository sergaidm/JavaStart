package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int h;
		System.out.println("Vvedite vysotu figury");
		h = sc.nextInt();
		
		while (i<2*h-1) {
			if (j>=(h-Math.abs(h-i))) {
				System.out.println();
				i++;
				j=0;
			} System.out.print("*");
			j++;
		}

	}

}

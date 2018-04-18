package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer number N = ");
		int n = sc.nextInt();
		System.out.println("Input second integer number M = ");
		int m = sc.nextInt();
		System.out.println("Hamming distance: " + calculateHammingLength(n, m));
	}
	
	public static int calculateHammingLength(int a, int b) {
		int n = 0;
		int c = a ^ b;
		for (; c > 0;) {
			n +=(c & 1);
			c >>= 1;
		}
		return n;
	}

}

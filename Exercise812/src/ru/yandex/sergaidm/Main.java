package ru.yandex.sergaidm;

//Create a method to save a two-dimensional array of integers into a text file.

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of rows in array n: ");
		int n = sc.nextInt();
		System.out.println("Input number of columns in array m: ");
		int m = sc.nextInt();

		int[][] array = new int[n][m];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}

		}

		File file = new File("Matrix.txt");
		String text = fromArrayToString(array);
		saveTextToFile(text, file);

		System.out.println("Your file saved in file Matrix.txt");
	}

	public static void saveTextToFile(String text, File file) {

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static String fromArrayToString(int[][] array) {
		StringBuilder sb = new StringBuilder();
		for (int[] rows : array) {
			for (int col : rows) {
				sb.append(String.format("%3s  ", "" + col));
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}

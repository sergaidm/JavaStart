package ru.yandex.sergaidm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int[][] array = loadArrayFromFile("Matrix.txt");
		for (int[] rows : array) {
			for (int element : rows) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] loadArrayFromFile(String fileName) {
		File fLoad = new File(fileName);
		if (!fLoad.exists() || fLoad.isDirectory()) {
			System.out.println("File not found. Returns a zero-size array");
			return new int[0][0];
		}
		int i = 0;
		int j = 0;
		int[][] array = new int[calculateArraySize(fLoad)[0]][calculateArraySize(fLoad)[1]];
		try (BufferedReader br = new BufferedReader(new FileReader(fLoad))) {
			String tempLine = "";
			for (; (tempLine = br.readLine()) != null;) {
				String[] cols = tempLine.split(" ");
				for (String rows : cols) {
					array[i][j++] = Integer.valueOf(rows);
				}
				i++;
				j = 0;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return array;
	}

	public static int[] calculateArraySize(File file) {
		int[] array = { 0, 0 };
		int n = 0;
		int k = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String tempLine = "";
			for (; (tempLine = br.readLine()) != null;) {
				n = tempLine.split(" ").length;
				k++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		array[0] = k;
		array[1] = n;
		return array;
	}

}

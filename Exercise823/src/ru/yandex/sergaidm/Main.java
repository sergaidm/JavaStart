package ru.yandex.sergaidm;

/*Create a method for creating an ASCII art in a file.*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		char[][] art = new char[40][40];

		try (PrintWriter pw = new PrintWriter("Art.txt")) {
			pw.println(art(art));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static String art(char[][] art) {
		
		StringBuilder sb = new StringBuilder();
		char character = ' ';
		for (int i = 0; i < art.length; i++) {
			for (int j = 0; j < art[0].length; j++) {
				if (j % 2 != 0) {
					sb.append("+ ");
				} else {
					sb.append("- ");
				}
			}
			sb.append(System.lineSeparator());
		}

		return sb.toString();
	}
	
}

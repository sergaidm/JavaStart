package ru.yandex.sergaidm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String text = textFromFile("Text.txt");
		lettersCounter(text);
	}

	public static String textFromFile(String fileName) {
		String temp = "";
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			for (; (temp = br.readLine()) != null;) {
				sb.append(temp);
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		return sb.toString();
	}

	public static int letters(String letters, String text) {
		int lettersNum = 0;
		for (int i = 0; i <= text.length() - 1; i++) {
			if (text.substring(i, i + 1).compareToIgnoreCase(letters) == 0) {
				lettersNum++;
			}
		}
		return lettersNum;
	}

	public static void lettersCounter(String text) {
		int[] repeats = new int[26];
		char[] lettersArray = new char[26];
		int j = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			lettersArray[j] = i;
			repeats[j] = letters(String.valueOf(i), text);
			j++;
		}
		for (int i = 0; i < repeats.length; i++) {
			for (int k = i; k < repeats.length; k++) {
				if (repeats[i] < repeats[k]) {
					int temp = repeats[i];
					char templ = lettersArray[i];
					repeats[i] = repeats[k];
					lettersArray[i] = lettersArray[k];
					repeats[k] = temp;
					lettersArray[k] = templ;
				}
			}
		}
		for (int i = 0; i < lettersArray.length; i++) {
			if (repeats[i] > 0) {
				System.out.println("The letter \"" + lettersArray[i] + "\" repeat " + repeats[i] + " times in the text");
			}
		}
	}
	
}

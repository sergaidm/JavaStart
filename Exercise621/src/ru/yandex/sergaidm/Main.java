package ru.yandex.sergaidm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = "";
		System.out.println("Input sequence: ");
		text = sc.nextLine();
		int[] array = stringToArray(text);
		System.out.println("Base sequence: " + Arrays.toString(array));
		System.out.println("Next element of sequence: " + sequenceAnalysis(array));

	}

	public static int[] stringToArray(String text) {
		String[] textArray = text.split("[,]");
		int[] array = new int[textArray.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf(textArray[i]);
		}
		return array;
	}

	public static int[] offset(int[] array) {
		int[] arr = new int[array.length - 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = array[i + 1] - array[i];
		}
		return arr;
	}

	public static boolean isSame(int[] array) {
		for (int temp : array) {
			if (temp != array[0]) {
				return false;
			}
		}
		return true;
	}

	public static int arithmeticProgression(int[] array) {
		int n = -1;
		if (isSame(offset(array))) {
			n = array[array.length - 1] + offset(array)[0];
		}
		return n;

	}

	public static int geometricProgression(int[] array) {
		int n = -1;
		if (array[0] != 0) {
			int[] arr = new int[array.length - 1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = array[i + 1] / array[i];
				if (array[i + 1] % array[i] != 0) {
					return n;
				}
			}
			if (isSame(arr)) {
				n = array[array.length - 1] * arr[0];
			}
		}
		return n;
	}

	public static int powerProgression(int[] array) {
		int n = -1;
		if (array[0] != 0) {
			int[] arr = new int[array.length];
			System.arraycopy(array, 0, arr, 0, array.length);
			for (int i = 0; i < array.length - 1; i++) {
				arr = offset(arr);
				if (isSame(arr)) {
					n = (int) Math.pow((array.length + 1), (i + 1));
					break;
				}
			}
		}
		return n;
	}

	public static int sequenceAnalysis(int[] array) {
		int n = -1;
		if ((n = arithmeticProgression(array)) != -1) {
			return n;
		} else if ((n = geometricProgression(array)) != -1) {
			return n;
		} else if ((n = powerProgression(array)) != -1) {
			return n;
		}
		return n;
	}

}

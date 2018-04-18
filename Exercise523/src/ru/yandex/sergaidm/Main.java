package ru.yandex.sergaidm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String dollars = "";
		Scanner sc = new Scanner(System.in);
		String[] numberArray = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tensArray = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		System.out.println("How much money do you have?");
		String[] money = sc.nextLine().split("[,.]");
		if (money[0].length() > 9) {
			System.out.println("Your money should be less than one billion");
		} else {
			int m = Integer.valueOf(money[0]);
			int n1 = m / 1_000_000;
			int n2 = m % 1_000_000 / 1000;
			int n3 = m % 1000;
			int[] moneyArray = { n1, n2, n3 };
			for (int j = 0; j < moneyArray.length; j++) {
				int t = moneyArray[j];
				if (t != 0) {
					dollars += (t / 100 > 0) ? (numberArray[t / 100] + " hundred ") : "";
					dollars += ((t % 100) > 19) ? (tensArray[(t % 100) / 10] + " " + numberArray[(t % 100) % 10] + " ")
							: "";
					dollars += ((t % 100) > 0 && t % 100 <= 19) ? (numberArray[(t % 100)] + " ") : "";
					dollars += (j == 0) ? " million " : "";
					dollars += (j == 1) ? " thousand " : "";
				}
			}
			dollars += (m > 0) ? (" dollars ") : "";
			if (money.length > 1) {
				int cents = Integer.valueOf(money[1].substring(0, money[1].length()));
				cents = ((money[1].length() == 1)) ? cents * 10 : cents;
				if (cents > 0) {
					dollars += (cents / 10 > 1) ? (tensArray[(cents / 10)] + " " + numberArray[cents % 10] + " cents")
							: (numberArray[cents] + " cents");
				}
			}
			System.out.println("You have: " + dollars);
		}
	}

}

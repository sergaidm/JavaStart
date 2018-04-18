package ru.yandex.sergaidm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date dateOne = new Date();
		Date dateTwo = new Date();
		System.out.println("Input date (dd:mm:yyyy)");
		String dateLine = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
		try {
			dateTwo = sdf.parse(dateLine);
		} catch (ParseException e) {
			System.out.println("Invalid date input format");
		}
		String dOne = sdf.format(dateOne);
		String dTwo = sdf.format(dateTwo);
		System.out.println("Current system date: " + dOne);
		System.out.println("Inputed date: " + dTwo);

		if (dOne.substring(6).compareTo(dTwo.substring(6)) != 0) {
			System.out.print("Dates differ for "
					+ Math.abs(Integer.valueOf(dOne.substring(6)) - Integer.valueOf(dTwo.substring(6))) + " years, ");
		}
		if (dOne.substring(3, 5).compareTo(dTwo.substring(3, 5)) != 0) {
			System.out.print(Math.abs(Integer.valueOf(dOne.substring(3, 5)) - Integer.valueOf(dTwo.substring(3, 5)))
					+ " months, ");
		}
		if (dOne.substring(0, 2).compareTo(dTwo.substring(0, 2)) != 0) {
			System.out.print(
					Math.abs(Integer.valueOf(dOne.substring(0, 2)) - Integer.valueOf(dTwo.substring(0, 2))) + " days");
		}

	}
}
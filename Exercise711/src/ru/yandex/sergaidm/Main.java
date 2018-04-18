package ru.yandex.sergaidm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Calendar clOne = Calendar.getInstance();
		Calendar clTwo = Calendar.getInstance();

		clTwo.set(Calendar.MONTH, clOne.get(Calendar.MONTH) - 1);

		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(sdf.format(clOne.getTime()));
		System.out.println(sdf.format(clTwo.getTime()));
		
		Date dateOne = clOne.getTime();
		Date dateTwo = clTwo.getTime();

		long number = dateOne.getTime() - dateTwo.getTime();

		System.out.println("Number of milliseconds per month = " + number);
	}

}

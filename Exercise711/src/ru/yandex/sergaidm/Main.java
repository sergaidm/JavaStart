package ru.yandex.sergaidm;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Calendar cl1 = Calendar.getInstance();
		cl1.get(Calendar.DATE);

		Date date1 = cl1.getTime();
		System.out.println(date1);
		System.out.println(date1.getTime());

		Calendar cl2 = Calendar.getInstance();

		cl2.set(Calendar.YEAR, 2017);
		cl2.set(Calendar.MONTH, Calendar.DECEMBER);
		cl2.set(Calendar.DAY_OF_MONTH, 17);

		Date date2 = cl2.getTime();
		System.out.println(date2);
		System.out.println(date2.getTime());

		long number = date1.getTime() - date2.getTime();

		System.out.println("Number of milliseconds per month = " + number);
	}

}

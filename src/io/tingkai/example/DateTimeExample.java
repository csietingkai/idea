package io.tingkai.example;

import io.tingkai.enumerations.FormatType;
import io.tingkai.model.DateTimeManager;
import io.tingkai.util.SystemModules;

public class DateTimeExample extends Example {

	@Override
	protected void demo() {
		long timeStamp = 1579507470793L;
		String timeStampStr = "2020/01/20 16:04:30";
		
		System.out.println("current date timeStamp: " + SystemModules.getDateTimeManager().getCurrentDate());
		System.out.println("current time timeStamp: " + SystemModules.getDateTimeManager().getCurrentTime());
		System.out.println("current datetime timeStamp: " + SystemModules.getDateTimeManager().getCurrentDateTime());
		
		System.out.println("random datetime timeStamp: " + SystemModules.getDateTimeManager().generate());
		
		System.out.println("parse \"" + timeStamp + "\" to date: " + SystemModules.getDateTimeManager().convert(timeStamp, FormatType.DATE));
		System.out.println("parse \"" + timeStamp + "\" to time: " + SystemModules.getDateTimeManager().convert(timeStamp, FormatType.TIME));
		System.out.println("parse \"" + timeStamp + "\" to datetime: " + SystemModules.getDateTimeManager().convert(timeStamp));

		System.out.println("convert " + timeStampStr + " to timeStamp: " + SystemModules.getDateTimeManager().convert(timeStampStr));

		System.out.println("check 2019 is leap year: " + DateTimeManager.isLeap(2019));
		System.out.println("check 2020 is leap year: " + DateTimeManager.isLeap(2020));
	}
}

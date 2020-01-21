package io.tingkai.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import io.tingkai.enumerations.FormatType;

public class DateTimeManager {
	
	private static final ZoneId ZONE = ZoneId.of("Asia/Taipei");
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd").withZone(ZONE);
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZONE);
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").withZone(ZONE);
	
//	private static final int YEAR_MIN = 1900;
//	private static final int YEAR_MAX = 9999;
	
//	private static final LocalDate START_DATE = LocalDate.of(YEAR_MIN, 1, 1);
//	private static final LocalDate END_DATE = LocalDate.of(YEAR_MAX, 12, 31);
	
	public long getCurrentDate() {
		return LocalDate.now().atStartOfDay(ZONE).toInstant().toEpochMilli();
	}
	
	public long getCurrentTime() {
		return getCurrentDateTime() - getCurrentDate();
	}

	public long getCurrentDateTime() {
		return LocalDateTime.now().atZone(ZONE).toInstant().toEpochMilli();
	}
	
	public boolean verify(String str, FormatType type) {
		DateTimeFormatter formatter = null;
		switch (type) {
			case DATE:
				formatter = DATE_FORMATTER;
				break;
			case TIME:
				formatter = TIME_FORMATTER;
				break;
			case DATE_TIME:
			default:
				formatter = DATE_TIME_FORMATTER;
				break;
		}
		try {
			Instant.from(formatter.parse(str)).toEpochMilli();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public long generate() {
		return this.generate(FormatType.DATE_TIME);
	}
	
	public long generate(FormatType type) {
//		long randomEpochDay = ThreadLocalRandom.current().nextLong(START_DATE.toEpochDay(), END_DATE.toEpochDay());
//	    System.out.println(randomEpochDay);
		switch (type) {
			case DATE:
			case TIME:
			case DATE_TIME:
			default:
				return 0;
		}
	}
	
	public String convert(long timeStamp) {
		return convert(timeStamp, FormatType.DATE_TIME);
	}
	
	public String convert(long timeStamp, FormatType type) {
		switch (type) {
			case DATE:
				return DATE_FORMATTER.format(Instant.ofEpochMilli(timeStamp));
			case TIME:
				return TIME_FORMATTER.format(Instant.ofEpochMilli(timeStamp));
			case DATE_TIME:
			default:
				return DATE_TIME_FORMATTER.format(Instant.ofEpochMilli(timeStamp));
		}
	}
	
	public long convert(String str) {
		return convert(str, FormatType.DATE_TIME);
	}
	
	public long convert(String str, FormatType type) {
		LocalDateTime dateTime = null;
		switch (type) {
			case DATE:
			case TIME:
				System.out.println("not avaliable");
				return -1;
			case DATE_TIME:
			default:
				dateTime = LocalDateTime.parse(str, DATE_TIME_FORMATTER);
		}
		Instant ts = dateTime.atZone(ZONE).toInstant();
		return ts.toEpochMilli();
	}
	
	public static boolean isLeap(int year) {
		boolean isLeap = false;
		if (year % 4 == 0) {
			isLeap = true;
			if (year % 100 == 0) {
				isLeap = false;
				if (year % 400 == 0) {
					isLeap = true;
				}
			}
		}
		return isLeap;
	}
}

package io.tingkai.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

import io.tingkai.enumerations.FormatType;

public class DateTimeManager {
	
	private static final ZoneId ZONE = ZoneId.of("Asia/Taipei");
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("uuuu/MM/dd").withZone(ZONE);
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZONE);
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss").withZone(ZONE);
	
	private static final int YEAR_MIN = 1900;
	private static final int YEAR_MAX = 9999;
	private static final int MONTH_MIN = 1;
	private static final int MONTH_MAX = 12;
	private static final int DAY_MIN = 1;
	private static final int DAY_MAX = 366;
	private static final int HOUR_MIN = 0;
	private static final int HOUR_MAX = 23;
	private static final int MINUTE_MIN = 0;
	private static final int MINUTE_MAX = 59;
	private static final int SECOND_MIN = 0;
	private static final int SECOND_MAX = 59;
	private static final int MILLI_SECOND_MIN = 0;
	private static final int MILLI_SECOND_MAX = 999;
	
	private static final LocalDate START_DATE = LocalDate.of(YEAR_MIN, 1, 1);
	private static final LocalDate END_DATE = LocalDate.of(YEAR_MAX, 12, 31);
	
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
		long randomEpochDay = ThreadLocalRandom.current().nextLong(START_DATE.toEpochDay(), END_DATE.toEpochDay());
	    System.out.println(randomEpochDay);
		switch (type) {
			case DATE:
//				return Instant.from(LocalDateTime.now(ZONE).toLocalDate()).toEpochMilli();
			case TIME:
//				return Instant.from(LocalDateTime.now(ZONE).toLocalTime()).toEpochMilli();
			case DATE_TIME:
			default:
//				return Instant.from(LocalDateTime.now().atZone(ZONE)).toEpochMilli();
				return 0;
		}
	}
	
	public String convert(long timeStamp) {
		return null;
	}
	
	public long convert(String str) {
		return 0;
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

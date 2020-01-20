package io.tingkai.model;

import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;

public class Ipv4Manager {
	
	public boolean verify(String ipStr) {
		boolean isValidFormat = false;
		
		if (Optional.ofNullable(ipStr).isPresent() && Pattern.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}", ipStr)) {
			String[] ipSegments = ipStr.split("\\.");
			if (ipSegments.length == 4) {
				int iIpSegment1 = Integer.parseInt(ipSegments[0]);
				int iIpSegment2 = Integer.parseInt(ipSegments[1]);
				int iIpSegment3 = Integer.parseInt(ipSegments[2]);
				int iIpSegment4 = Integer.parseInt(ipSegments[3]);
				
				isValidFormat = ((iIpSegment1 >= 0) && (iIpSegment1 <= 255));
				isValidFormat = isValidFormat && ((iIpSegment2 >= 0) && (iIpSegment2 <= 255));
				isValidFormat = isValidFormat && ((iIpSegment3 >= 0) && (iIpSegment3 <= 255));
				isValidFormat = isValidFormat && ((iIpSegment4 >= 0) && (iIpSegment4 <= 255));
			}
		}
		
		return isValidFormat;
	}

	public String generate() {
		StringBuilder builder = new StringBuilder();
		Random randomGenerator = new Random();
		for (int i = 0; i < 4; i++) {
			builder.append(randomGenerator.nextInt(256));
			builder.append(".");
		}
		builder.deleteCharAt(builder.length()-1);
		return builder.toString();
	}
}

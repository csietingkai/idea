package io.tingkai.model;

import java.util.HashMap;
import java.util.Map;

public class PasswordManager {

	public boolean checkRepeat(String passwordStr, int repeatCount) {
		boolean isValid = true;
		Map<Character, Integer> counter = new HashMap<Character, Integer>();
		for (int i = 0; i < passwordStr.length(); i++) {
			char ch = passwordStr.charAt(i);
			if (!counter.containsKey(ch)) {
				counter.put(ch, 0);
			}
			int currentCount = counter.get(ch);
			if (currentCount == repeatCount - 1) {
				isValid = false;
				break;
			}
			counter.put(ch, currentCount + 1);
		}
		
		return isValid;
	}
	
	public boolean checkRepeatInRow(String passwordStr, int repeatCount) {
		boolean isValid = true;
		
		for (int i = 0; i < passwordStr.length() - repeatCount + 1;) {
			int sameCounter = 0;
			for (int j = 1; j < repeatCount; j++) {
				if (passwordStr.charAt(i) == passwordStr.charAt(i+j)) {
					sameCounter++;
				}
				else {
					i += j - 1;
					break;
				}
			}
			if (sameCounter == repeatCount - 1) {
				isValid = false;
				break;
			}
			i++;
		}
		
		return isValid;
	}
	
	public String generate(int length, boolean containReapeat) {
		// TODO
		return "";
	}
}

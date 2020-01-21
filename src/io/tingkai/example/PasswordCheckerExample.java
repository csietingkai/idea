package io.tingkai.example;

import io.tingkai.util.SystemModules;

public class PasswordCheckerExample extends Example {

	@Override
	protected void demo() {
		String passwordStr = "abbcccddddcdcd";
		int repeatCount = 5;
		
		boolean repeatInRowResult = SystemModules.getPasswordManager().checkRepeatInRow(passwordStr, repeatCount);
		boolean repeatResult = SystemModules.getPasswordManager().checkRepeat(passwordStr, repeatCount);
		
		System.out.println("password: " + passwordStr + 
				", repeatCount: " + repeatCount + 
				", checkRepeatInRow isValid result: " + repeatInRowResult);
		System.out.println("password: " + passwordStr + 
				", repeatCount: " + repeatCount + 
				", checkRepeat isValid result: " + repeatResult);
	}
}

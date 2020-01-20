package io.tingkai.example;

import io.tingkai.model.PasswordChecker;

public class PasswordCheckerExample extends Example {

	@Override
	public void demo() {
		String passwordStr = "abbcccddddcdcd";
		int repeatCount = 5;
		PasswordChecker checker = new PasswordChecker();
		
		long repeatInRowStartTime = System.nanoTime();
		boolean repeatInRowResult = checker.checkRepeatInRow(passwordStr, repeatCount);
		long repeatInRowEndTime = System.nanoTime();
		
		long repeatStartTime = System.nanoTime();
		boolean repeatResult = checker.checkRepeat(passwordStr, repeatCount);
		long repeatEndTime = System.nanoTime();
		
		System.out.println("password: " + passwordStr + 
				", repeatCount: " + repeatCount + 
				", checkRepeatInRow isValid result: " + repeatInRowResult + 
				", time spent: " + (repeatInRowEndTime - repeatInRowStartTime) + " nanoseconds");
		System.out.println("password: " + passwordStr + 
				", repeatCount: " + repeatCount + 
				", checkRepeat isValid result: " + repeatResult + 
				", time spent: " + (repeatEndTime - repeatStartTime) + " nanoseconds");
	}
	
	
}

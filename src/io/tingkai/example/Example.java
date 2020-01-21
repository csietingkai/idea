package io.tingkai.example;

public abstract class Example {
	public void run() {
		long startTime = System.nanoTime();
		demo();
		long endTime = System.nanoTime();
		System.out.println("run " + getExampleName() + ".demo() time: " + (endTime - startTime));
	}
	
	protected abstract void demo();
	
	public String getExampleName() {
		return this.getClass().getSimpleName();
	}
}

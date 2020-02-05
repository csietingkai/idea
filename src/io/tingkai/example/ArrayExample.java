package io.tingkai.example;

import java.util.Arrays;

public class ArrayExample extends Example {

	@Override
	protected void demo() {
		Integer[] arr1 = { 1, 2, 3 };
		Integer[] arr2 = { 4, 5, 6 };
		Integer[] arr3 = { 7, 8, 9, 10 };
		Integer[] arr4 = { 11, 12, 13 };
		
		Integer[] combine = this.concat(arr1, arr2, arr3, arr4);
		for (Integer integer : combine) {
			System.out.println(integer);
		}
	}

	@SuppressWarnings("unchecked")
	private <T> T[] concat(T[] first, T[] ...others) {
		int length = first.length;
		for (T[] other : others) {
			length += other.length;
		}
		T[] result = Arrays.copyOf(first, length);
		int offset = first.length;
		for (T[] other : others) {
			System.arraycopy(other, 0, result, offset, other.length);
			offset += other.length;
		}
		return result;
	}
}

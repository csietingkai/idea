package io.tingkai.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample extends Example {

	@Override
	protected void demo() {
		Integer[] arr1 = { 1, 2, 3 };
		Integer[] arr2 = { 4, 5, 6 };
		Integer[] arr3 = { 7, 8, 9, 10 };
		Integer[] arr4 = { 11, 12, 13 };
		
		Integer[] combineArray = this.concat(arr1, arr2, arr3, arr4);
		StringBuilder arrayBuilder = new StringBuilder();
		arrayBuilder.append("combineArray: (");
		int length = 0;
		for (Integer integer : combineArray) {
			arrayBuilder.append(integer);
			length++;
			if (length != combineArray.length) {
				arrayBuilder.append(", ");
			}
		}
		arrayBuilder.subSequence(0, arrayBuilder.length()-2);
		arrayBuilder.append("), length: ");
		arrayBuilder.append(combineArray.length);
		System.out.println(arrayBuilder.toString());
		
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9, 10);
		List<Integer> list4 = Arrays.asList(11, 12, 13);
		
		@SuppressWarnings("unchecked")
		List<Integer> combineList = this.concat(list1, list2, list3, list4);
		StringBuilder listBuilder = new StringBuilder();
		listBuilder.append("combineList: (");
		length = 0;
		for (Integer integer : combineList) {
			listBuilder.append(integer);
			length++;
			if (length != combineList.size()) {
				listBuilder.append(", ");
			}
		}
		listBuilder.append("), length: ");
		listBuilder.append(combineList.size());
		System.out.println(listBuilder.toString());
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
	
	@SuppressWarnings("unchecked")
	private <T> List<T> concat(List<T> first, List<T>... others) {
		List<T> result = new ArrayList<T>(first);
		
		for (List<T> other : others) {
			result.addAll(other);
		}
		
		return result;
	}
}

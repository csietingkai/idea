package io.tingkai.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.tingkai.entity.Item;

public class StreamMapExample extends Example {
	
	@Override
	protected void demo() {
		List<Item<String, String>> list = new ArrayList<Item<String, String>>();
		list.add(new Item<String, String>("A", "B"));
		list.add(new Item<String, String>("A", "C"));
		list.add(new Item<String, String>("B", "D"));
		list.add(new Item<String, String>("D", "E"));
		list.add(new Item<String, String>("D", "F"));
		list.add(new Item<String, String>("A", "I"));
		list.add(new Item<String, String>("F", "J"));
		list.add(new Item<String, String>("F", "K"));
		list.add(new Item<String, String>("Z", "L"));
		list.add(new Item<String, String>("X", "M"));
		list.add(new Item<String, String>("X", "N"));

		Map<String, List<Item<String, String>>> mapped = list.stream()
		                .collect(Collectors.groupingBy(item -> item.getKey())); 
		System.out.println(mapped);
	}
}

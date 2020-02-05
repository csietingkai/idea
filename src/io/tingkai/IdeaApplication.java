package io.tingkai;

import java.util.ArrayList;
import java.util.List;

import io.tingkai.example.ActionLogExample;
import io.tingkai.example.ArrayExample;
import io.tingkai.example.DateTimeExample;
import io.tingkai.example.Example;
import io.tingkai.example.IdnoExample;
import io.tingkai.example.Ipv4Example;
import io.tingkai.example.PasswordCheckerExample;
import io.tingkai.example.StreamMapExample;

public class IdeaApplication {

	public static void main(String[] args) {
		IdeaApplication app = new IdeaApplication();
		app.runExamples();
	}
	
	private void runExamples() {
		List<Example> examples = new ArrayList<>();
		examples.add(new ActionLogExample());
		examples.add(new ArrayExample());
		examples.add(new DateTimeExample());
		examples.add(new IdnoExample());
		examples.add(new Ipv4Example());
		examples.add(new PasswordCheckerExample());
		examples.add(new StreamMapExample());
		
		examples.stream().forEach((Example example) -> {
			example.run();
		});
	}
}

package builder;

import java.util.ArrayList;

public class PatternBuilder {

	private final ArrayList<String> dinner = new ArrayList<>();

	public void Add(String dish) {
		dinner.add(dish);
	}

	public void show() {
		for (String dish : dinner) {
			System.out.println(dish);
		}
	}
}

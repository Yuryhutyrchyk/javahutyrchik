package chefCook;

/**
 * Abstract class that has an abstract method "preparation". In this class, each
 * member of a static list acquires particular importance calories.
 * 
 * @author Yura
 */

public abstract class Vegetable {
	private int calorie;
	private int weight;
	private String name;
	private Vegetabl list = Vegetabl.Vgtbl;

	private enum Vegetabl {
		Vgtbl, carrot, beet, salt, dill, pepper, peas, tomato, cucumber, potato
	}

	Vegetable(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	abstract String preparation();

	// It determines the number of calories in 100 grams of each vegetable
	int getCalor() {
		switch (Vegetabl.valueOf(name)) {
		case carrot:
			calorie = 123;
			break;
		case beet:
			calorie = 97;
			break;
		case salt:
			calorie = 6;
			break;
		case dill:
			calorie = 9;
			break;
		case pepper:
			calorie = 127;
			break;
		case peas:
			calorie = 174;
			break;
		case tomato:
			calorie = 99;
			break;
		case cucumber:
			calorie = 55;
			break;
		case potato:
			calorie = 153;
			break;
		default:
			calorie = 0;
			System.out.println(Restaurant.rb.getString("unknownIngredient"));
		}
		return calorie;
	}

	int getWeight() {
		return weight;
	}

	String getName() {
		return name;
	}

	public Vegetabl getList() {
		return list;
	}

	public void setList(Vegetabl list) {
		this.list = list;
	}
}
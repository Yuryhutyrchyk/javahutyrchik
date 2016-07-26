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
		Vgtbl, Carrot, Beet, Salt, Dill, BellPepper, Peas, Tomato, Cucumber, Potato
	}

	Vegetable(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	abstract String preparation();

	// It determines the number of calories in 100 grams of each vegetable
	int getCalor() {
		switch (Vegetabl.valueOf(name)) {
		case Carrot:
			calorie = 123;
			break;
		case Beet:
			calorie = 97;
			break;
		case Salt:
			calorie = 6;
			break;
		case Dill:
			calorie = 9;
			break;
		case BellPepper:
			calorie = 127;
			break;
		case Peas:
			calorie = 174;
			break;
		case Tomato:
			calorie = 99;
			break;
		case Cucumber:
			calorie = 55;
			break;
		case Potato:
			calorie = 153;
			break;
		default:
			calorie = 0;
			System.out.println("unknown ingredient");
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
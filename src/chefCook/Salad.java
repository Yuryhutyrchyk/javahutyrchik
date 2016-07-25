package chefCook;

/**
 * 
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Salad {
	String name;
	List<Vegetable> salad;

	/** constructor without parameters - method of " salad " creates an object
	 *  consisting of a list of " vegetables "
	 */
	Salad() {
		salad = new ArrayList<Vegetable>();
	}
	/** The constructor for a variable number of parameters - method of " salad " creates
	 *  an object that consists of the name of salad and a list of " vegetables "
	 */
	Salad(String name, Vegetable... components) {
		this.name = name;
		salad = new ArrayList<Vegetable>();
		for (Vegetable v : components) {
			this.salad.add(v);
		}
	}

	private String getName() {
		return name;
	}

	public Salad setName(String name) {
		this.name = name;
		return this;
	}

	public Salad setComponent(Vegetable v) {
		this.salad.add(v);
		return this;
	}

	// Method calculates the total caloric salad
	private int foodValue() {
		int v = 0;
		for (Vegetable c : salad) {
			v += Math.round((double) c.getWeight() * c.getCalor() / 100);
		}
		return v;
	}

	@Override
	public String toString() {
		//salad sorts , taking on input parameters by type of Vegetable
		salad.sort(new TypeComparator());
		String smin = "";
		String smax = "";
		int salcalor = this.foodValue();
		String s = "Salad " + this.getName() + (char) 13 + "-------------------" + (char) 13;
		for (Vegetable v : salad) {
			long c = Math.round((double) v.getWeight() * v.getCalor() / 100);
			if (c < .1 * salcalor)
				smin += v.getName() + "  ";
			if (c > .3 * salcalor)
				smax += v.getName() + "  ";
			s = s + v.getName() + "  " + v.getWeight() + " gm  " + v.preparation() + (char) 13;
		}

		return s + "Calories: " + salcalor + " kcal" + (char) 13 + "-------------------" + (char) 13
				+ "The most high-calorie ingredient: " + smax
				+ (char) 13 + "The least-calorie ingredient: " + smin + (char) 13;
	}

	//Compare vegetables for processing type
	private static class TypeComparator implements Comparator<Vegetable> {
		
		@Override
		//redefines the method of comparison
		public int compare(Vegetable one, Vegetable two) {
			if (one.getClass() == two.getClass())
				return 0;
			
			//hashCode () that if you do not check the " < > " , then there are problems with sorting
			else if (one.getClass().hashCode() > two.getClass().hashCode())
				return 1;
			else if (one.getClass().hashCode() < two.getClass().hashCode())
				return -1;
			return 0;
		}

	}

}

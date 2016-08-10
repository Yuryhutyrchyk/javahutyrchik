package chefCook;

/**
 * This class has ish arguments variable length , has a method calculate
 * the total calorie dishes , has overridden method "toString", and it
 * incorporates the class that implements the method specified in the interface
 * 
 * @author Yura
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Salad {
	String name;
	List<Vegetable> salad;

	Salad() {
		salad = new ArrayList<Vegetable>();
	}

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
		// interface specifies the method that is implemented in the class
		salad.sort(new TypeComparator());
		String smin = "";
		String smax = "";
		long cmin = 0;
		long cmax = 0;
		int salcalor = this.foodValue();
		String s = this.getName() + (char) 13 + "-------------------" + (char) 13;
		for (Vegetable v : salad) {
			long c = Math.round((double) v.getWeight() * v.getCalor() / 100);
			if (c < .1 * salcalor) {
				smin += v.getName() + "  ";
				cmin = c;
			}
			if (c > .3 * salcalor) {
				smax += v.getName() + "  ";
				cmax = c;
			}
			s = s + v.getName() + "  " + v.getWeight() + " g " + v.preparation() + (char) 13;
		}
		return s + Restaurant.rb.getString("calories") + salcalor + Restaurant.rb.getString("kcal") + (char) 13 + "-------------------" + (char) 13
				+ Restaurant.rb.getString("theMostHighCalorieIngredient") + smax + cmax + Restaurant.rb.getString("kcal") + (char) 13
				+ Restaurant.rb.getString("theLeastCalorieIngredient") + smin + cmin + Restaurant.rb.getString("kcal") + (char) 13;
	}

	// class implements the method specified in the interface
	private static class TypeComparator implements Comparator<Vegetable> {
		@Override
		public int compare(Vegetable one, Vegetable two) {
			if (one.getClass() == two.getClass())
				return 0;
			else if (one.getClass().hashCode() > two.getClass().hashCode())
				return 1;
			else if (one.getClass().hashCode() < two.getClass().hashCode())
				return -1;
			return 0;
		}
	}
}

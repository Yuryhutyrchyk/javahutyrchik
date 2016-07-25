package chefCook;

/**
 * It describes a class chef and determines its functionality
 */

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name; // chef's name

	// Default constructor. Chef's name is Bob.
	public Chef() {
		name = "Yura";
	}

	public String getName() {
		return name;
	}

	public Chef setName(String name) {
		this.name = name;
		return this;
	}

	// method creates an object salad, in the parameters name and sends it to
	// the list of ingredients
	public void makeVinaigrette() {
		Salad Vinaigrette = new Salad("Vinaigrette", new BoiledVegetables("Carrot", 50),
				new BoiledVegetables("Beet", 65), new CannedVegetable("Peas", 60), new RawVegetables("Tomato", 70),
				new SpicyVegetable("Dill", 10), new BoiledVegetables("Potato", 130));
		System.out.println(Vinaigrette);
		System.out.println("Salad Vinaigrette is ready!");
		System.out.println("-------------------" + (char) 13);
	}

	public void makeSpring() {
		List<Salad> Spring = new ArrayList<>();
		Spring.add(new Salad().setName("Spring").setComponent(new RawVegetables("Tomato", 80))
				.setComponent(new RawVegetables("Cucumber", 120)).setComponent(new RawVegetables("BellPepper", 100))
				.setComponent(new SpicyVegetable("Salt", 10)));
		System.out.println(Spring);
		System.out.println("Salad Spring is ready!");
		System.out.println("-------------------" + (char) 13);
	}

	public void fryPotato() {
		List<Salad> frenchFries = new ArrayList<>();
		frenchFries.add(new Salad().setName("French fries").setComponent(new FriesVegetable("Tomato", 300))
				.setComponent(new SpicyVegetable("Salt", 10)));
		System.out.println(frenchFries);
		System.out.println("French Fries is ready!");
		System.out.println("-------------------" + (char) 13);
	}
}

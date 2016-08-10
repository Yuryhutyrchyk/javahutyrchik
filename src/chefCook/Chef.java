package chefCook;

/**
 * This class describes the class chef and determines its functionality
 * 
 * @author Yura
 */

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name;

	public Chef() {
		name = Restaurant.rb.getString("yura");
	}

	public String getName() {
		return name;
	}

	public Chef setName(String name) {
		this.name = name;
		return this;
	}

	public void makeVinaigrette() {
		Salad Vinaigrette = new Salad(Restaurant.rb.getString("vinaigrette"), new BoiledVegetables("carrot", 50),
				new BoiledVegetables("beet", 65), new CannedVegetable("peas", 60), new RawVegetables("tomato", 70),
				new SpicyVegetable("dill", 10), new BoiledVegetables("potato", 130));
		System.out.println(Vinaigrette);
		System.out.println(Restaurant.rb.getString("saladVinaigretteIsReady"));
		System.out.println("-------------------" + (char) 13);
	}

	public void makeSpring() {
		List<Salad> Spring = new ArrayList<>();
		Spring.add(new Salad().setName(Restaurant.rb.getString("spring")).setComponent(new RawVegetables("tomato", 80))
				.setComponent(new RawVegetables("cucumber", 120)).setComponent(new RawVegetables("pepper", 100))
				.setComponent(new SpicyVegetable("salt", 10)));
		System.out.println(Spring);
		System.out.println(Restaurant.rb.getString("saladSpringIsReady"));
		System.out.println("-------------------" + (char) 13);
	}

	public void fryPotato() {
		List<Salad> frenchFries = new ArrayList<>();
		frenchFries.add(new Salad().setName(Restaurant.rb.getString("frenchFries")).setComponent(new FriesVegetable("tomato", 300))
				.setComponent(new SpicyVegetable("salt", 20)));
		System.out.println(frenchFries);
		System.out.println(Restaurant.rb.getString("frenchFriesIsReady"));
		System.out.println("-------------------" + (char) 13);
	}
}

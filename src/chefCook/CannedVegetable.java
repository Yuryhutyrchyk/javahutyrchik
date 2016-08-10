package chefCook;

/**
 * This class extends the parent class , it inherits the properties and
 * determines the characteristic of the class method "preparation"
 * implementation.
 * 
 * @author Yura
 */

public class CannedVegetable extends Vegetable {
	public CannedVegetable(String name, int weight) {
		super(name, weight);
	}

	// implements declared in the parent class abstract method
	public String preparation() {
		return Restaurant.rb.getString("openAdd");
	}
}
package chefCook;

public class SpicyVegetable extends Vegetable{
	public SpicyVegetable (String name, int weight){
		super(name, weight);
	}
	//implements declared in the parent class abstract method
	public String preparation(){
		return "Add";
	}
}


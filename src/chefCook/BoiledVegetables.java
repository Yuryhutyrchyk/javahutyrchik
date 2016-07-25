package chefCook;

public class BoiledVegetables extends Vegetable{
	public BoiledVegetables (String name, int weight){
		super(name, weight);
	}
	//implements declared in the parent class abstract method
	public String preparation(){
		return "Boil, cut, add";
	}
}
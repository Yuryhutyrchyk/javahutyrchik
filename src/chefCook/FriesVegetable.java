package chefCook;

public class FriesVegetable extends Vegetable{
	public FriesVegetable (String name, int weight){
		super(name, weight);
	}
	//implements declared in the parent class abstract method
	public String preparation(){
		return "Wash, cut, fry";
	}
}
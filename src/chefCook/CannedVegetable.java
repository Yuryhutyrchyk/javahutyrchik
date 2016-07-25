package chefCook;

public class CannedVegetable extends Vegetable{
	public CannedVegetable (String name, int weight){
		super(name, weight);
	}
	//implements declared in the parent class abstract method
	public String preparation(){
		return "Open, add";
	}
}
package chefCook;

public class RawVegetables extends Vegetable{
	public RawVegetables (String name, int weight){
		super(name, weight);
	}
	//implements declared in the parent class abstract method
	public String preparation(){
		return "Wash, cut, add";
	}
}

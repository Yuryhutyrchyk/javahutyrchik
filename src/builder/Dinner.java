package builder;

public class Dinner extends DinnerBuilder {
	private PatternBuilder dinner = new PatternBuilder();
	
	public void buildFirstDish() {
		dinner.Add("Soup");
	}

	public void buildMainDish() {
		dinner.Add("Pizza");
	}

	public void buildDesert() {
		dinner.Add("Hot chocolate");
	}

	public PatternBuilder getDinner() {
		return dinner;
	} 
}
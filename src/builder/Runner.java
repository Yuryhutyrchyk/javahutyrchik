package builder;

public class Runner {
	public static void main(String[] args) {
		DinnerBuilder dinner = new Dinner();
		PatternBuilder patternBuilder = Customer.order(dinner);
		patternBuilder.show();
	}
}
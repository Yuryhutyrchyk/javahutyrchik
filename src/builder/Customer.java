package builder;

public class Customer {
	public static PatternBuilder order(DinnerBuilder builder) {
		builder.buildFirstDish();
		builder.buildMainDish();
		builder.buildDesert();
		return builder.getDinner();
	}
}

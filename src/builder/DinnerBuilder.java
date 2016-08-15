package builder;

public abstract class DinnerBuilder {
	public abstract PatternBuilder getDinner();

	public abstract void buildFirstDish();

	public abstract void buildMainDish();

	public abstract void buildDesert();
}

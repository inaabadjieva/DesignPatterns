package decoratorPattern.coffeeShop.flavours;

import decoratorPattern.coffeeShop.Coffee;
import decoratorPattern.coffeeShop.FlavourDecorator;

public class Milk extends FlavourDecorator {
	Coffee beverage;

	public Milk(Coffee beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}

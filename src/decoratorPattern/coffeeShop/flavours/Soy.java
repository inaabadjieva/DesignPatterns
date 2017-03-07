package decoratorPattern.coffeeShop.flavours;

import decoratorPattern.coffeeShop.Coffee;
import decoratorPattern.coffeeShop.FlavourDecorator;

public class Soy extends FlavourDecorator {
	Coffee beverage;

	public Soy(Coffee beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}

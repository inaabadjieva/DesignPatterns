package decoratorPattern.coffeeShop.flavours;

import decoratorPattern.coffeeShop.Coffee;
import decoratorPattern.coffeeShop.FlavourDecorator;

public class Whip extends FlavourDecorator {
	Coffee beverage;
 
	public Whip(Coffee beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}

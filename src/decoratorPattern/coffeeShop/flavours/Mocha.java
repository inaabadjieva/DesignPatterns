package decoratorPattern.coffeeShop.flavours;

import decoratorPattern.coffeeShop.Coffee;
import decoratorPattern.coffeeShop.FlavourDecorator;

public class Mocha extends FlavourDecorator {
	Coffee beverage;
 
	public Mocha(Coffee beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}

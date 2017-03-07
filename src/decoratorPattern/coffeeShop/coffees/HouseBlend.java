package decoratorPattern.coffeeShop.coffees;

import decoratorPattern.coffeeShop.Coffee;

public class HouseBlend extends Coffee {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}


package decoratorPattern.coffeeShop.coffees;

import decoratorPattern.coffeeShop.Coffee;

public class DarkRoast extends Coffee {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}


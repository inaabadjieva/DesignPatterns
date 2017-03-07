package decoratorPattern.coffeeShop.coffees;

import decoratorPattern.coffeeShop.Coffee;

public class Decaf extends Coffee {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}


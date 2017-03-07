package decoratorPattern.coffeeShop.coffees;

import decoratorPattern.coffeeShop.Coffee;

public class Espresso extends Coffee {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}


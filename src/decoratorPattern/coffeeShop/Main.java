package decoratorPattern.coffeeShop;

import decoratorPattern.coffeeShop.coffees.DarkRoast;
import decoratorPattern.coffeeShop.coffees.Espresso;
import decoratorPattern.coffeeShop.coffees.HouseBlend;
import decoratorPattern.coffeeShop.flavours.Mocha;
import decoratorPattern.coffeeShop.flavours.Soy;
import decoratorPattern.coffeeShop.flavours.Whip;

public class Main {
 
	public static void main(String args[]) {
		Coffee beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
 
		Coffee beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
 
		Coffee beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}

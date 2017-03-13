package factoryPattern.pizzaFramework;

import factoryPattern.pizzaFramework.pizzas.Pizza;
import factoryPattern.pizzaFramework.stores.ChicagoPizzaStore;
import factoryPattern.pizzaFramework.stores.NYPizzaStore;
import factoryPattern.pizzaFramework.stores.PizzaStore;

public class Main {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}

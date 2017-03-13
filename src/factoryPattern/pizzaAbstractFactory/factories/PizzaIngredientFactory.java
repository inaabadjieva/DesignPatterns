package factoryPattern.pizzaAbstractFactory.factories;

import factoryPattern.pizzaAbstractFactory.cheese.Cheese;
import factoryPattern.pizzaAbstractFactory.clams.Clams;
import factoryPattern.pizzaAbstractFactory.dough.Dough;
import factoryPattern.pizzaAbstractFactory.peperoni.Pepperoni;
import factoryPattern.pizzaAbstractFactory.sauce.Sauce;
import factoryPattern.pizzaAbstractFactory.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}

package factoryPattern.pizzaAbstractFactory.factories;

import factoryPattern.pizzaAbstractFactory.cheese.Cheese;
import factoryPattern.pizzaAbstractFactory.cheese.ReggianoCheese;
import factoryPattern.pizzaAbstractFactory.clams.Clams;
import factoryPattern.pizzaAbstractFactory.clams.FreshClams;
import factoryPattern.pizzaAbstractFactory.dough.Dough;
import factoryPattern.pizzaAbstractFactory.dough.ThinCrustDough;
import factoryPattern.pizzaAbstractFactory.peperoni.Pepperoni;
import factoryPattern.pizzaAbstractFactory.peperoni.SlicedPepperoni;
import factoryPattern.pizzaAbstractFactory.sauce.MarinaraSauce;
import factoryPattern.pizzaAbstractFactory.sauce.Sauce;
import factoryPattern.pizzaAbstractFactory.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}

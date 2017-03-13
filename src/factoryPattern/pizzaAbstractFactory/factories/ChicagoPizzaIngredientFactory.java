package factoryPattern.pizzaAbstractFactory.factories;

import factoryPattern.pizzaAbstractFactory.cheese.Cheese;
import factoryPattern.pizzaAbstractFactory.cheese.MozzarellaCheese;
import factoryPattern.pizzaAbstractFactory.clams.Clams;
import factoryPattern.pizzaAbstractFactory.clams.FrozenClams;
import factoryPattern.pizzaAbstractFactory.dough.Dough;
import factoryPattern.pizzaAbstractFactory.dough.ThickCrustDough;
import factoryPattern.pizzaAbstractFactory.peperoni.Pepperoni;
import factoryPattern.pizzaAbstractFactory.peperoni.SlicedPepperoni;
import factoryPattern.pizzaAbstractFactory.sauce.PlumTomatoSauce;
import factoryPattern.pizzaAbstractFactory.sauce.Sauce;
import factoryPattern.pizzaAbstractFactory.veggies.BlackOlives;
import factoryPattern.pizzaAbstractFactory.veggies.Eggplant;
import factoryPattern.pizzaAbstractFactory.veggies.Spinach;
import factoryPattern.pizzaAbstractFactory.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}

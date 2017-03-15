package strategyPattern.ducks;

import strategyPattern.flyBehavior.FlyNoWay;
import strategyPattern.quackBehavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}

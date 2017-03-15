package strategyPattern.quackBehavior;

import strategyPattern.quackBehavior.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}

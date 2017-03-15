package strategyPattern;

import strategyPattern.ducks.DecoyDuck;
import strategyPattern.ducks.MallardDuck;
import strategyPattern.ducks.ModelDuck;
import strategyPattern.ducks.RubberDuck;
import strategyPattern.flyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
 
		ModelDuck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}

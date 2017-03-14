package adapterPattern.ducks;

import adapterPattern.ducks.duck.Duck;
import adapterPattern.ducks.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		//because ducks fly longer distance
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}

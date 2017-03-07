package observerPattern.displays;

import observerPattern.DisplayElement;
import observerPattern.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}

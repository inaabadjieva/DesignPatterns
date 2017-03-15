package iteratorPattern.customIterator;

import iteratorPattern.customIterator.menus.DinerMenu;
import iteratorPattern.customIterator.menus.PancakeHouseMenu;

public class Main {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
 
		waitress.printMenu();
	}
}

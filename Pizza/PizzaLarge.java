package Pizza;

public class PizzaLarge implements PizzaTop {
	double price = 14;
	
	public double getPrice() {
		return this.price + PizzaTop.PIZZA_TOPPING*12;
	}
	@Override
	public void size() {
		String size = "Large";
		System.out.println("Dit is Pizza For The Hungry, size " + size + ".");
		
		
	}

	@Override
	public void Topping() {
		int cheese = 4;
		int ham = 4;
		int pepperoni = 4;
		System.out.println("The Hungry pizza bevat " + cheese + "x kaas, " + ham + "x ham en " + pepperoni + "x pepperoni. Eet smakkelijk!");
		
	}

}

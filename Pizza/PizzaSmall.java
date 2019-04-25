package Pizza;

public class PizzaSmall implements PizzaTop {
	double price = 10;
	
	public double getPrice() {
		return this.price + PizzaTop.PIZZA_TOPPING*4;
	}
	@Override
	public void size() {
		String size = "Small";
		System.out.println("Dit is Pizza Little, size " + size + ".");
		
	}

	@Override
	public void Topping() {
		int cheese = 1;
		int ham = 3;
		int pepperoni = 0;
		System.out.println("Pizza Little bevat " + cheese + "x kaas, " + ham + "x ham en " + pepperoni + "x pepperoni. Eet smakkelijk!");
		
	}

}

package Pizza;

public class PizzaMedium implements PizzaTop {
	double price = 12;
	
	public double getPrice() {
		return this.price + PizzaTop.PIZZA_TOPPING*7;
	}
	
	
	@Override
	public void size() {
		String size = "Medium";
		System.out.println("Dit is The Regular Pizza, size " + size + ".");
		
	}

	@Override
	public void Topping() {
		int cheese = 2;
		int ham = 3;
		int pepperoni = 2;
		System.out.println("The Regular pizza bevat " + cheese + "x kaas, " + ham + "x ham en " + pepperoni + "x pepperoni. Eet smakkelijk!");
	}

}

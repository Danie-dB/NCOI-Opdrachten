package Pizza;

public class PizzaVerkoop {

	public static void main(String[] args) {
		PizzaSmall S = new PizzaSmall();
		S.size();
		S.Topping();
		System.out.println("Lekker gegeten? De maaltijd kost: " + S.getPrice() + " dollar. \n");

		PizzaMedium M = new PizzaMedium();
		M.size();
		M.Topping();
		System.out.println("Lekker gegeten? De maaltijd kost: " + M.getPrice() + " dollar. \n");
		
		PizzaLarge L = new PizzaLarge();
		L.size();
		L.Topping();
		System.out.println("Lekker gegeten? De maaltijd kost: " + L.getPrice() + " dollar.");
	}
}

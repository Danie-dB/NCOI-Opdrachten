package les4Overerving;

public class OvererveringApp {
	public static void main(String[] args) {
		Student a = new Student("Klaas", "Jansen", 5621552, "Informatica");
		System.out.println("         krijgt les van: ");
		Teatcher aT = new Teatcher("Jaap", "van der Mopper", 2300.55);
		System.out.println(" ");
		
		Student b = new Student ("Pietje", "mcCorner", 5454214, "Java Programming");
		System.out.println("         krijgt les van: ");
		Teatcher bT = new Teatcher ("Meester", "Hoelahoep", 1999.99);
		System.out.println(" ");
		
		Student c = new Student ("Marie", "van Gaalen", 5475354, "Wiskunde");
		System.out.println("         krijgt les van: ");
		Teatcher cT = new Teatcher ("Jose", "Krimpen", 2500.47);		
	}
}

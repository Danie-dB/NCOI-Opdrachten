import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOpdr {
	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();
		Scanner bob = new Scanner (System.in);
		boolean next = true;
		
		while (next) {
			System.out.println("Hallo! Wat is uw naam?");
			String in = bob.nextLine();
			System.out.println(" ");
			switch (in) {
			case " ":
				next = false;
				System.out.println("U wilt stoppen met namen invoeren. \n");
				System.out.println("Dit zijn alle ingevoerde namen: ");
				for (Object qu : n) {
					System.out.print(qu);
					System.out.print(" ");
				}
				break;
			default:
				System.out.println("U heeft de volgende naam/namen ingevoerd: ");
				n.add(in);
				for (Object naam : n.toArray())
				System.out.print(naam + " ");
				System.out.println(" ");
				System.out.println(" ");
			}
		}
	}
}

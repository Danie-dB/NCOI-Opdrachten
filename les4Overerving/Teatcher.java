package les4Overerving;

public class Teatcher extends Person {
	private double salaris;
	
	void displayDetails(){	

		System.out.println("Docent:  " + this.voornaam + " " + this.achternaam + ", verdient : " + this.salaris + " euro per maand." );
	}
	
	Teatcher(String voornaam, String achternaam, double salaris) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.salaris = salaris;
	}
}




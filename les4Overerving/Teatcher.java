package les4Overerving;

public class Teatcher extends Person {
	Teatcher(String voornaam, String achternaam, double salaris) {
		super(voornaam, achternaam);
		System.out.println("Docent:  " + voornaam + " " + achternaam + ", verdient : " + salaris + " euro per maand." );
	}
}




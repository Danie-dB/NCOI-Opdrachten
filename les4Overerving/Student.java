package les4Overerving;

public class Student extends Person {
	Student(String voornaam, String achternaam, int StudentID, String Studie) {
		super(voornaam, achternaam);
		System.out.println("Student: "+ voornaam + " " + achternaam +", ID: "+ StudentID + ", volgt de studie: "+ Studie);
	}

}



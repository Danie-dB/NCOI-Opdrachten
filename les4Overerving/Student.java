package les4Overerving;

public class Student extends Person {
	private int StudentID;
	private String Studie;
	
	void displayDetails(){
		System.out.println("Student: "+ this.voornaam + " " + this.achternaam +", ID: "+ this.StudentID + ", volgt de studie: "+ this.Studie);
	}
	
	Student(String voornaam, String achternaam, int StudentID, String Studie) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.StudentID = StudentID;
		this.Studie = Studie;
	}
}



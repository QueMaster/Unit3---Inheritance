import java.util.Scanner;
import java.util.ArrayList;
import za.ac.tut.address.Address;
import za.ac.tut.person.Person;
import za.ac.tut.student.Student;
import za.ac.tut.cleaner.Cleaner;

public class FrontEnd
{
	public static void main(String[]args)
	{
	  ArrayList<Person> listOfpersons = new ArrayList<Person>();
	  
	  Person objPerson = new Person("John", "Doe", 25, "Male", new Address("Soshanguve", "Nkuna", 157, 0152));
	  listOfpersons.add(objPerson);
	  Student student = new Student("Veronica", "Nkosi", 20, "Female", new Address("Attridgevile","tsamaya",51,0153), 214510, "NDIT1", "DSO17AT");
	  listOfpersons.add(student);
	  //Scanner class
		Scanner scan = new Scanner(System.in);
		Scanner scanNumber = new Scanner(System.in);
		Scanner scanReal = new Scanner(System.in);
		Cleaner cleaner = new Cleaner();
		//System.out.println("Please Cleaner name");
		String name = "Ken";
		//System.out.println("Please Cleaner surname");
		String surname = "Nkosi";
		//System.out.println("Please Cleaner City ");
		String city = "Sosh";
		//System.out.println("Please Cleaner Street ");
		String street = "Nkuna";
		//System.out.println("Please Cleaner Employee Job Card ");
		String card = "Clean first floor";
		//System.out.println("Please Cleaner House no ");
		int houseNo = 15;
		//System.out.println("Please Cleaner age ");
		int age = 25;
		//System.out.println("Please Cleaner Area ");
		int area = 252;
		//System.out.println("Please Cleaner Employee ID ");
		int id = 555;
		//System.out.println("Please Cleaner Employee Salary ");
		double sal = 2500.23;
		//Cleaner(String name, String surname, int age, String gender, Address address, int employeeID, double salary,String jobCard)
		cleaner = new Cleaner(name, surname, age, "", new Address(city, street, houseNo, area),id,sal,card);
		listOfpersons.add(cleaner);
	
		for(Person person :listOfpersons)
		{
			System.out.println(person.display());
		}
	  
	}

}
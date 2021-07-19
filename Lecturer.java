package za.ac.tut.lecturer;
import za.ac.tut.employee.Employee;
import za.ac.tut.address.Address;
public class Lecturer extends Employee
{
	private String subject;
	private String position;
	
	public Lecturer()
	{}
	public Lecturer(String name, String surname, int age, String gender, Address address, int employeeID, double salary,String subject, String position)
	{
		super(name, surname, age, gender, address, employeeID,salary);
		this.subject = subject;
		this.position = position;
	}
	
	//setters
	
	//getters
	public String getSubject()
	{
		return subject;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public String display()
	{
		return super.display() + "#"+subject+"#"+position;
	}
}
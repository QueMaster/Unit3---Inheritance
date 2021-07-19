package za.ac.tut.cleaner;
import za.ac.tut.employee.Employee;
import za.ac.tut.address.Address;
public class Cleaner extends Employee
{
	private String jobCard;
	
	public Cleaner()
	{}
	public Cleaner(String name, String surname, int age, String gender, Address address, int employeeID, double salary,String jobCard)
	{
		super( name, surname, age, gender, address, employeeID, salary);
		this.jobCard = jobCard;
	}
	public String getJobCard()
	{
		return jobCard;
	}
	
	public String display()
	{
		return super.display() + "#" + jobCard;
	}
	
}
package za.ac.tut.employee;
import za.ac.tut.person.Person;
import za.ac.tut.address.Address;
public class Employee extends Person
{
	private int employeeID;
	protected double salary;
	
	public Employee()
	{}
	public Employee(String name, String surname, int age, String gender, Address address, int employeeID, double salary)
	{
		super(name, surname, age, gender, address);
		this.employeeID = employeeID;
		this.salary = salary;
	}
	//setters
	
	//getter
	public int getEmployeeID()
	{
		return employeeID;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public String display()
	{
		return super.display() + "#"+employeeID+"#"+salary;
	}	
	
}
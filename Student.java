package za.ac.tut.student;
import za.ac.tut.person.Person;
import za.ac.tut.address.Address;
public class Student extends Person
{
	private int studentNo;
	private String courseCode;
	private String subject;
	
	public Student()
	{}
	public Student(String name, String surname, int age, String gender, Address address, int studentNo, String courseCode, String subject)
	{
		super( name, surname, age, gender, address);
		this.studentNo = studentNo;
		this.courseCode = courseCode;
		this.subject = subject;
	}
	//Setters
	//accessor
	public int getStudentNo()
	{
		return studentNo;
	}
	public String getCourseCode()
	{
		return courseCode;
	}
	public String getSubject()
	{
		return subject;
	}
	
	public String display()
	{
		return super.display() + "#"+studentNo+"#"+courseCode+"#"+subject;
	}
	
	
}
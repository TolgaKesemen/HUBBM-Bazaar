package HubbmBazaar;

public class Employee extends Person{
	protected int salary;
	/**
	 * This method is the constructor of Employee class. It is the superclass
	 * of Admin and Technician.
	 * @param name
	 * @param email
	 * @param dateOfBirth
	 * @param salary
	 */
	public Employee(String name, String email, String dateOfBirth, int salary) {
		super(name, email, dateOfBirth);
		this.salary = salary;
	}
	

}

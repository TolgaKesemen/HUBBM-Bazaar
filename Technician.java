package HubbmBazaar;

public class Technician extends Employee{
	protected int senior;
	/**
	 * This method is the constructor of Technician class.
	 * @param name
	 * @param email
	 * @param dateOfBirth
	 * @param salary
	 * @param senior
	 */
	public Technician(String name, String email, String dateOfBirth, int salary, int senior) {
		super(name, email, dateOfBirth, salary);
		this.senior = senior;
	}
}

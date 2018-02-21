package HubbmBazaar;

public class Admin extends Employee{
	protected String password;
	/**
	 * This method is the constructor of Admin class.
	 * @param name
	 * @param email
	 * @param dateOfBirth
	 * @param salary
	 * @param password
	 */

	public Admin(String name, String email, String dateOfBirth, int salary, String password) {
		super(name, email, dateOfBirth, salary);
		this.password = password;
	}
	/**
	 * This method is toString method of Admin class. It returns
	 * the info of Admin object.
	 */
	@Override
	public String toString() {
		return "----------- Admin info -----------\n" + "Admin name: " + name + "\nAdmin e-mail: " + email + 
				"\nAdmin date of birth: " + dateOfBirth;
	}
	
}

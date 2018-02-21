package HubbmBazaar;

import java.util.ArrayList;

public class Customer extends Person{
	public static int customerNo = 0;
	protected double balance;
	protected double spend = 0;
	protected String password;
	protected String status;
	public ArrayList<Item> shoppingcart = new ArrayList<Item>();
	public ArrayList<Item> history = new ArrayList<Item>();
	protected int Id;
	/**
	 * This method is the constructor of Customer class.
	 * @param name
	 * @param email
	 * @param dateOfBirth
	 * @param balance
	 * @param password
	 */
	public Customer(String name, String email, String dateOfBirth, double balance, String password) {
		super(name, email, dateOfBirth);
		this.balance = balance;
		this.password = password;
		this.status = "CLASSIC";
		this.Id = customerNo + 1;
		customerNo++;
	}
	/**
	 * This method is toString method of Customer class. It returns
	 * the info of Customer object.
	 */
	@Override
	public String toString() {
		return "Customer name: " + name + "\t ID: " + Id + "\t email: " + email + "\t Date of Birth: " + dateOfBirth + "\t Status: " + status ;
	}
	
	
}

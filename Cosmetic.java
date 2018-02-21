package HubbmBazaar;

public class Cosmetic extends Item{
	protected int expirationDate, weight, organic;
	protected String manufacturer, brand;
	/**
	 * This method is the constructor of Cosmetic class. It is the superclass
	 * of HairCare and SkinCare and Perfume.
	 * @param price
	 * @param expirationDate
	 * @param weight
	 * @param organic
	 * @param manufacturer
	 * @param brand
	 */
	public Cosmetic(int price, int expirationDate, int weight, int organic, String manufacturer, String brand) {
		super(price);
		this.expirationDate = expirationDate;
		this.weight = weight;
		this.organic = organic;
		this.manufacturer = manufacturer;
		this.brand = brand;
	}

	
	
}

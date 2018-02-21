package HubbmBazaar;

public class Perfume extends Cosmetic{
	public static int stock = 0;
	protected int lastingDuration;
	/**
	 * This method is the constructor of Perfume class.
	 * @param price
	 * @param expirationDate
	 * @param weight
	 * @param organic
	 * @param manufacturer
	 * @param brand
	 * @param lastingDuration
	 */
	public Perfume(int price, int expirationDate, int weight, int organic, String manufacturer, String brand,
			int lastingDuration) {
		super(price, expirationDate, weight, organic, manufacturer, brand);
		this.lastingDuration = lastingDuration;
		stock++;
	}
	/**
	 * This method is toString method of Perfume class. It returns
	 * the info of Perfume item.
	 */
	@Override
	public String toString() {
		return "Type: Perfume" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nOrganic: " + (organic==1 ? "Yes" : "No") + "\nExpiration Date: " + expirationDate + 
				"\nWeight: " + weight + "g" + "\nLasting Duration: " + lastingDuration + "min.";
	}
	/**
	 * This method returns the name of Perfume item.
	 */
	public String name(){
		return "Perfume";
	}
	/**
	 * This method returns the stock of Perfume items.
	 */
	public int getStock(){
		return stock;
	}
}

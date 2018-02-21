package HubbmBazaar;

public class HairCare extends Cosmetic{
	public static int stock = 0;
	protected int medicated;
	/**
	 * This method is the constructor of HairCare class.
	 * @param price
	 * @param expirationDate
	 * @param weight
	 * @param organic
	 * @param manufacturer
	 * @param brand
	 * @param medicated
	 */
	public HairCare(int price, int expirationDate, int weight, int organic, String manufacturer, String brand,
			int medicated) {
		super(price, expirationDate, weight, organic, manufacturer, brand);
		this.medicated = medicated;
		stock++;
	}
	/**
	 * This method is toString method of HairCare class. It returns
	 * the info of HairCare item.
	 */
	@Override
	public String toString() {
		return "Type: HairCare" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nOrganic: " + (organic==1 ? "Yes" : "No") + "\nExpiration Date: " + expirationDate + 
				"\nWeight: " + weight + "g" + "\nMedicated: " + (medicated==1 ? "Yes" : "No");
	}
	/**
	 * This method returns the name of HairCare item.
	 */
	public String name(){
		return "HairCare";
	}
	/**
	 * This method returns the stock of HairCare items.
	 */
	public int getStock(){
		return stock;
	}
	
}

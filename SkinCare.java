package HubbmBazaar;

public class SkinCare extends Cosmetic{
	public static int stock = 0;
	protected int babySensitive;
	/**
	 * This method is the constructor of HairCare class.
	 * @param price
	 * @param expirationDate
	 * @param weight
	 * @param organic
	 * @param manufacturer
	 * @param brand
	 * @param babySensitive
	 */
	public SkinCare(int price, int expirationDate, int weight, int organic, String manufacturer, String brand,
			int babySensitive) {
		super(price, expirationDate, weight, organic, manufacturer, brand);
		this.babySensitive = babySensitive;
		stock++;
	}
	/**
	 * This method is toString method of SkinCare class. It returns
	 * the info of SkinCare item.
	 */
	@Override
	public String toString() {
		return "Type: SkinCare" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nOrganic: " + (organic==1 ? "Yes" : "No") + "\nExpiration Date: " + expirationDate + 
				"\nWeight: " + weight + "g" + "\nBaby Sensitive: " + (babySensitive==1 ? "Yes" : "No");
	}
	/**
	 * This method returns the name of SkinCare item.
	 */
	public String name(){
		return "SkinCare";
	}
	/**
	 * This method returns the stock of SkinCare items.
	 */
	public int getStock(){
		return stock;
	}
	
}

package HubbmBazaar;

public class Tv extends Electronic{
	public static int stock = 0;
	protected int screenSize;
	/**
	 * This method is the constructor of Tv class.
	 * @param price
	 * @param maxInputVoltage
	 * @param maxPowerConsumption
	 * @param manufacturer
	 * @param brand
	 * @param screenSize
	 */
	public Tv(int price, int maxInputVoltage, int maxPowerConsumption, String manufacturer, String brand,
			int screenSize) {
		super(price, maxInputVoltage, maxPowerConsumption, manufacturer, brand);
		this.screenSize = screenSize;
		stock++;
	}
	/**
	 * This method is toString method of Tv class. It returns
	 * the info of Tv item.
	 */
	@Override
	public String toString() {
		return "Type: TV" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nMax Volt: " + maxInputVoltage + "V" + "\nMax Watt: " + maxPowerConsumption + "W" +
				"\nScreen size: " + screenSize + "\"";
	}
	/**
	 * This method returns the name of Tv item.
	 */
	public String name(){
		return "Tv";
	}
	/**
	 * This method returns the stock of Tv items.
	 */
	public int getStock(){
		return stock;
	}
}

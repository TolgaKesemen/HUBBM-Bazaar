package HubbmBazaar;

public class SmartPhone extends Electronic{
	public static int stock = 0;
	protected String screenType;
	/**
	 * This method is the constructor of Tv class.
	 * @param price
	 * @param maxInputVoltage
	 * @param maxPowerConsumption
	 * @param manufacturer
	 * @param brand
	 * @param screenType
	 */
	public SmartPhone(int price, int maxInputVoltage, int maxPowerConsumption, String manufacturer, String brand,
			String screenType) {
		super(price, maxInputVoltage, maxPowerConsumption, manufacturer, brand);
		this.screenType = screenType;
		stock++;
	}
	/**
	 * This method is toString method of SmartPhone class. It returns
	 * the info of SmartPhone item.
	 */
	@Override
	public String toString() {
		return "Type: SmartPhone" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nMax Volt: " + maxInputVoltage + "V" + "\nMax Watt: " + maxPowerConsumption + "W" +
				"\nScreen Type: " + screenType;
	}
	/**
	 * This method returns the name of SmartPhone item.
	 */
	public String name(){
		return "SmartPhone";
	}
	/**
	 * This method returns the stock of SmartPhone items.
	 */
	public int getStock(){
		return stock;
	}
}

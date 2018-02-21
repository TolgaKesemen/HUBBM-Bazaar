package HubbmBazaar;

public class Electronic extends Item{
	protected int maxInputVoltage, maxPowerConsumption;
	protected String manufacturer, brand;
	/**
	 * This method is the constructor of Electronic class.
	 * @param price
	 * @param maxInputVoltage
	 * @param maxPowerConsumption
	 * @param manufacturer
	 * @param brand
	 */
	public Electronic(int price, int maxInputVoltage, int maxPowerConsumption, String manufacturer, String brand) {
		super(price);
		this.maxInputVoltage = maxInputVoltage;
		this.maxPowerConsumption = maxPowerConsumption;
		this.manufacturer = manufacturer;
		this.brand = brand;
	}

	
}

package HubbmBazaar;

public class Tablet extends Computer{
	public static int stock = 0;
	protected String dimension;
	/**
	 * This method is the constructor of Tablet class.
	 * @param price
	 * @param maxInputVoltage
	 * @param maxPowerConsumption
	 * @param manufacturer
	 * @param brand
	 * @param opSystem
	 * @param cpuType
	 * @param ramCapacity
	 * @param hddCapacity
	 * @param dimension
	 */
	public Tablet(int price, int maxInputVoltage, int maxPowerConsumption, String manufacturer, String brand,
			String opSystem, String cpuType, int ramCapacity, int hddCapacity, String dimension) {
		super(price, maxInputVoltage, maxPowerConsumption, manufacturer, brand, opSystem, cpuType, ramCapacity,
				hddCapacity);
		this.dimension = dimension;
		stock++;
	}
	/**
	 * This method is toString method of Tablet class. It returns
	 * the info of Tablet item.
	 */
	@Override
	public String toString() {
		return "Type: Tablet" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nMax Volt: " + maxInputVoltage + "V" + "\nMax Watt: " + maxPowerConsumption + "W" + 
				"\nOperating System: " + opSystem + "\nCPU Type: " + cpuType + "\nRAM Capacity: " + ramCapacity + "GB" + 
				"\nHDD Capacity: " + hddCapacity + "GB" + "\nDimension: " + dimension + "in.";
	}
	/**
	 * This method returns the name of Tablet item.
	 */
	public String name(){
		return "Tablet";
	}
	/**
	 * This method returns the stock of Tablet items.
	 */
	public int getStock(){
		return stock;
	}
}

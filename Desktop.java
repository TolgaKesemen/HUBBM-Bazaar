package HubbmBazaar;

public class Desktop extends Computer{
	public static int stock = 0;
	protected String boxColor;
	/**
	 * This method is the constructor of Desktop class.
	 * @param price
	 * @param maxInputVoltage
	 * @param maxPowerConsumption
	 * @param manufacturer
	 * @param brand
	 * @param opSystem
	 * @param cpuType
	 * @param ramCapacity
	 * @param hddCapacity
	 * @param boxColor
	 */
	public Desktop(int price, int maxInputVoltage, int maxPowerConsumption, String manufacturer, String brand,
			String opSystem, String cpuType, int ramCapacity, int hddCapacity, String boxColor) {
		super(price, maxInputVoltage, maxPowerConsumption, manufacturer, brand, opSystem, cpuType, ramCapacity,
				hddCapacity);
		this.boxColor = boxColor;
		stock++;
	}
	/**
	 * This method is toString method of Desktop class. It returns
	 * the info of Desktop item.
	 */
	@Override
	public String toString() {
		return "Type: Desktop" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nMax Volt: " + maxInputVoltage + "V" + "\nMax Watt: " + maxPowerConsumption + "W" + 
				"\nOperating System: " + opSystem + "\nCPU Type: " + cpuType + "\nRAM Capacity: " + ramCapacity + "GB" + 
				"\nHDD Capacity: " + hddCapacity + "GB" + "\nBox Color: " + boxColor;
	}
	/**
	 * This method returns the name of Desktop item.
	 */
	public String name(){
		return "Desktop";
	}
	/**
	 * This method returns the stock of Desktop items.
	 */
	public int getStock(){
		return stock;
	}
	
}

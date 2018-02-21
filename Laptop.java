package HubbmBazaar;

public class Laptop extends Computer{
	public static int stock = 0;
	protected int hdmiSupport;
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
	 * @param hdmiSupport
	 */
	public Laptop(int price, int maxInputVoltage, int maxPowerConsumption, String manufacturer, String brand,
			String opSystem, String cpuType, int ramCapacity, int hddCapacity, int hdmiSupport) {
		super(price, maxInputVoltage, maxPowerConsumption, manufacturer, brand, opSystem, cpuType, ramCapacity,
				hddCapacity);
		this.hdmiSupport = hdmiSupport;
		stock++;
	}
	/**
	 * This method is toString method of Laptop class. It returns
	 * the info of Laptop item.
	 */
	@Override
	public String toString() {
		return "Type: Laptop" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nManufacturer: " + manufacturer + 
				"\nBrand: " + brand + "\nMax Volt: " + maxInputVoltage + "V" + "\nMax Watt: " + maxPowerConsumption + "W" + 
				"\nOperating System: " + opSystem + "\nCPU Type: " + cpuType + "\nRAM Capacity: " + ramCapacity + "GB" + 
				"\nHDD Capacity: " + hddCapacity + "GB" + "\nHDMI support: " + (hdmiSupport==1 ? "Yes" : "No");
	}
	/**
	 * This method returns the name of Laptop item.
	 */
	public String name(){
		return "Laptop";
	}
	/**
	 * This method returns the stock of Laptop items.
	 */
	public int getStock(){
		return stock;
	}
}

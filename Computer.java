package HubbmBazaar;

public class Computer extends Electronic{
	protected String opSystem, cpuType;
	protected int ramCapacity, hddCapacity;
	/**
	 * This method is the constructor of Computer class.
	 * @param price
	 * @param maxInputVoltage
	 * @param maxPowerConsumption
	 * @param manufacturer
	 * @param brand
	 * @param opSystem
	 * @param cpuType
	 * @param ramCapacity
	 * @param hddCapacity
	 */
	public Computer(int price, int maxInputVoltage, int maxPowerConsumption, String manufacturer, String brand,
			String opSystem, String cpuType, int ramCapacity, int hddCapacity) {
		super(price, maxInputVoltage, maxPowerConsumption, manufacturer, brand);
		this.opSystem = opSystem;
		this.cpuType = cpuType;
		this.ramCapacity = ramCapacity;
		this.hddCapacity = hddCapacity;
	}
	
}

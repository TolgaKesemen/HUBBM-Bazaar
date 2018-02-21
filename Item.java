package HubbmBazaar;

public class Item {
	public static int itemNo = 0;
	protected int price;
	protected int Id;
	/**
	 * This method is the constructor of Item class. It is the superclass
	 * of Electronics, OfficeSupplies and Cosmetic.
	 * @param price
	 */
	public Item(int price) {
		super();
		this.price = price;
		this.Id = itemNo + 1;
		itemNo++;
	}
	public String name(){
		return "";
	}
	public int getStock(){
		return 0;
	}
}

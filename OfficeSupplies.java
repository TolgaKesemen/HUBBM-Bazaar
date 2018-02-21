package HubbmBazaar;

public class OfficeSupplies extends Item{
	protected int releaseDate;
	protected String coverTitle;
	/**
	 * This method is the constructor of OfficeSupplies class.
	 * @param price
	 * @param releaseDate
	 * @param coverTitle
	 */
	public OfficeSupplies(int price, int releaseDate, String coverTitle) {
		super(price);
		this.releaseDate = releaseDate;
		this.coverTitle = coverTitle;
	}
	
}

package HubbmBazaar;

public class CdDvd extends OfficeSupplies{
	public static int stock = 0;
	protected String composer, songs;
	/**
	 * This method is the constructor of CdDvd class.
	 * @param price
	 * @param releaseDate
	 * @param coverTitle
	 * @param composer
	 * @param songs
	 */
	public CdDvd(int price, int releaseDate, String coverTitle, String composer, String songs) {
		super(price, releaseDate, coverTitle);
		this.composer = composer;
		this.songs = songs;
		stock++;
	}
	/**
	 * This method is toString method of CdDvd class. It returns
	 * the info of CdDvd item.
	 */
	@Override
	public String toString() {
		return "Type: CDDVD" + "\nItem ID: " + Id + "\nPrice: " + price + "$" + "\nRelease Date: " + releaseDate + "\nTitle: " + 
				coverTitle + "\nSongs: " + songs + "\nComposer: " + composer;
	}
	/**
	 * This method returns the name of CdDvd item.
	 */
	public String name(){
		return "CdDvd";
	}
	/**
	 * This method returns the stock of CdDvd items.
	 */
	public int getStock(){
		return stock;
	}
	
}

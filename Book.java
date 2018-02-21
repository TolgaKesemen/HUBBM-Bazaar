package HubbmBazaar;

public class Book extends OfficeSupplies{
	public static int stock = 0;
	protected String publisher, author;
	protected int pageNo;
	/**
	 * This method is the constructor of Tv class.
	 * @param price
	 * @param releaseDate
	 * @param coverTitle
	 * @param publisher
	 * @param author
	 * @param pageNo
	 */
	public Book(int price, int releaseDate, String coverTitle, String publisher, String author, int pageNo) {
		super(price, releaseDate, coverTitle);
		this.publisher = publisher;
		this.author = author;
		this.pageNo = pageNo;
		stock++;
	}
	/**
	 * This method is toString method of Book class. It returns
	 * the info of Book item.
	 */
	@Override
	public String toString() {
		return "Type: Book\n" + "Item ID: " + Id + "\nPrice: " + price + "$" + "\nRelease Date: " + releaseDate + "\nTitle: " + 
				coverTitle + "\nPublisher: " + publisher + "\nAuthor: " + author + "\nPage: " + pageNo + " pages";
	}
	/**
	 * This method returns the name of Book item.
	 */
	public String name(){
		return "Book";
	}
	/**
	 * This method returns the stock of Book items.
	 */
	public int getStock(){
		return stock;
	}
	
}

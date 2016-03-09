

public class BookApplication {

	public static void main(String[] args) 
	{
		Book[] books = new Book[10];
		double sumOfBooks = 0.0;
		
		books[0] = new Book("Where the Red Firm Grow", "Peter Pan", "A good book", 20.00, true);
		books[1] = new Book("Over the other Side", "Peter Jonston", "A good book", 20.00, false);
		books[2] = new Book("Barnyard Dance", "Sandra Boyton", "A good book", 20.00, true);
		books[3] = new Book("Hippo Party", "Sandra Boyton", "A good book", 20.00, true);
		books[4] = new Book("First Thanksgiving", "No Name", "A good book", 20.00, true);
		books[5] = new Book("Second Thanksgiving", "No Name", "A good book", 20.00, true);
		books[6] = new Book("Last Thanksgiving", "No Name", "A good book", 20.00, false);
		
		for (int i=0; i<5; i++)
		{
			sumOfBooks += getBookPrice(books[i]);
			
		}
		System.out.println("Total price for your 5 books are: " + sumOfBooks);
	}
	
	public static double getBookPrice(Book _myBook)
	{
		if(_myBook.getIsInStock() == true)
			return (_myBook.getPrice());
		else
		{
			System.out.println("\"" + _myBook.getTitle() + "\" not in stock. Come back in a week.");
			return (0.0);
		}
	}

}

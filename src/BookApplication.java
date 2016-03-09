import java.util.Scanner;

public class BookApplication {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		String _sku = "";
		
		System.out.print("Please enter the SKU: ");
		_sku = sc.next();
		
		Book _book = BookDb.getBookFromDb(_sku);
		System.out.println("This book's SKU is: " + _book.getSku());
		System.out.printf("Author: %s;\nTitle: %s;\nDescription: %s;\nPrice: %.2f\n", 
				_book.getAuthor(), _book.getTitle(), _book.getDescription(), _book.getPrice());	
		
		sc.close();
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

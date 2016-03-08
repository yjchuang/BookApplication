

public class BookApplication {

	public static void main(String[] args) 
	{
		Book myBook = new Book("My Father's Dragon", "Nancy Ragean", "A great book", 29.99, true);
		myBook.getDisplayText();
		//System.out.printf("Book Author: %s;\nBook Title: %s;\nBook Description: %s; \n",
				//myBook.getAuthor(), myBook.getTitle(), myBook.getDescription()); 

	}

}

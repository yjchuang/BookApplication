
public class BookDb {
	public static Book getBookFromDb(String _sku)
	{
		Book book;
		

		switch(_sku)
		{
			case ("Java1001"):
			{
				book = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Betes", 
						"Easy to read Java workbook",47.50, true);
				break;
			}
			case "Java1002":
			{
				book = new Book("Java1002", "Thinking in Java", "Bruce Eckel", 
						"Details about Java under the hood",20.00, true);
				break;
			}
			case "Orcl1003":
			{
				book = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", 
						"Everything you need to know in one place",45.00, true);
				break;
			}
			case "Python1004":
			{
				book = new Book("Python1004", "Automate the boring stuff with Python", "Al Sweigert", 
						"Fun with Python",10.50, true);
				break;
			}
			case "Zombie1005":
			{
				book = new Book("Zombie1005", "The Maker's guid to the Zombie apocalypse", "Simon Monk", 
						"Defend your base with simple circuits, Arduino and Raspberry Pi",16.50, true);
				break;
			}
			case "Rasp1006":
			{
				book = new Book("Rasp1006", "Raspberry Pi Projects for evil Genius", "Donald Norris", 
						"A dozen friendishly fun projects for Rasberry Pi",14.75, true);
				break;
			}
			default:
			{
				book = new Book();
				break;
			}
		}
		
		return book;
	}
}

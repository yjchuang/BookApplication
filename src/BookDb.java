
public class BookDb {
	public static Book getBookFromDb(String _sku)
	{
		Book book = new Book();
		

		switch(_sku)
		{
			case ("Java1001"):
			{
				book.setSku("Java1001");
				book.setTitle("Head First Java");
				book.setAuthor("Kathy Sierra and Bert Bates");
				book.setDescription("Easy to read Java workbook");
				book.setPrice(47.50);
				book.setIsInStock(true);
				break;
			}
			case "Java1002":
			{
				book.setSku("Java1002");
				book.setTitle("Thinking in Java");
				book.setAuthor("Bruce Eckel");
				book.setDescription("Details about Java under the hood");
				book.setPrice(20.00);
				book.setIsInStock(true);
				break;
			}
			case "Orcl1003":
			{
				book.setSku("Orcl1003");
				book.setTitle("OCP: Oracle Certitied Professional Java SE");
				book.setAuthor("Jeanne Boyarsky");
				book.setDescription("Everything you need to know in one place");
				book.setPrice(45.00);
				book.setIsInStock(true);
				break;
			}
			case "Python1004":
			{
				book.setSku("Python1004");
				book.setTitle("Automate the Boring Stuff with Python");
				book.setAuthor("Al Sweigart");
				book.setDescription("Fun with Python");
				book.setPrice(10.50);
				book.setIsInStock(true);
				break;
			}
			case "Zombie1005":
			{
				book.setSku("Zombie1005");
				book.setTitle("The Maker's Guide to the Zombie Apocalypse");
				book.setAuthor("Simon Monk");
				book.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberrry Pi");
				book.setPrice(16.50);
				book.setIsInStock(true);
				break;
			}
			case "Rasp1006":
			{
				book.setSku("Rasp1006");
				book.setTitle("Raspberry Pi Projects for the evil Genius");
				book.setAuthor("Donald Norris");
				book.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
				book.setPrice(14.75);
				book.setIsInStock(true);
				break;
			}
			default:
			{
				book.setSku("");
				book.setTitle("");
				book.setAuthor("");
				book.setDescription("");
				book.setPrice(0.0);
				book.setIsInStock(true);
				break;
			}
		}
		
		return book;
	}
}

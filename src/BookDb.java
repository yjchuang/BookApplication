import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDb {
	public static Book getBookFromDb(String _sku)
	{
		Book book = new Book();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from books where sku='"+ _sku+"'";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				book.setSku(_sku);
				book.setAuthor(rs.getString("author"));
				book.setDescription(rs.getString("description"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return book;
	}
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbc {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root", "Amit7b23$");
		    Statement stmt = con.createStatement();
		    System.out.println("Inserting Records");
		    String sql = "Insert into fruit value(43)";
		    stmt.executeUpdate(sql);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

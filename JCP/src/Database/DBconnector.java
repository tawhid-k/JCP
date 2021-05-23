package Database;
import java.sql.*;

public class DBconnector {
     public Connection con;
     public Statement st;
     public ResultSet rs;
     public DBconnector () {
     }
     public void openConnection () throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3306/projectdemo?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";
         con = DriverManager.getConnection (url, "root", "");
         st = con.createStatement();
     }
     public void eQuery (String query) throws ClassNotFoundException, SQLException {
         this.openConnection();
         rs = st.executeQuery(query);
         //this.closeConnection();
     }
     public void closeConnection()
	{
		try
		{
			if(con!=null){con.close();}
			if(st!=null){st.close();}
			if(rs!=null){rs.close();}
		}
		catch(Exception e){}
	}
}
package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Connection is Interface to make a connection with db.- It contains some statements- PreparedStatement and DatabaseMetadata.
//con.createStatement();
//Drivermanager-It acts as bridge between users and drivers.
//Methods available in drivermanager.
    //  registerDriver()
    //deregisterDriver()
    //getConnection()
    //getDriver()

// Statement it is a interface - it provides methods to execute queries.
//      -executeQuery("query passed as string")
//      executeupdate("Query")
//      execute()
//      executeBatch()

//Resultset - It is an interface which is used to maitain the cursor pointing to a row of the table.
    //next()
    //previous()
    //first()
    //last()

// URL Formtat- jdbc:mysql://localhost:3306/studentdb
    //          JDBC:database type://url:portnumber/database name.
public class JDBCConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb","root","root");
            //here studentdb is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
}
}

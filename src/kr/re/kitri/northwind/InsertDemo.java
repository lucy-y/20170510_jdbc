package kr.re.kitri.northwind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-05-10.
 */
public class InsertDemo {

    public static final String DRIVER_POSTGRES = "org.postgresql.Driver";
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    public static final String DBNAME = "postgres";
    public static final String DBPASSWORD = "kitri0007";

    public static void main(String[] args) {
        //driver loading
        try {
            Class.forName(DRIVER_POSTGRES);
            System.out.println("driver loading ok...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String query = "INSERT INTO categories(\n" +
                "            categoryid, categoryname, description)\n" +
                "    VALUES (?, ?, ?);";

        //get a connection
        try {
            Connection conn = DriverManager.getConnection(DB_URL,DBNAME,DBPASSWORD);
            System.out.println("connetion ok...");

            PreparedStatement prpsnt = conn.prepareStatement(query);
            prpsnt.setInt(1,99);
            prpsnt.setString(2,"Desktop");
            prpsnt.setString(3,"집에 놓고 쓰는 컴퓨터");
            prpsnt.executeUpdate();
            //insert할 때는 executeUpdate를 사용하는 것이 나음
            //execute를 사용하여도 되지만..
            System.out.println("insert ok...");
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("insert failed...");
        }
    }
}

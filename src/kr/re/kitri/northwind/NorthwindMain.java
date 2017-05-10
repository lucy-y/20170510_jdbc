package kr.re.kitri.northwind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NorthwindMain {
    public static void main(String[] args) {

        // 1. postgreSQL database JDBC driver 로딩
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loading ok...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2. database와 연결을 수행한다
        // 즉, connection 객체를 만든다

        String dburl = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres";
        String password = "kitri0007";

        try {
            Connection conn =
                    DriverManager.getConnection(dburl, username, password);
            System.out.println("connection ok...");

            // 3. SQL문을 DB로 전달한다.
            String sql = "INSERT INTO sample(first_name, last_name, age) VALUES (?, ?, ?);";

            PreparedStatement pstnt = conn.prepareStatement(sql);
            pstnt.setString(1,"태준");
            pstnt.setString(2,"김");
            pstnt.setInt(3,27);
            pstnt.executeUpdate();
            System.out.println("insert ok...");

            conn.close();
            System.out.println("connection closed...");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("connection failed..");
        }




    }
}

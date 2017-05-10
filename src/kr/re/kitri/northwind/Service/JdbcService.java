package kr.re.kitri.northwind.Service;

import kr.re.kitri.northwind.Model.Customer;

import java.sql.*;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-10.
 */
public class JdbcService {

    public List<Customer> makeList(String DB_URL, String USERNAME, String PASSWORD) {

        String query = "select * from customers;";
        try {
            Connection conn =
                    DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.print(rs.getString(1)+ "/");
                System.out.print(rs.getString(2)+ "/");
                System.out.print(rs.getString(3)+ "/");
                System.out.print(rs.getString(4)+ "/");
                System.out.print(rs.getString(5)+ "/");
                System.out.print(rs.getString(6)+ "/");
                System.out.print(rs.getString(7)+ "/");
                System.out.print(rs.getString(8)+ "/");
                System.out.print(rs.getString(9)+ "/");
                System.out.print(rs.getString(10)+ "/");
                System.out.println(rs.getString(11));

            }

            conn.close();
            System.out.println("connection closed..");

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}

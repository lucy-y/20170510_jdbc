package kr.re.kitri.northwind;

import java.sql.*;

/**
 * Created by danawacomputer on 2017-05-10.
 */
public class SelectDemo {

    public static final String DRIVER_POSTGRES = "org.postgresql.Driver";
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "kitri0007";

    public static void main(String[] args) {

        try {
            Class.forName(DRIVER_POSTGRES);
            System.out.println("driver loading ok..");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String query =
                "select customerid, " +
                        "       companyname, " +
                        "       contactname, " +
                        "       address, " +
                        "       city, " +
                        "       phone " +
                        "from customers " +
                        "order by contactname";

        try {
            Connection conn =
                    DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();


            /*
            rs.next(); //커서를 첫 번째 레코드로 이동
            rs.next();
            rs.next();
            rs.next();
            //rs.previous(); //postgresql은 back은 지원안함

            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
            System.out.println(rs.getString(6));
            */

            while(rs.next()){
                System.out.print(rs.getString(1)+ "\t/\t");
                System.out.print(rs.getString(2)+ "\t/\t");
                System.out.print(rs.getString(3)+ "\t/\t");
                System.out.print(rs.getString(4)+ "\t/\t");
                System.out.print(rs.getString(5)+ "\t/\t");
                System.out.println(rs.getString(6));
            }

            conn.close();
            System.out.println("connection closed..");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
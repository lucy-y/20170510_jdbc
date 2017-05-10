package kr.re.kitri.northwind;

import kr.re.kitri.northwind.Service.JdbcService;
import kr.re.kitri.northwind.Model.Customer;

import java.util.List;

public class JdbcFinalDemo {

    public static final String DRIVER_POSTGRES = "org.postgresql.Driver";
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "kitri0007";

    public static void main(String[] args) {
        loadDriver(DRIVER_POSTGRES);

        JdbcService service = new JdbcService();
        List<Customer> list = service.makeList(DB_URL,USERNAME,PASSWORD);

    }

    //driver loading
    private static void loadDriver(String driverPostgres) {
        try {
            Class.forName(DRIVER_POSTGRES);
            System.out.println("driver loading ok...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

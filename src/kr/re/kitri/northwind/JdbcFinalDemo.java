package kr.re.kitri.northwind;

import jdk.nashorn.internal.scripts.JO;
import kr.re.kitri.northwind.Model.Join;
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
        List<Customer> list = service.makeList(DB_URL, USERNAME, PASSWORD);

        System.out.println("***************************************출력***************************************\n");
        int i = 1;
        System.out.println("\t\tCustomerid/Companyname/Contactname/Contacttitle/Address/City/Region/Postalcode/Country/Phone/Fax");
        for (Customer e : list) {
            System.out.printf(i + "번째: ");
            //System.out.println(e);
            System.out.println(e.getCustomerid() + "/" + e.getCompanyname() + "/" + e.getContactname() + "/" +
                    e.getContacttitle() + "/" + e.getAddress() + "/" + e.getCity() + "/" + e.getRegion() + "/" +
                    e.getPostalcode() + "/" + e.getCountry() + "/" + e.getPhone() + "/" + e.getFax());
            i++;
        }
        System.out.println("\n");

        System.out.println("***************************************출력***************************************\n\n");
        for(Customer e : list){
            System.out.println(e.toString());
        }


        List<Join> list2 = service.makeList2(DB_URL, USERNAME, PASSWORD);
        System.out.println("***************************************출력***************************************\n\n");
        for(Join e : list2){
            System.out.println(e.toString());
        }

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

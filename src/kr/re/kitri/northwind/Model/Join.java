package kr.re.kitri.northwind.Model;

import java.util.Date;

/**
 * Created by danawacomputer on 2017-05-10.
 */
public class Join {
    private String contactname;
    private String city;
    private String  country;
    private Date orderdate;
    private String shipcountry;

    public Join() {
    }

    public Join(String contactname, String city, String country, Date orderdate, String shipcountry) {
        this.contactname = contactname;
        this.city = city;
        this.country = country;
        this.orderdate = orderdate;
        this.shipcountry = shipcountry;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getShipcountry() {
        return shipcountry;
    }

    public void setShipcountry(String shipcountry) {
        this.shipcountry = shipcountry;
    }

    @Override
    public String toString() {
        return "Join{" +
                "contactname='" + contactname + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", orderdate=" + orderdate +
                ", shipcountry='" + shipcountry + '\'' +
                '}';
    }
}

package hello;

import org.springframework.data.annotation.Id;

/**
 * Created by Luis on 04/06/2018.
 */
public class Address {
    @Id
    private long id;

    private String country;
    private String city;

    public Address() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

package demo1;

import java.util.Objects;

public class Adress {

    private String city;
    private String steet;
    private String streetNumber;

    public Adress(String city, String steet, String streetNumber) {
        this.city = city;
        this.steet = steet;
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSteet() {
        return steet;
    }

    public void setSteet(String steet) {
        this.steet = steet;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(city, adress.city) &&
                Objects.equals(steet, adress.steet) &&
                Objects.equals(streetNumber, adress.streetNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, steet, streetNumber);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", steet='" + steet + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}

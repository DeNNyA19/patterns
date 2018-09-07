package models;

public class Address {

    private String country;
    private String city;
    private String addressLine;
    private String postcode;

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

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String toString() {
        return String.format("\n     Country: \"%s\";" +
                            "\n     City: \"%s\"" +
                            "\n     Postcode: \"%s\"" +
                            "\n     Address Line: \"%s\"", country, city, postcode, addressLine);
    }
}

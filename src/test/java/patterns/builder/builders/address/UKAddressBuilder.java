package patterns.builder.builders.address;

public class UKAddressBuilder extends AddressBuilder {

    public void setCountry() {
        address.setCountry("United Kingdom");
    }

    public void setCity() {
        address.setCity("Birmingham");
    }

    public void setPostcode() {
        address.setPostcode("B1 1DA");
    }

    public void setAddressLine() {
        address.setAddressLine("77  Boroughbridge Road");
    }
}

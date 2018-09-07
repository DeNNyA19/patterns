package patterns.builder.builders.address;

public class USAddressBuilder extends AddressBuilder {

    public void setCountry() {
        address.setCountry("US");
    }

    public void setCity() {
        address.setCity("New-York");
    }

    public void setPostcode() {
        address.setPostcode("10001");
    }

    public void setAddressLine() {
        address.setAddressLine("583 NW. Del Monte Street Jamestown");
    }
}

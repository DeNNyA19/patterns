package patterns.builder.builders.address;

import models.Address;

public abstract class AddressBuilder {

    protected Address address = new Address();

    public Address getAddress() {
        return address;
    }

    public abstract void setCountry();
    public abstract void setCity();
    public abstract void setAddressLine();
    public abstract void setPostcode();
}

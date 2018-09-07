package patterns.builder.directors;

import patterns.builder.builders.address.AddressBuilder;
import models.Address;

public class AddressDirector {

    public Address formFullAddress(AddressBuilder addressBuilder) {
        addressBuilder.setCity();
        addressBuilder.setCountry();
        addressBuilder.setPostcode();
        addressBuilder.setAddressLine();
        return addressBuilder.getAddress();
    }

    public Address formAddressWithoutPostcode(AddressBuilder addressBuilder) {
        addressBuilder.setCity();
        addressBuilder.setCountry();
        addressBuilder.setAddressLine();
        return addressBuilder.getAddress();
    }
}

package models;

public class PurchaseUI {

    protected static final String FULL_NAME_FORMAT = "%s %s %s";
    protected static final String FULL_ADDRESS_FORMAT = "%s,\n %s,\n %s,\n %s";
    protected static final String CONTACT_INFO_FORMAT = "Email: %s, Telephone: %s";

    private String fullName; // format of name *Title* *First name* *Last name* e.g. Mr. Vasiliy Pupkin
    private String fullAddress; //format of address *Address line*,
                                //                  *City*,
                                //                  *Postcode*,
                                //                  *Country*
    private String contactInfo; //format of contact info Email: *Email*, Telephone: *Phone number*

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public boolean equals(Object object) {
        if (object instanceof PurchaseUI) {
            PurchaseUI purchaseUI = (PurchaseUI) object;
            return purchaseUI.contactInfo.equals(getContactInfo())
                    && purchaseUI.fullAddress.equals(getFullAddress())
                    && purchaseUI.fullName.equals(getFullName());
        } else {
            System.out.println("Passed object is not PurchaseUI instance");
            return false;
        }
    }
}

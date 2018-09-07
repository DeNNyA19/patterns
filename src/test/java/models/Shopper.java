package models;

public class Shopper {

    private String email;
    private Title title;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return String.format("\n      Email: \"%s\";" +
                "\n      Title: \"%s\"" +
                "\n      First name: \"%s\"" +
                "\n      Last name: \"%s\"" +
                "\n      Phone number: \"%s\"", email, title, firstName, lastName, phoneNumber);
    }
}

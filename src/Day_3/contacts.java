package Day_3;

public class contacts {
    String firstName;
    String lastName;
    String Address;


    String city;
    String state;
    long ZIP;
    String phone_no;
    String email;

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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZIP() {
        return ZIP;
    }

    public void setZIP(long ZIP) {
        this.ZIP = ZIP;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
    public contacts(String firstName, String lastName, String address, String city, String state, long ZIP, String phone_no, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        Address = address;
        this.city = city;
        this.state = state;
        this.ZIP = ZIP;
        this.phone_no = phone_no;
        this.email = email;
    }

    @Override
    public String toString() {
        return "contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", ZIP=" + ZIP +
                ", phone_no='" + phone_no + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


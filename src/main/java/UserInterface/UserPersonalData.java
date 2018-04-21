package UserInterface;

public class UserPersonalData {


    private String loginName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private String homeAddress;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public UserPersonalData(String loginName, String password, String firstName, String lastName, String email, String deliveryAddress, String homeAddress) {
        this.loginName = loginName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.homeAddress = homeAddress;
    }

    public UserPersonalData(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserPersonalData{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if(! (o instanceof UserPersonalData)) {
            return false;
        }

        if(this == o) {
            return true;
        }

        if(this.getLoginName().equals(((UserPersonalData) o).getLoginName()) && this.getPassword().equals(((UserPersonalData) o).getPassword())) {
            return true;
        }

        return false;
    }
}

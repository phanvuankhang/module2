package case_study.furama_resort_manager.model.person;

public class Customer extends Person {
    private String customerId;
    private String typeGuest;
    private String address;

    public Customer(String name, String birthDay, String gender, String personId, String phoneNumber, String email, String typeGuest, String address) {
    }

    public Customer(String customerId, String name, String birthDay, String gender, String personId, String phoneNumber, String email, String typeGuest, String address) {
        super(name, birthDay, gender, personId, phoneNumber, email);
        this.customerId = customerId;
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getcustomerId() {
        return customerId;
    }

    public void setcustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                ", personId=" + personId +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfoToCustomer() {
        return customerId + "," + name + "," + birthDay + "," + gender + "," + personId + "," + phoneNumber + "," + email + "," + typeGuest + "," + address;
    }
}

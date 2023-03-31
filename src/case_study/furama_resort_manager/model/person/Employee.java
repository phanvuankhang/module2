package case_study.furama_resort_manager.model.person;

public class Employee extends Person {
    private String employeeId;
    private String level;
    private String location;
    private float wage;

    public Employee(String employeeId, String name, String birthDay, String gender, int personId, int phoneNumber, String email, String level, String location, float wage) {
    }

    public Employee(String employeeId, String name, String birthDay, String gender, String personId, String phoneNumber, String email, String level, String location, float wage) {
        super(name, birthDay, gender, personId, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                ", personId=" + personId +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}

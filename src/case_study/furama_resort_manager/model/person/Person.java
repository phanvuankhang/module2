package case_study.furama_resort_manager.model.person;

import jdk.nashorn.internal.runtime.StoredScript;

public abstract class Person {
     String name;
     String birthDay;
     String gender;
     String personId;
     String phoneNumber;
     String email;

    public Person() {
    }

    public Person(String name, String birthDay, String gender, String personId, String phoneNumber, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                ", cmnd=" + personId +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

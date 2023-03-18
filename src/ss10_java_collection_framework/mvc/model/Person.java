package ss10_java_collection_framework.mvc.model;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String birthDay;
    private String gender;

    public Person() {
    }

    public Person(int id, String name, String birthDay, String gender) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" +
                "Mã='" + id + '\'' +
                ", Tên='" + name + '\'' +
                ", Ngày sinh=" + birthDay +
                ", Giới tính='" + gender + '\'' +
                '}';
    }
}

package ss5_access_modifier_static.bai_tap.class_set;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {
    }

    public void setName() {
        this.name = name;
    }

    public void setClasses() {
        this.classes = classes;
    }

    public String toString(String name, String classes) {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

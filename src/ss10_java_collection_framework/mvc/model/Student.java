package ss10_java_collection_framework.mvc.model;

public class Student extends Person {
    private String classes;
    private float point;

    public Student(int id, String name, String birthDay, String gender, String classes, float point) {
    }

    public Student(int id, String name, String birthDay, String gender) {
        super(id, name, birthDay, gender);
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "Lớp='" + classes + '\'' +
                ", Điểm số=" + point +
                '}';
    }
}

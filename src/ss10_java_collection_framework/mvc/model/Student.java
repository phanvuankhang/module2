package ss10_java_collection_framework.mvc.model;

public class Student extends Person {
    private String classes;
    private float point;

    public Student() {
    }

    public Student(int id, String name, String birthDay, String gender, String classes, float point) {
        super(id, name, birthDay, gender);
        this.classes = classes;
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Lớp: " + classes +
                ", Điểm số=" + point;
    }
}

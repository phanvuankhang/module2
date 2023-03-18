package ss10_java_collection_framework.mvc.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher(int id, String name, String birthDay, String gender, String specialize) {
    }

    public Teacher(int id, String name, String birthDay, String gender) {
        super(id, name, birthDay, gender);
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                "Chuyên môn='" + specialize + '\'' +
                '}';
    }
}

package ss10_java_list.mvc.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String birthDay, String gender, String specialize) {
        super(id, name, birthDay, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Chuyên môn: " + specialize;
    }
}

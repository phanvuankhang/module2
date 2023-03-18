package ss5_access_modifier_static.bai_tap.class_set;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student student = new Student();
    System.out.println(student.toString());
    System.out.println("Nhập tên");
    String name = sc.nextLine();
    System.out.println("Nhập lớp");
    String classes = sc.nextLine();
    student.setName();
    student.setClasses();
    System.out.println(student.toString(name, classes));
}
}

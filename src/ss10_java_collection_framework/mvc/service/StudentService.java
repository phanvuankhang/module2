package ss10_java_collection_framework.mvc.service;

import ss10_java_collection_framework.mvc.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Student> studentsList = new ArrayList<>();

    public void displayStudent() {
        System.out.println("Danh sách học sinh:");
        for (Student s : studentsList) {
            System.out.println(s);
        }
    }

    public void addStudent() {
        System.out.println("Mã học sinh: ");
        int id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < studentsList.size(); i++) {
            if (id == studentsList.get(i).getId()) {
                System.out.println("Học viên đã tồn tại. ");
                return;
            } else {
                count++;
            }
        }
        if (count == studentsList.size()) {
            System.out.println("Tên học sinh: ");
            String name = scanner.nextLine();
            System.out.println("Ngày sinh (dd/mm/yyyy): ");
            String birthDay = scanner.nextLine();
            System.out.println("Giới tính (Nam/Nữ): ");
            String gender = scanner.nextLine();
            System.out.println("Lớp (Bắt đầu bằng chữ C và 4 số): ");
            String classes = scanner.nextLine();
            System.out.println("Điểm số: ");
            float point = scanner.nextFloat();
            Student student = new Student(id, name, birthDay, gender, classes, point);
            studentsList.add(student);
            System.out.println("Thêm học sinh thành công.");
        }
    }

    public void removeStudent() {
        System.out.println("Nhập mã học sinh cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentsList.size(); i++) {
            if (id == studentsList.get(i).getId()) {
                System.out.println("Bạn có muốn xóa học sinh: " + id + " ?" +
                        "\n 1. Có." +
                        "\n 2. Không.");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentsList.remove(studentsList.get(i));
                        System.out.println("Bạn đã xóa thành công. ");
                        break;
                    default:
                        System.out.printf("Bạn đã không xóa");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy học viên này");
    }
}

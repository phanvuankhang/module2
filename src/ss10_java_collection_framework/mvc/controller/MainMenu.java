package ss10_java_collection_framework.mvc.controller;

import ss10_java_collection_framework.mvc.service.StudentService;
import ss10_java_collection_framework.mvc.service.TeacherService;

import java.util.Scanner;

public class MainMenu {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        boolean flag = true;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--" +
                    "\n Chọn chức năng theo số (để tiếp tục): " +
                    "\n 1. Thêm mới giẳng viên hoặc học sinh " +
                    "\n 2. Xóa giảng viên hoặc học sinh " +
                    "\n 3. Xem danh sách giảng viên hoặc học sinh " +
                    "\n 4. Thoát " +
                    "\n Chọn chức năng: ");
            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    System.out.println("Bạn muốn thêm: " +
                            "\n 1. Giảng viên" +
                            "\n 2. Học sinh");
                    int a = Integer.parseInt(scanner.nextLine());
                    if (a == 1) {
                        teacherService.addTeacher();
                    } else if (a == 2) {
                        studentService.addStudent();
                    } else {
                        System.out.println("Bạn đã không thêm. ");
                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn xóa: " +
                            "\n 1. Giảng viên " +
                            "\n 2. Học sinh ");
                    int b = Integer.parseInt(scanner.nextLine());
                    if (b == 1) {
                        teacherService.removeTeacher();
                    } else if (b == 2) {
                        studentService.removeStudent();
                    } else {
                        System.out.println("Bạn đã không xóa. ");
                    }
                    break;
                case 3:
                    System.out.println("Bạn muốn xem danh sách: " +
                            "\n 1. Giảng viên" +
                            "\n 2. Học sinh");
                    int c = Integer.parseInt(scanner.nextLine());
                    if (c == 1) {
                        teacherService.displayTeacher();
                    } else if (c == 2) {
                        studentService.displayStudent();
                    } else {
                        System.out.println("Bạn đã không chọn");
                    }
                    break;
                case 4:
                    System.out.println("Bạn đã thoát.");
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai. Mời bạn chọn lại. ");
            }
        } while (flag);
    }
}

package ss10_java_collection_framework.mvc.service;
import ss10_java_collection_framework.mvc.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    public static Scanner scanner=new Scanner(System.in);
    public static ArrayList<Teacher> teacherList =new ArrayList<>();

    public void displayTeacher(){
        System.out.println("Danh sách giảng viên:");
        for (Teacher t: teacherList) {
            System.out.println(t);
        }
    }

    public void addTeacher(){
        System.out.println("Mã giảng viên (Bắt đầu bằng chữ B và 4 số): ");
        int id=Integer.parseInt(scanner.nextLine());
        int count=0;
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                System.out.println("Giảngvieen đã tồn tại. ");
                return;
            }else {
                count++;
            }
            } if (count==teacherList.size()){
                System.out.println("Tên giảng viên: ");
                String name = scanner.nextLine();
                System.out.println("Ngày sinh (dd/mm/yyyy): ");
                String birthDay = scanner.nextLine();
                System.out.println("Giới tính (Nam/Nữ): ");
                String gender = scanner.nextLine();
                System.out.println("Chuyên môn: ");
                String specialize = scanner.nextLine();
                Teacher teacher = new Teacher(id, name, birthDay, gender, specialize);
                teacherList.add(teacher);
                System.out.println("Thêm giảng viên thành công.");
            }
        }
    public void removeTeacher(){
        System.out.println("Nhập mã giảng viên cần xóa: ");
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teacherList.size(); i++) {
            if (id== teacherList.get(i).getId()){
                System.out.println("Bạn có muốn xóa giảng viên: "+id+" ?"+
                        "\n 1. Có."+
                        "\n 2. Không.");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        teacherList.remove(teacherList.get(i));
                        System.out.println("Bạn đã xóa thành công. ");
                        break;
                    default:
                        System.out.printf("Bạn đã không xóa");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy giảng viên này");
    }
}

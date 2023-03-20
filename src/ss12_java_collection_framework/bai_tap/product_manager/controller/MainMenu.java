package ss12_java_collection_framework.bai_tap.product_manager.controller;

import ss12_java_collection_framework.bai_tap.product_manager.model.Product;
import ss12_java_collection_framework.bai_tap.product_manager.service.ProductService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainMenu {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        ProductService productService = new ProductService();
        boolean flag = true;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--" +
                    "\n Chọn chức năng theo số (để tiếp tục): " +
                    "\n 1. Thêm sản phẩm." +
                    "\n 2. Sửa thông tin sản phẩm." +
                    "\n 3. Xoá sản phẩm." +
                    "\n 4. Hiển thị danh sách sản phẩm." +
                    "\n 5. Tìm kiếm sản phẩm theo tên." +
                    "\n 6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá." +
                    "\n 7. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.update();
                    break;
                case 3:
                    productService.remove();
                    break;
                case 4:
                    productService.display();
                    break;
                case 5:
                    productService.search();
                    break;
                case 6:
                    productService.sort();
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai. Mời chọn lại.");
            }
        } while (flag);
    }
}

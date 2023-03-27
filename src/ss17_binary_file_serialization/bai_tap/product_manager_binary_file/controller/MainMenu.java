package ss17_binary_file_serialization.bai_tap.product_manager_binary_file.controller;

import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.model.Product;
import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.service.impl.ProductService;


import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("--Quản lý sản phẩm--" +
                    "\n Chọn chức năng theo số:" +
                    "\n 1. Thêm sản phẩm." +
                    "\n 2. Danh sách sản phẩm." +
                    "\n 3. Tìm kiếm sản phẩm." +
                    "\n 4. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chức năng thêm mới.");
                    productService.add();
                    break;
                case 2:
                    System.out.println("Chức năng hiển thị.");
                    productService.display();
                    break;
                case 3:
                    System.out.println("Chức năng tìm kiếm.");
                    productService.search();
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai. Mời chọn lại:");
            }
        } while (flag);
    }
}

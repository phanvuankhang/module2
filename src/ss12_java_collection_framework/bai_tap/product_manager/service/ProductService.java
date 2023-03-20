package ss12_java_collection_framework.bai_tap.product_manager.service;

import ss12_java_collection_framework.bai_tap.product_manager.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IProductService {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productArrayList = new ArrayList<>();

    public void display() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product p : productArrayList) {
            System.out.println(p);
        }
    }

    public void add() {
        System.out.println("Mã sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                System.out.println("Sản phẩm đã tồn tại");
            } else {
                count++;
            }
        }
        if (count == productArrayList.size()) {
            System.out.println("Tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Giá sản phẩm: ");
            int price = Integer.parseInt(scanner.nextLine());
            Product product = new Product(id, name, price);
            productArrayList.add(product);
            System.out.println("Thêm sản phẩm thành công. ");
        }
    }

    public void update() {
        System.out.println("Mã sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                System.out.println("Tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.println("Giá sản phẩm: ");
                int price = Integer.parseInt(scanner.nextLine());
                productArrayList.set(i, new Product(id, name, price));
                break;
            }
        }
    }

    public void remove() {
        System.out.println("Mã sản phẩm muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                System.out.println("Bạn có muốn xóa sản phẩm? " +
                        "\n 1. Có." +
                        "\n 2. Không.");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Bạn đã xóa thành công.");
                        productArrayList.remove(productArrayList.get(i));
                        break;
                    default:
                        System.out.println("Bạn đã không xóa.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm. ");
    }

    public void search() {
        System.out.println("Tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        for (Product p : productArrayList) {
            if (p.getName().equals(name)) {
                System.out.println(p.toString());
            } else {
                System.out.println("Không có sản phẩm. ");
            }
        }
    }

    public void sort() {
        boolean flag = true;
        do {
            System.out.println("1. Sắp xếp tăng dần." +
                    "\n2. Sắp xếp giảm dần.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Collections.sort(productArrayList, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            if (o1.getPrice() > o2.getPrice()) {
                                return 1;
                            } else if (o1.getPrice() < o2.getPrice()) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                    });
                    for (Product p : productArrayList) {
                        System.out.println(p.toString());
                    }
                    flag = false;
                    break;
                case 2:
                    Collections.sort(productArrayList, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            if (o1.getPrice() > o2.getPrice()) {
                                return -1;
                            } else if (o1.getPrice() < o2.getPrice()) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    });
                    for (Product p : productArrayList) {
                        System.out.println(p.toString());
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai. Mời chọn lại.");
            }
        } while (flag);
    }
}

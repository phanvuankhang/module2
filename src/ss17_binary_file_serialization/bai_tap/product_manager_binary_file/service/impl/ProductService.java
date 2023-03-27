package ss17_binary_file_serialization.bai_tap.product_manager_binary_file.service.impl;

import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.model.Product;
import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.repository.IRepository;
import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.repository.impl.Repository;
import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final String PATH_FILE = "src\\ss17_binary_file_serialization\\bai_tap\\product_manager_binary_file\\data\\Product.dat";
    Repository repository = new Repository();
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> productList = repository.getAllProduct();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm.");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm.");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm.");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập hãng sản phẩm.");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm.");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, manufacturer, describe);
        productList.add(product);
        repository.add(PATH_FILE, productList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void search() {
        System.out.println("Nhập mã sản phẩm cần tìm.");
        int id = Integer.parseInt(scanner.nextLine());
        productList = repository.search(id);
        System.out.println("Sản phẩm cần tìm là: ");
        boolean flag = true;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.println(productList.get(i));
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Sản phảm không tồn tại !");
        }
    }
}

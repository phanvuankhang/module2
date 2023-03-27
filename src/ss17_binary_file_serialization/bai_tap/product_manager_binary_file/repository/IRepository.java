package ss17_binary_file_serialization.bai_tap.product_manager_binary_file.repository;

import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.model.Product;

import java.util.List;

public interface IRepository {
    List<Product> getAllProduct();

    void add(String pathFile, List<Product> productList);

    List<Product> search(int id);
}

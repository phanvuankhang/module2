package ss17_binary_file_serialization.bai_tap.product_manager_binary_file.repository.impl;

import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.model.Product;
import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.repository.IRepository;
import ss17_binary_file_serialization.bai_tap.product_manager_binary_file.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository {
    private final String PATH_FILE = "src\\ss17_binary_file_serialization\\bai_tap\\product_manager_binary_file\\data\\Product.dat";

    @Override
    public List<Product> getAllProduct() {
        return ReadAndWrite.readBinaryFile(PATH_FILE);
    }

    @Override
    public void add(String pathFile, List<Product> productList) {
        ReadAndWrite.writeBinaryFile(pathFile, productList);
    }


    @Override
    public List<Product> search(int id) {
        List<Product> productList = ReadAndWrite.readBinaryFile(PATH_FILE);
        List<Product> productList1 = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            productList1.add(productList.get(i));
        }
        return productList;
    }
}

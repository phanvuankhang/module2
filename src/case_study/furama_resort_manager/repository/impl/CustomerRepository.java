package case_study.furama_resort_manager.repository.impl;

import case_study.furama_resort_manager.model.person.Customer;
import case_study.furama_resort_manager.repository.ICustomerRepository;
import case_study.furama_resort_manager.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH_FILE = "src\\case_study\\furama_resort_manager\\data\\customer_data.csv";

    @Override
    public List<Customer> display() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        stringList.add(customer.getInfoToCustomer());
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), false);
            } else {
                ReadAndWrite.writeFile(PATH_FILE, stringList.get(i), true);
            }
        }
    }

    @Override
    public void edit(Customer customer) {

    }
}

package case_study.furama_resort_manager.repository;

import case_study.furama_resort_manager.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> display();
    void add(Customer customer);
    void edit(Customer customer);
}

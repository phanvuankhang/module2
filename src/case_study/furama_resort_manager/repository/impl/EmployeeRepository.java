package case_study.furama_resort_manager.repository.impl;

import case_study.furama_resort_manager.model.person.Employee;
import case_study.furama_resort_manager.repository.IEmployeeRepository;
import ss16_text_file.thuc_hanh.max_file.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    List<Employee> employees=new ArrayList<>();
    @Override
    public List<Employee> display() {
        return null;
    }

    @Override
    public void add(List<Employee> employees) {

    }

    @Override
    public void edit(List<Employee> employees) {

    }
}

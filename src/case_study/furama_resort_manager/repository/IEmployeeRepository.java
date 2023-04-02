package case_study.furama_resort_manager.repository;

import case_study.furama_resort_manager.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
 List<Employee> display();
void add(List<Employee> employees);
void edit(List<Employee> employees);
}

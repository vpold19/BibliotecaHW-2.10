package com.example.skypro.bibliotecahw_2_1_0.Service;

import com.example.skypro.bibliotecahw_2_1_0.Model.Employee;

import java.util.Collection;

public interface EmpService {
    Employee add(String name, String surname, int department, double salary);


    Employee remove(String name, String surname, int department, double salary);

    Employee find(String name, String surname, int department, double salary);

    Collection<Employee> findAll();
}

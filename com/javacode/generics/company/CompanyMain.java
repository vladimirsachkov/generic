package com.javacode.generics.company;

import com.javacode.generics.company.employees.Accountant;
import com.javacode.generics.company.employees.ITSpecialist;
import com.javacode.generics.company.employees.Manager;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Company company = new Company();

        Department<Accountant> accounting = new Department("Accounting", 5);
        Department<Manager> management = new Department("Management", 5);
        Department<ITSpecialist> itGuys = new Department("Accounting", 5);

        Accountant accountant = new Accountant("Alex", 1000.0f);
        ITSpecialist it = new ITSpecialist("James", 2000.2f);
        Manager manager = new Manager("Michal", 4000.2f);

        accounting.addEmployee(accountant);
        itGuys.addEmployee(it);
        management.addEmployee(manager);

        company.addDepartment(accounting);
        company.addDepartment(itGuys);
        company.addDepartment(management);

//        System.out.println(company);

        company.print(company.getDepartments());
        company.print(company.getEmployees());

        company.addToItEmployees(itGuys.getEmployees());
    }
}

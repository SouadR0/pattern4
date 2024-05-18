package com.mycompany.company.system;

import java.util.ArrayList;

// singltone and observer pattern

public class Company implements Subject {
    private static Company company;

     String name;
    private Employee head;
    private ArrayList<Department> departments;
    private ArrayList<Observer> observers;

    /** Private constructor to prevent constructing companies from other classes. */
    private Company(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public static Company getCompany(String name, Employee head) {
        if (Company.company == null) {
            Company.company = new Company(name, head);
        }
        return Company.company;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
        this.addObserver(department);
        this.notifyObservers();
    }

    public void removeDepartment(Department department) {
        this.departments.remove(department);
        this.removeObserver(department);
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

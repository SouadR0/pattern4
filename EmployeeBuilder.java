package com.mycompany.company.system;

public class EmployeeBuilder {
    private String name;
    private String id;
    private double salary;
    private int age;
    private Address address;
    
 public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;

    }
    
    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }
       public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }
    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
     }  

    
    public EmployeeBuilder setAddress(Address address) {
        this.address = address;
        return this;
     }

    
        public Employee build() {
        return new Employee(name, id, salary, age, address);

  }
    
 }
    

    

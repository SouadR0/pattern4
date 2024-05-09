package com.mycompany.company.system;
public class SeniorEmployeeDecorator{

private Employee employee;

public SeniorEmployeeDecorator(Employee employee) {
this.employee = employee;
}
    
 public void getSalary() {
 double baseSalary = this.employee.getSalary();
  this.employee.setSalary(baseSalary + (baseSalary * 0.2));  
 }     
  public Employee getEmployee() {
  return this.employee;
  }
}
    

    

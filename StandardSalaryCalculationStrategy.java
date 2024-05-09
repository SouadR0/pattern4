package com.mycompany.company.system;
public class StandardSalaryCalculationStrategy implements SalaryCalculatorStrategy{
 @Override
public double calculateSalary(Employee employee) {
return employee.getSalary();
}
}
       

package com.mycompany.company.system;
public class SenioritySalaryCalculationStrategy implements SalaryCalculatorStrategy{

private static final double SENIORITY_BONUS_PERCENTAGE = 0.1; // 10% bonus
@Override
public double calculateSalary(Employee employee) {
double baseSalary = employee.getSalary();  
double seniorityBonus = baseSalary * SENIORITY_BONUS_PERCENTAGE;
     return baseSalary + seniorityBonus;
}
}    
    

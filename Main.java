package com.mycompany.company.system;


public class Main {

    public static void main(String[] args) {

        Address add1 = new Address("NY", "LA", "109", "A910");
        Employee companyHead = new Employee("TEST1", "1AE", 300, 50, add1);
        Employee dept1head = new Employee("TEST2", "12AE", 300, 50, add1);
        Employee dept2head = new Employee("TEST3", "13AE", 300, 50, add1);
        
        
        Employee officeemp1 = new Employee("TES1", "121A", 200, 20, add1);
        Employee officeemp2 = new Employee("TEST2", "121A", 200, 20, add1);
        Employee officeemp3 = new Employee("TES3", "121A", 200, 20, add1);
        Employee officeemp4 = new Employee("TES4", "121A", 200, 20, add1);
        
        
        Employee builderEmployee = new EmployeeBuilder().setName("TEST").setAge(39).setId("EST").setSalary(300).setAddress(add1).build(); // Builder design pattern.
        

        // Create the company
        Company co =  Company.getCompany("TEST COMPANY", companyHead); // singelton design pattern.
        
        // Create departments
        Department dept1 = new Department("TEST DEPT1", add1, dept1head);
        Department dept2 = new Department("TEST DEPT2", add1, dept2head);
        
        // Add departments to the company
        co.addDepartment(dept1);
        co.addDepartment(dept2);
        
        // Create offices
        Office off1 = new Office("OFFICE1", dept1head);
        Office off2 = new Office("OFFICE2", dept2head);
        Office off3 = new Office("OFFICE3", dept1head);
        Office off4 = new Office("OFFICE4", dept2head);
        
        // Add offices to departments
        dept1.addOffice(off1);
        dept1.addOffice(off2);
        dept2.addOffice(off3);
        dept2.addOffice(off4);
        
        // Add employees to offices
        
        off1.addEmployee(officeemp1);
        off2.addEmployee(officeemp2);
        off3.addEmployee(officeemp3);
        off4.addEmployee(officeemp4);
        
        // Bridge design pattern.
        officeemp1.setAddressFormatter(new CustomAddressFormatter());
        officeemp1.formatAddress();
        officeemp1.setAddressFormatter(new DefaultAddressFormatter());
        officeemp1.formatAddress();
        
        
        Employee sed = new SeniorEmployeeDecorator(officeemp1).getEmployee(); // Decorator design pattern
        
        
        // Strategy design pattern.
        officeemp1.setSalaryCalculationStrategy(new SenioritySalaryCalculationStrategy());
        officeemp1.calculateSalary();
        officeemp1.setSalaryCalculationStrategy(new StandardSalaryCalculationStrategy());
        officeemp1.calculateSalary();

    }
}

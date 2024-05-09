//LAYAN ALNOUMANII
package com.mycompany.company.system;









public class Main 
{



  public static void main(String[] args) 
    {

  Address add1 = new Address("NY", "LA", "109", "A910");
  Employee companyHead = new Employee("TEST1", "1AE", 300, 50, add1);
  Employee dept1head = new Employee("TEST2", "12AE", 300, 50, add1);
  Employee dept2head = new Employee("TEST3", "13AE", 300, 50, add1);


   EmployeeBuilder empBuilder = new EmployeeBuilder();

            Employee officeemp1 = empBuilder.setName("TEST1").setId("120AB").setAddress(add1).setAge(30).setSalary(200).build();
            Employee officeemp2 = empBuilder.setName("TEST2").setId("121AB").setAddress(add1).setAge(31).setSalary(300).build();   
            Employee officeemp3 = empBuilder.setName("TEST3").setId("122AB").setAddress(add1).setAge(32).setSalary(400).build();
            Employee officeemp4 = empBuilder.setName("TEST4").setId("123AB").setAddress(add1).setAge(33).setSalary(500).build();





        
         officeemp1.setAddressFormatter(new CustomAddressFormatter());




  }

 }//end
        


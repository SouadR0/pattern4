


//LAYAN ALNOUMANII


package com.mycompany.company.system;
import java.util.ArrayList;






public class Office
    {

       //public vars
        public String number;
        public ArrayList<Employee> employees;
        public Employee head;
  


        
        
        
        
        public Office(String number, Employee head)
        {
        


//the same ones
                  this.number = number;

             this.head = head;



              this.employees = new ArrayList<>();




            }



  public void addEmployee(Employee emp)
        {
            //add the employee name 
         this.employees.add(emp);
 }
   
   
    



            public void removeEmployee(Employee emp)
        {
//remove the employee name 

              this.employees.remove(emp);


              }



        }

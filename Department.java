

package com.mycompany.company.system;
import java.util.ArrayList;



public class Department implements Observer{

 public String name;
  public Address address;
 public Employee head;
 ArrayList<Office> offices;
    
 public Department(String name, Address address, Employee head) {

        this.name = name;
        this.address = address;
        this.head = head;
        this.offices = new ArrayList<>();

     }

        public void addOffice(Office office) {
        this.offices.add(office);

   }

        public void removeOffice(Office office) {
        this.offices.remove(office);

   }
    
    @Override


        public void update(Subject subject) {
        if(subject instanceof Company) {
            Company company = (Company)subject;
            System.out.println("Company" + company.name + " was updated");

            
       }
            
    }
    
}


package com.mycompany.company.system;



public class DefaultAddressFormatter implements AddressFormatter{

     @Override
    
         public String formatAddress(Address address) {
       
          return address.toString();


       }
    

 }


package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
         System.out.println("Hello World!");

         Course CRS = new Course();
            //makes instance of course using default constructor

         Course PCRS = new Course(1229,"Jan",1001);
            //makes another instance of course but using the overloaded constructor

         System.out.println("My ID is: "+PCRS.getID());
         System.out.println("My Name is: "+PCRS.getName());
         System.out.println("My Code is: "+PCRS.getCode());
            //makes an output for the user
    }
    
}

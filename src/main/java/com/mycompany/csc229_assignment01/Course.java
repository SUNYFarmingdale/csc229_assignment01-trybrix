/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {

    //makes instance variable
    private int ID;
    private String Name;
    private int Code;

    public Course() {
        //makes and sets default constructors
        ID = 0;
        Name = "";
        Code = 0;
    }
    public Course(int ID, String Name, int Code) {
        //overloaded constructors and the 3 parameters
        this.ID = ID;
        this.Name = Name;
        this.Code = Code;
}
        //put setters and getters here
        public int getID(){
            return ID;
        }
        public void setID(int value1){
            ID = value1;
        }

        public String getName(){
            return Name;
        }
        public void setName(String value2){
            Name = value2;
        }

        public int getCode(){
            return Code;
        }
        public void setCode(int value3){
            Code = value3;
        }
}


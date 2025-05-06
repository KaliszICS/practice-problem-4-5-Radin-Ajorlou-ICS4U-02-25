/**
 * Class that stores student information. Includes specific toString and equals methods
 * @author Radin Ajorlou
 * @version 1.0.0
 */

import java.util.*;

public class Student {
    private String name;
    private int age;
    private String studentNumber;

     /**
      * Constructor
      * @param name String - name of student
      * @param age int - age of student 
      * @param studentNumber String - student number of student
      */
    public Student(String name, int age, String studentNumber){
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Gets the name of student 
     * @return String - name of student
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the age of student 
     * @return int - age of student
     */
    public int getAge(){
        return age;
    }

    /**
     * Gets the student number 
     * @return String - student number
     */
    public String getStudentNumber(){
        return studentNumber;
    }

    /**
     * Overrides the toString method for the class Student
     * @return String - student information (name, age - studentNumber)
     */
    @Override
    public String toString(){
        return name + ", " + age + " - " + studentNumber;
    }
    
    /**
     * Overrides the hashCode method
     * @return int - the hash code of the object 
     */
    @Override
    public int hashCode(){
        return Objects.hash(this.studentNumber);
    }
    
    /**
     * Overrides the equals method 
     * @return boolean - True if the student number of the 2 students are equal and false if not
     */
    @Override
    public boolean equals(Object obj){
        try{
            Student student = (Student)obj;
            if (student.getStudentNumber().equals(this.studentNumber)){
                return true;
            }
        }
        catch(Exception e){
            return false;
        }

        return false;
    }

}

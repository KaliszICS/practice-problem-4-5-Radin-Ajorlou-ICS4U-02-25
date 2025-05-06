/**
 * class cow that stores a cows name, age and weight and also includes overriden methods such as toString, equals and hashCode
 * @author Radin Ajorlou
 * @version 1.0.0
 */

import java.util.*;

public class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Constructor
     * @param name String - name of cow
     * @param age int - age of cow 
     * @param weight double - weight of cow
     */
    public Cow(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Gets the name of the cow 
     * @return String - name of cow
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the age of the cow
     * @return int - age of cow
     */
    public int getAge(){
        return age;
    }

    /**
     * Gets the weight of the cow
     * @return double - age of cow
     */
    public double getWeight(){
        return weight;
    }

    /**
     * Overrides the toString method
     * @return String - (name, age - weight)
     */
    @Override
    public String toString(){
        return name + ", " + age + " - " + weight;
    }

    /**
     * Overrides the hashCode method
     * @return int - the hashcode of the current instance of name, age and weight
     */
    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.age, this.weight);
    }

    /**
     * Overrides the equal method 
     * @param obj Object - takes in any object and if possible casts it to cass Cow and checks if it equals the other cow
     * @return boolean - true if the 2 cows are equal (name, age, weight), false if not
     */
    @Override
    public boolean equals(Object obj){
        try{
            Cow cow = (Cow)obj;
            if (cow.getName().equals(this.name) && cow.getAge() == this.age && cow.getWeight() == this.weight)
            {
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        return false;
    }

}

package ama.oop.abstraction;

//Abstraction is selecting data from a larger pool to show only the relevant details to the object.
//It helps to reduce programming complexity and effort.
abstract class Shape {
	 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 
    }

}

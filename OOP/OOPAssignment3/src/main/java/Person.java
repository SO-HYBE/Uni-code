/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sohai
 */
class Person {
    private String name;
    
    public Person(){
        this.name = "";
    }
    public Person(String theName){
        this.name = theName;
    }
    public Person(Person theObject){
        this.name = theObject.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "The Person's name is: " + name;
    }
    @Override
    public boolean equals(Object other){
       if(other == null){
           return false;
       }
       if(getClass() != other.getClass()){
           return false;
       }
       final Person oth = (Person) other;
       if((this.name == null) ? (oth.name != null):!this.name.equals(oth.name)){
           return false;
       }
       return true;
    }
    
     
}


class Vehicle {
    private String manufacture;
    private int cylinders;
    private Person per;
 
    public Vehicle(String manufactur, int cylinder, Person per1){
        manufacture = manufactur;
        cylinders = cylinder;
        per = per1;
    }    

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }
    
}

class Truck extends Vehicle {
    private double lCapacity;
    private int tCapacity;
    
    public Truck(String manufactur, int cylinder, Person per1, double lCap, int tCap){
        super(manufactur, cylinder, per1);
        lCapacity = lCap;
        tCapacity = tCap;
    }

    public double getlCapacity() {
        return lCapacity;
    }

    public void setlCapacity(double lCapacity) {
        this.lCapacity = lCapacity;
    }

    public int gettCapacity() {
        return tCapacity;
    }

    public void settCapacity(int tCapacity) {
        this.tCapacity = tCapacity;
    }
    @Override
    public String toString(){
        return "The load capacity is: " + this.lCapacity + " and the towing capacity is: " + this.tCapacity;
    }
    
    public boolean equals(){
        if(this.lCapacity < 0 ){
            return false;
        }
        if(this.tCapacity < 0 ){
            return false;
        }
        return true;
    }
}
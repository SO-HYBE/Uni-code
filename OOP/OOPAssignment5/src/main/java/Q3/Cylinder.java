/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author sohai
 */

class Circle{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return (radius*radius*Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
       
    
}

interface Display{
    public void printVolume();
}

interface Geometric extends Display{
    public double getVolume();
}

class Cylinder extends Circle implements Geometric{
    private double height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    @Override
    public double getVolume(){
        return (Math.PI * getRadius() * getRadius() * height);
    }
    @Override
    public void printVolume(){
        System.out.println("The volume of the cylinder is: " + getVolume());
    }
}

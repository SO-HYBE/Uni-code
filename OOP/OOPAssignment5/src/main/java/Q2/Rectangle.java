/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author sohai
 */

interface Shape{
    public float Area();
    public float Perimeter();
} 


class Rectangle implements Shape {
    private float height;
    private float width;
    
    public Rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    @Override
    public float Area(){
        return (this.width * this.height);
    }
    
    @Override
    public float Perimeter(){
        return (2*(this.width+this.height));
    }
    
    @Override
    public String toString(){
        return "The shape of the object is a Rectangle.";
    }
    
    public boolean equals(Rectangle r1){
        return r1.Area() == this.Area() && r1.Perimeter() == this.Perimeter();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author sohai
 */
public class Q2 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(23,15);
        Rectangle rec2 = new Rectangle(23,15);
        
        System.out.println("The Height of the Rectangle is: " + rec1.getHeight());
        System.out.println("The Width of the Rectangle is: " + rec1.getWidth());
        System.out.println("The Perimeter of the Rectangle is: " + rec1.Perimeter());
        System.out.println("The Area of the Rectangle is: " + rec1.Area());
        System.out.println(rec1.toString());
        System.out.println("Is rec1 and rec2 equal? : " + rec1.equals(rec2) );
    }
}

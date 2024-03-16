/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author sohai
 */
public class Q3 {
     public static void main(String[] args) {
            Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increment();
        counter1.increment();

        counter2.increment();
        counter2.increment();
        counter2.increment();
        counter2.decrement();

        System.out.println("Counter 1: " + counter1.toString());
        System.out.println("Counter 2: " + counter2.toString());

        if (counter1.equals(counter2)) {
            System.out.println("Counter 1 and Counter 2 have the same value.");
        } else {
            System.out.println("Counter 1 and Counter 2 have different values.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopassignment4;

/**
 *
 * @author sohai
 */
public class OOPAssignment4 {

    public static void main(String[] args) {
        Rational2 r1 = new Rational2(23,8);
        Rational2 r2 = new Rational2(-5,8);
        Rational2 r3 = new Rational2(23,8);
        Rational ratio1 = new Rational(5,-3);
        Rational ratio2 = new Rational(2);
        Rational ratio3 = new Rational(2,6);
        Rational ratio4 = new Rational(-2,-1);
        ratio1.normalize();
        ratio4.normalize();
        System.out.println("The result of adding r1,r2: " + Rational.add(ratio1, ratio2).toString());
        System.out.println("The result of subtracting r2,r3: " + Rational.sub(ratio2, ratio3).toString());
        System.out.println("The result of dividing r1,r3: " + Rational.divide(ratio1, ratio3).toString());
        System.out.println("The result of multiplying r3,r2: " + Rational.multiply(ratio3, ratio2).toString());
        System.out.println("The rational numbers r1,r2 are equal? ");
        System.out.println(ratio1.equals(ratio2));
        System.out.println("The rational numbers r2,r4 are equal? ");
        System.out.println(ratio2.equals(ratio4));
        
        //Part two:
        System.out.println("The result of dividing r3,r2 (p2 of the question): " + ratio3.divide(ratio2).toString());
        
        //Alternate part two:
        System.out.println("The rational numbers r1,r3 are equal (Alternate p2 of the question)? ");
        System.out.println(r1.equals(r3));
        r1.multiply(r2);
        System.out.println("The result of multiplying r1,r2 (Alternate p2 of the question): " + r1.toString());
        r2.add(r3);
        System.out.println("The result of adding r2,r3 (Alternate p2 of the question): " + r2.toString());
        r3.divide(r1);
        System.out.println("The result of dividing r3,r1 (Alternate p2 of the question): " + r3.toString()); 
        r2.sub(r1);
        System.out.println("The result of subtracting r2,r1 (Alternate p2 of the question): " + r2.toString());
        
                
    }
}

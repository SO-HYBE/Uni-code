/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopassignment3;

/**
 *
 * @author sohai
 */
import java.util.Scanner;

public class OOPAssignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q1,q2,q3;
        double m1,f1;
        Student S1 = new Student();
        System.out.println("Enter the grade of the first quiz of the student (between 1-10): ");
        q1 = scan.nextInt();
        S1.setQuiz1(q1);
        System.out.println("Enter the grade of the second quiz of the student (between 1-10): ");
        q2 = scan.nextInt();
        S1.setQuiz2(q2);
        System.out.println("Enter the grade of the third quiz of the student (between 1-10): ");
        q3 = scan.nextInt();
        S1.setQuiz3(q3);
        System.out.println("Enter the grade of the midterm exam of the student (between 1-100): ");
        m1 = scan.nextInt();
        S1.setMidterm(m1);
        System.out.println("Enter the grade of the final exam of the student (between 1-100): ");
        f1 = scan.nextInt();
        S1.setFinals(f1);
        
        System.out.println("The record of the student is as following: ");
        System.out.println("Quiz 1: " + S1.getQuiz1());
        System.out.println("Quiz 2: " + S1.getQuiz2());
        System.out.println("Quiz 3: " + S1.getQuiz3());
        System.out.println("Midterm: " + S1.getMidterm());
        System.out.println("Final: " + S1.getFinals());
        System.out.println("Overall Score: " + S1.getOverall());
        System.out.println("Overall Grade: " + S1.getGrade());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopassignment3;

/**
 *
 * @author sohai
 */
class Student {
    private int quiz1,quiz2,quiz3;
    private double quizTotal,finals,midterm,overall;
    private char grade;
    
    public void Student() {
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        finals = 0;
        overall = 0;
        quizTotal = 0.0;
        grade = 'Z';
    }

    public int getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(int quiz1) {
        if(quiz1>=0 && quiz1<=10){
            this.quiz1 = quiz1;
        } else{
           System.out.println("The number is out of range! (It should be between 1-10)");
        }
    }

    public int getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(int quiz2) {
        if(quiz2>=0 && quiz2<=10){
            this.quiz2 = quiz2;
        } else{
           System.out.println("The number is out of range! (It should be between 1-10)");
        }
    }

    public int getQuiz3() {
        return quiz3;
    }

    public void setQuiz3(int quiz3) {
        if(quiz3>=0 && quiz3<=10){
            this.quiz3 = quiz3;
        } else{
           System.out.println("The number is out of range! (It should be between 1-10)");
        }
    }

    public double getMidterm() {
        return (midterm);
    }

    public void setMidterm(double midterm) {
        if(midterm>=0 && midterm<=100){
            this.midterm = midterm;
        } else{
           System.out.println("The number is out of range! (It should be between 1-100)");
        }
    }

    public double getFinals() {
        return (finals);
    }

    public void setFinals(double finals) {
        if(finals>=0 && finals<=100){
            this.finals = finals;
        } else{
           System.out.println("The number is out of range! (It should be between 1-100)");
        }
    }

    public double getQuizTotal() {
        int pq1 = this.quiz1*10;
        int pq2 = this.quiz2*10;
        int pq3 = this.quiz3*10;
        this.quizTotal = pq1 + pq2 + pq3;
        return (this.quizTotal*(0.08333333333));
    }

    public double getOverall() {
        this.overall = (getQuizTotal()) + (this.midterm*0.35) + (this.finals*0.40);
        return overall;
    }

    public char getGrade() {
        if(this.overall>=90.0){
            this.grade = 'A';
        } else if (this.overall>=80.0 && this.overall < 90.0){
            this.grade = 'B';
        } else if (this.overall>=70.0 && this.overall < 80.0){
            this.grade = 'C';
        } else if (this.overall>=60.0 && this.overall < 70.0){
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
        
        return grade;
    }
    
    @Override
    public String toString(){
        return ("The overall grade of the student is: " + this.grade);
    }
    
    public String equals(){
        if(this.grade == 'F'){
            return "The student failed!";
        }
        return " ";
    }
    
}

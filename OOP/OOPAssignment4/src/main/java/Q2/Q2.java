/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.Arrays;

/**
 *
 * @author sohai
 */
public class Q2 {
     public static void main(String[] args) {
         Document d1 = new Document(3);
         Email e1 = new Email(1,"Assignment", "Kareem Ashraf");
         Book b1 = new Book(3,"Time");
         
         b1.addAuthor("Ahmed");
         d1.addAuthor("Zaid");
         b1.addAuthor("Fares");
         b1.addAuthor("Shami");
         e1.addAuthor("Salem");
                  
         System.out.println("The date today is: " + d1.getDate());
         System.out.println("The email is to: " +e1.getTo());
         System.out.println("The email is from: " + Arrays.toString(e1.getAuthors()));
         System.out.println("The title of the book is: " + b1.getTitle());
         System.out.println("The Authors of the book is: " + Arrays.toString(b1.getAuthors()));
         
     }
}

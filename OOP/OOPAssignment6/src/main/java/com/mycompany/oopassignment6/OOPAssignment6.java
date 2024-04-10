/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopassignment6;

/**
 *
 * @author sohai
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.StringJoiner;
public class OOPAssignment6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to be capitalized: ");
        String str = scan.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        StringJoiner fin = new StringJoiner(" ");
        while(st.hasMoreElements()){
            String letter = st.nextToken();
            fin.add(letter.substring(0,1).toUpperCase() + letter.substring(1));
        }
        System.out.println(fin.toString());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sohai
 */
public class OOPAssignment2Q2 {
    public static void main(String[] args) {
        Counter count = new Counter();
        
        count.incCount();
        count.incCount();
        count.incCount();
        count.incCount();
        count.incCount();
        count.incCount();
        count.decCount();
        
        count.printCount();
                
        count.resetCount();
        
        System.out.println("The count after reseting the counter is: " + count.getCount());
        
        count.incCount();
        count.incCount();
        count.incCount();
        count.incCount();
        count.incCount();
        count.incCount();
        count.decCount();
        count.decCount();
              
        if("4".equals(String.valueOf(count.getCount()))){
            System.out.println("The current value of the count is the same as the string value of 4 !!!");
        }
    }
}

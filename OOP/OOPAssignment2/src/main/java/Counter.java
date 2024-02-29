/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sohai
 */
class Counter {
    private int count;
    
    public void Counter(){
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        this.count = 0;
    }
    
    public void incCount(){
        this.count++;
    }
    
    public void decCount(){
        if(this.count > 0){
            this.count--;
        }
    }
    
    public void printCount(){
        System.out.println("The current count of the counter is: " + this.count);
    }
    
}

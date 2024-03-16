/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author sohai
 */
class Counter {
        private int counter;

    public Counter() {
        counter = 0;
    }

    public void reset() {
        counter = 0;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        if (counter > 0) {
            counter--;
        } else {
            System.out.println("Counter cannot be negative.");
        }
    }

    public int getValue() {
        return counter;
    }

    @Override
    public String toString() {
        return "Counter value: " + counter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Counter)) {
            return false;
        }
        Counter other = (Counter) obj;
        return this.counter == other.counter;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.counter;
        return hash;
    }
}

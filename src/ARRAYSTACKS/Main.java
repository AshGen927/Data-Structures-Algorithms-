/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYSTACKS;

import java.util.Stack;

/**
 *
 * @author ASHIN
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayStack As = new ArrayStack();
        
        As.push(10);
        As.push(20);
        As.push(30);
        As.push(40);
        
        System.out.println("Is the Stack Empty : "+As.isEmpty());
        System.out.println("Is the Stack Full : "+As.isFull());
        System.out.println("Stack Capacity : "+As.capacity);
        System.out.println("Popped : "+As.pop());
        System.err.println("Peeked : "+As.peek());
        As.display();
        
        
    }
}



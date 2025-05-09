/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYSTACKS;

/**
 *
 * @author ASHIN
 */
public class ArrayStack {
    int top;
    int capacity;
    int[] stack;

    public ArrayStack() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity - 1;
    }
    public int push(int data){
        if(isFull()){
            System.out.println("Stack is Full");          
        }
        return stack[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    public void display(){
        for(int  i:stack){
            System.err.println(i);
        }
    }
    
}

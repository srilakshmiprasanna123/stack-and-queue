package com.bridgelabz;

public class Stack {
    Node top;

    Stack() {
        this.top = null;
    }

    // Pushing element on the top of the stack
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (newNode == null) {
            System.out.println("\nStack Overflow");
            return;
        }

        newNode.data = data;

        newNode.next = top;

        top = newNode;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).next;
    }

    public void display() { // print method
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to Stack and Queue Problem....!!!");
        Stack stack = new Stack();

        System.out.println();
        System.out.println("Element present in the Stack");
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();

        // print Top element of Stack
        System.out.println();
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());

        System.out.println();
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());

        System.out.println();
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1project;
import jsjf.LinkedStack;
import jsjf.ArrayStack; 

/**
 *
 * @author jackjt
 */
public class Exam1Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// 
	// TODO EXAM 1 - TAKEHOME
	// 1. Complete the ArrayStack and LinkedStack classes (all 6 methods)
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        
        //I have placed comments where I ran the first tests for all 6 methods and
        //the 2 exceptions for both the normal stack and the linked stack
        
        ArrayStack Stack1 = new ArrayStack();
        System.out.println("Is the stack empty? " + Stack1.isEmpty()); //test isEmpty()
        Stack1.push(7); //test push()
        Stack1.push(10);
        Stack1.push(13);
        Stack1.push(16);
        Stack1.push(19);
        int size = Stack1.size(); //test size()
        System.out.println(size +  " numbers have been pushed to the stack.");
        System.out.println("Current stack: " + Stack1.toString()); //test toString()
        Stack1.pop(); //test pop()
        Stack1.pop();
        System.out.println("Stack has been changed");
        System.out.println("New top element: " + Stack1.peek()); //test peek()
        Stack1.pop();
        Stack1.pop();
        Stack1.pop();
        System.out.println("Stack has been changed.\nIs the stack empty? " + Stack1.isEmpty());
        Stack1.pop(); //test pop exception()
        Stack1.peek(); //test peek exception()
        
        LinkedStack Stack2 = new LinkedStack();
        System.out.println("\nIs the linked stack empty? " + Stack2.isEmpty()); //test isEmpty()
        Stack2.push(1); //test push()
        Stack2.push(2);
        Stack2.push(3);
        Stack2.push(4);
        Stack2.push(5);
        Stack2.push(6);
        size = Stack2.size(); //test size()
        System.out.println(size + " numbers have been pushed to the linked stack");
        System.out.println("Current linked stack: " + Stack2.toString()); //test toString()
        Stack2.pop(); //test pop()
        Stack2.pop();
        Stack2.pop();
        System.out.println("Linked stack has been changed");
        System.out.println("New top element: " + Stack2.peek()); //test peek()
        Stack2.pop();
        Stack2.pop();
        Stack2.pop();
        System.out.println("Linked stack has been changed.\nIs the linked stack empty? " + Stack2.isEmpty());
        Stack2.pop(); //test pop exception()
        Stack2.peek(); //test peek exception()
        
        
    }
    
}

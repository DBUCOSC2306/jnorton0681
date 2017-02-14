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
        ArrayStack Stack1 = new ArrayStack();
        System.out.println("Is the stack empty? " + Stack1.isEmpty());
        Stack1.push(7);
        Stack1.push(10);
        Stack1.push(13);
        Stack1.push(16);
        Stack1.push(19);
        Stack1.push(21);
        System.out.println("6 numbers have been pushed");
        System.out.println("Current stack: " + Stack1.toString());
        System.out.println("Is the stack empty? " + Stack1.isEmpty());
        
        LinkedStack Stack2 = new LinkedStack();
        System.out.println("Is the linked stack empty? " + Stack2.isEmpty());
        Stack2.push(7);
        Stack2.push(10);
        Stack2.push(13);
        Stack2.push(16);
        Stack2.push(19);
        Stack2.push(21);
        System.out.println("6 numbers have been pushed");
        System.out.println("Current stack: " + Stack2.toString());
        System.out.println("Is the linked stack empty? " + Stack2.isEmpty());
        
        
    }
    
}

package chapter5HWproject;
 
import jsjf.CircularArrayQueue;
import jsjf.LinkedQueue;

/**
 *
 * @author jackjt
 */
public class Chapter5HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the CirucularArrayQueue and LinkedQueue classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        CircularArrayQueue CircleQ = new CircularArrayQueue(10);
        System.out.println("Is the circle queue empty? " + CircleQ.isEmpty()); //test isEmpty() (True)
        CircleQ.enqueue(7); //test enqeue()
        CircleQ.enqueue(10);
        CircleQ.enqueue(14);
        CircleQ.enqueue(17);
        CircleQ.enqueue(20);
        int CircledSize = CircleQ.size(); //test size()
        System.out.println(CircledSize +  " numbers have been enqueued to the circle queue.");
        System.out.println("Current circle queue: " + CircleQ.toString()); //test toString()
        CircleQ.dequeue(); //test dequeue()
        CircleQ.dequeue();
        CircleQ.dequeue();
        System.out.println("Circle queue has been changed");
        System.out.println("Is the circle queue empty? " + CircleQ.isEmpty()); //test isEmpty() (False)
        System.out.println("New front element: " + CircleQ.first()); //test first()
        System.out.println("Current circle queue: " + CircleQ.toString()); //test toString()
        CircleQ.dequeue();
        CircleQ.dequeue();
        System.out.println("Circle queue has been changed.\nIs the circle queue empty? " + CircleQ.isEmpty());
        CircleQ.dequeue(); //test dequeue() exception
        CircleQ.first(); //test first() exception
        
        System.out.println("");
        
        LinkedQueue LinkedQ = new LinkedQueue();
        System.out.println("Is the linked queue empty? " + LinkedQ.isEmpty()); //test isEmpty() (True)
        LinkedQ.enqueue(2); //test enqueue()
        LinkedQ.enqueue(4);
        LinkedQ.enqueue(8);
        LinkedQ.enqueue(16);
        LinkedQ.enqueue(32);
        LinkedQ.enqueue(64);
        int LinkedSize = LinkedQ.size(); //test size()
        System.out.println(LinkedSize +  " numbers have been enqueued to the linked queue.");
        System.out.println("Current linked queue: " + LinkedQ.toString()); //test toString()
        LinkedQ.dequeue(); //test dequeue()
        LinkedQ.dequeue();
        LinkedQ.dequeue();
        System.out.println("Linked Queue has been changed");
        System.out.println("Is the linked queue empty? " + LinkedQ.isEmpty()); //test isEmpty() (False)
        System.out.println("New front element: " + LinkedQ.first()); //test first()
        System.out.println("Current linked queue: " + LinkedQ.toString()); //test toString()
        LinkedQ.dequeue();
        LinkedQ.dequeue();
        LinkedQ.dequeue();
        System.out.println("Linked queue has been changed.\nIs the linked queue empty? " + LinkedQ.isEmpty());
        LinkedQ.dequeue(); //test dequeue() exception
        LinkedQ.first(); //test first() exception
        
        
    }
}


































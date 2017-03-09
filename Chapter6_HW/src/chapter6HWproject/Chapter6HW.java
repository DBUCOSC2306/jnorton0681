package chapter6HWproject;
 
import jsjf.ArrayOrderedList;
import jsjf.ArrayUnorderedList;

/**
 *
 * @author jackjt
 */
public class Chapter6HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
	// 1. Complete the incomplete classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        ArrayUnorderedList Unordered = new ArrayUnorderedList(2);
        System.out.println("Is the circle queue empty? " + Unordered.isEmpty()); //test isEmpty() (True)
        Unordered.addToFront(1); //test enqeue()
        Unordered.addToFront(10);
        Unordered.addToRear(14);
        Unordered.addToRear(16);
        Unordered.addToRear(17);
        Unordered.addToRear(19);
        Unordered.addAfter(15, 14);
        Unordered.addAfter(18, 17);
        Unordered.addToRear(20);
        //Unordered.removeLast();
//       Unordered.addAfter(1,17);
//        Unordered.addToRear(20);
          int UnorderedSize = Unordered.size(); //test size()
          System.out.println(UnorderedSize +  " numbers have been enqueued to the circle queue.");
          System.out.println("Current circle queue: " + Unordered.toString()); //test toString()
//        

ArrayOrderedList Ordered = new ArrayOrderedList(2);
        System.out.println("Is the circle queue empty? " + Unordered.isEmpty()); //test isEmpty() (True)
        Ordered.add(14);
        Ordered.add(1); //test enqeue()
        Ordered.add(10);
        Ordered.add(7);
        Ordered.add(15);
        Ordered.add(17);
        Ordered.add(5);
        //Unordered.removeLast();
//       Unordered.addAfter(1,17);
//        Unordered.addToRear(20);
          int Orderedsize = Ordered.size(); //test size()
          System.out.println(Orderedsize +  " numbers have been enqueued to the circle queue.");
          System.out.println("Current circle queue: " + Ordered.toString()); //test toString()
          
//        Unordered.removeFirst();
//        Unordered.removeLast();
//        System.out.println("Circle queue has been changed");
//        System.out.println("Is the circle queue empty? " + Unordered.isEmpty()); //test isEmpty() (False)
//        System.out.println("New front element: " + Unordered.first()); //test first()
//        System.out.println("Current circle queue: " + Unordered.toString()); //test toString()
//        Unordered.removeFirst();
//        Unordered.removeFirst();
//        System.out.println("Circle queue has been changed.\nIs the circle queue empty? " + Unordered.isEmpty());
//        Unordered.removeFirst(); //test dequeue() exception
//        Unordered.first(); //test first() exception
        
    }
}


































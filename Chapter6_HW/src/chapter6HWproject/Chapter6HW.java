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
        //3. Push all of the changes back to the repository (git push)
        ArrayUnorderedList Unordered = new ArrayUnorderedList(2);
        System.out.println("Is the unordered list empty? " + Unordered.isEmpty()); //test isEmpty() (True)
        int UnorderedSize = Unordered.size(); //test size()
        Unordered.addToFront(1); //test addToFront()
        Unordered.addToRear(14); //test addToRear()
        Unordered.addAfter(3, 1); //test addToAfter()
        UnorderedSize = Unordered.size();
        System.out.println("Unordered list new size: " + UnorderedSize + ". Number of elements in list: " + Unordered.getCount());
        //test first() and last() 
        System.out.println("Unordered list first element: " + Unordered.first() + ". Unordered list last element: " + Unordered.last()); 
        System.out.println("Current unordered list: " + Unordered.toString()); //test toString()
        Unordered.remove(3);//test remove()
        Unordered.removeLast();//test removeLast()
        Unordered.removeFirst();//test removeFirst()
        UnorderedSize = Unordered.size();
        System.out.println("Unordered list new size: " + UnorderedSize + ". Number of elements in list: " + Unordered.getCount());
        System.out.println("Current unordered list: " + Unordered.toString()); //test toString()
        
        System.out.println("");
         
        ArrayOrderedList Ordered = new ArrayOrderedList(2);
        System.out.println("Is the unordered list empty? " + Ordered.isEmpty()); //test isEmpty() (True)
        int OrderedSize = Ordered.size(); //test size()
        Ordered.add(5); //test add()
        Ordered.add(1); //test add()
        Ordered.add(3); //test add()
        OrderedSize = Ordered.size();
        System.out.println("Ordered list new size: " + OrderedSize + ". Number of elements in list: " + Ordered.getCount());
        //test first() and last() 
        System.out.println("Ordered list first element: " + Ordered.first() + ". Ordered list last element: " + Ordered.last()); 
        System.out.println("Current Ordered list: " + Ordered.toString()); //test toString()
        Ordered.remove(3);//test remove()
        Ordered.removeLast();//test removeLast()
        Ordered.removeFirst();//test removeFirst()
        OrderedSize = Ordered.size();
        System.out.println("Ordered list new size: " + OrderedSize + ". Number of elements in list: " + Ordered.getCount());
        System.out.println("Current Ordered list: " + Ordered.toString()); //test toString()
        
        System.out.println("");
    }
}


































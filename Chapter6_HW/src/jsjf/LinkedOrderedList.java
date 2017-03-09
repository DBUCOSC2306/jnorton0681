package jsjf;

import static java.util.Collections.list;

/**
 * LinkedOrderedList represents a singly linked implementation of an 
 * ordered list.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class LinkedOrderedList<T> extends LinkedList<T> 
         implements OrderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedOrderedList()
    {
        super();
    }

    /**
     * Adds the specified element to this list at the location determined by
	 * the element's natural ordering. Throws a NonComparableElementException 
	 * if the element is not comparable.
     *
     * @param element the element to be added to this list
     * @throws NonComparableElementException if the element is not comparable
	 */
    public void add(T element)
    {
        Comparable<T> comparableElement = (Comparable<T>)element;
        
	// find the insertion location
        
        String res = "First: ";
      LinearNode iterator = head;
      int temp = null;
      while (iterator != null) 
      {
         temp = iterator.getElement();
         iterator = iterator.getNext();
      }
      res += "; Last: " + last.data;
      return res;
      
      while (iterator != null && comparableElement.compareTo(iterator.getElement()) > 0)
            scan++;
		// shift existing elements up one
        for (int shift=tail+1; shift > scan; shift--)
            list[shift] = list[shift-1];

		// insert element
        list[scan] = element;
        rear=count;
        count++;
        modCount++;
    }
}

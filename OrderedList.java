import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrderedList<E extends Comparable<E>> implements Iterable<E> {

    /** A list to contain the data. */
    private List<E> theList = new LinkedList<>();


    public E get(int index) {
        // YOUR CODE HERE
    	
    	//gets the items of the index
        return theList.get(index);
    }

    public Iterator<E> iterator() {
    	//runs through code
        return theList.iterator();
    }

    public void remove(E item) {
        // add your code here
    	//removes first occurence of item
    	theList.remove(item);
    }

    // add an item to this list, maintaining the order of the items
    public void add(E item) {

        ListIterator<E> iterator = theList.listIterator();
        // Remove the next line and add your own code (this method takes the most work).
        // delete this line and write your code below
        
        //adds the item 
        //sorts the list
        theList.add(item);
        
        Collections.sort(theList);

        // YOUR CODE HERE
    }


    public int size() {
        // YOUR CODE HERE (1 line)
    	
    	//returns the size of the lsit
        return theList.size(); // delete this return statement and write a correct one.
    }
}

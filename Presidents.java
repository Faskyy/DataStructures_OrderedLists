/* This class should implement a Comparable interface (right now it doesn't)
   for OrderedListTest3.java to work.
   Comparable objects implement the compareTo() method. Implement this method
   based on how you'd like the objects of this class to be compared.
 */
public class President implements Comparable<President> {  // you should change this line

    String name;
    int year;

    public President(String firstName, int yearElected) {
        name = firstName;
        year = yearElected;
    }

    public String toString() {
        return name;
    }

    // decide how you'd like the President objects compared and
    // implement this method appropriately.
    public int compareTo(President that) {
        // YOUR CODE GOES HERE
    	
    	//compares presidents based on year in office
    	//if the year is less then other president's year
    	//return -1 (indication that it is smaller)
    	
    	if(this.year < that.year)
    		return -1; 
    	else if (this.year > that.year)
    		return 1;
    	else return 0;// you should change this return statement.
    	
//    	return this.name.compareTo(that.name);
    }
}

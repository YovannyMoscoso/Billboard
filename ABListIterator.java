package domain;

import java.util.Iterator;

public class ABListIterator<T> implements Iterator<T> {
   private SortedABList<T> theList;   // reference to the list we are iterating over
   private int previousPos = -1;      // last position we have returned in the iteration

   // create the iterator by passing the list to the constructor
   public ABListIterator(SortedABList<T> target) {
      theList = target;
   }

   public boolean hasNext() {
   // Returns true if the iteration has more elements; otherwise returns false.
   // if previousPos is at the end of the list, we are done
      return (previousPos < (theList.size() - 1)) ;
   }

   public T next() {
   // Returns the next element in the iteration.
   // Throws NoSuchElementException: if the iteration has no more elements
      if (!hasNext())
         throw new IndexOutOfBoundsException("Illegal invocation of next " +
                         " in ABList iterator.\n");
      previousPos++;
      return theList.list[previousPos];
   }
}

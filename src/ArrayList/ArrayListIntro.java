package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    /*

    Internally an ArrayList uses an Object[] Array which is an
     array of objects. All operation like deleting, adding, and updating
      the elements happens in this Object[] array.


The backing data structure of ArrayList is an array of Object classes.
 ArrayList class in Java has 3 constructors. It has its own version of
  readObject and writeObject methods. Object Array in ArrayList is
   transient. It implements RandomAccess, Cloneable, and
   java.io.Serializable (which are Marker Interface in Java)

ArrayList is slower than array due to the overhead
of resizing and additional methods

Whenever an ArrayList exceeds the capacity of the internal array it creates
a new internal array with 50% more capacity and copies all old elements from
 the old array to the new one. Repeated resizes will add load for memory
 allocation and garbage collection and the time to do the copy.

 The time complexity of the common operations in ArrayList java.

add(): For adding a single element O(1) . Adding n element in the array list takes O(n).
add(index, element): adding element in particular index in average runs in O(n) time.
get(): is always a constant time O(1) operation.
remove(): runs in linear O(n) time. We have to iterate the entire array to find the element fit for removal.
indexOf():  It runs over the whole array and iterates through each and every element worst case will be the size of the array n .so, it requires O(n) time.
contains(): implementation is based on indexOf(). So it will also run in O(n) time.
The size, isEmpty, set, iterator, and listIterator operations run in constant time O(1)

     */
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(2,3,5,7,87,3,2));
        //no type
        ArrayList arrayListNoType=new ArrayList();

    }




}

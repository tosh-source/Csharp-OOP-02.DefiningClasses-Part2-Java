package genericClasses.models;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {

    private T[] elements;
    private Integer currentPosition = 0;

    public T[] getElements() {
        return this.elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public GenericList() {
        this(4);
    }

    public GenericList(int elementsCapacity) {  //How to initialize a GenericArray* How to create generics**
        this.elements = (T[]) new Object[elementsCapacity];  //Possible solution --> "this.elements = (T[]) Array.newInstance(Class.class, elementsCapacity);"
    }

    public GenericList(T[] elements) {
        this.elements = elements;
    }

    public void Add(T element) {
        //TO DO: Autogrow()
        this.elements[currentPosition] = element;
        currentPosition++;
        //TO DO: Autogrow()
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(this.getElements()).iterator();  // How to create iterator ***
    }

}

//* How to initialize generic array? -> https://stackoverflow.com/questions/50266224/how-to-initialize-generic-array

//** How to create a generic array in Java? -> https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
//** array of type T (Java generics) -> https://stackoverflow.com/questions/30778790/array-of-type-t-java-generics
//** Java Code Examples for java.lang.reflect.Array#newInstance() -> https://www.programcreek.com/java-api-examples/?class=java.lang.reflect.Array&method=newInstance

//*** https://www.geeksforgeeks.org/java-implementing-iterator-and-iterable-interface/

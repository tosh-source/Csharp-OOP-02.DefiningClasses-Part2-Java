package genericClasses.models;

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

    public GenericList(T[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(this.getElements()).iterator();
    }

}

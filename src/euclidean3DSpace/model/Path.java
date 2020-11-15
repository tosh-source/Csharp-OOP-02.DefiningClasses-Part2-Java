package euclidean3DSpace.model;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class Path implements Iterable<Point3D> {

    private AbstractCollection<Point3D> points;  //This class provides a skeletal implementation of the Collection interface. **

    public void addPoint(Point3D point){
        this.points.add(point);
    }
    public void removePoint(Point3D point){
        this.points.remove(point);
    }

    public Path(){
        this.points = new ArrayList<>();
    }

    //Implement iterator() to use "foreach" loop. ***
    // NOTE: Implementation of "foreach" METHOD is another option to iterate collection.
    @Override
    public Iterator<Point3D> iterator() {
        return this.points.iterator();
    }
}

// ** more info --> https://docs.oracle.com/javase/7/docs/api/java/util/AbstractCollection.html
// *** How to implement iterator()  --> https://stackoverflow.com/questions/975383/how-can-i-use-the-java-for-each-loop-with-custom-classes

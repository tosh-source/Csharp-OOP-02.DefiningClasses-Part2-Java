package euclidean3DSpace.model;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

public class Path {

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
}

// ** more info --> https://docs.oracle.com/javase/7/docs/api/java/util/AbstractCollection.html

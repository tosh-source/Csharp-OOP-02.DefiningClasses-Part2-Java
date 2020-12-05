package euclidean3DSpace;

import euclidean3DSpace.extensions.ExtensionPointsOf3DSpace;
import euclidean3DSpace.model.Path;
import euclidean3DSpace.model.Point3D;
import euclidean3DSpace.textFromFileReader.PathStorage;

public class Euclidean3DSpace {
    public static void main(String[] args) {
        //region TESTS
        //Test point3D and calculation
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
        System.out.println(Point3D.getStartCoordinate());
        System.out.println(ExtensionPointsOf3DSpace.calculateDistance(point3D, Point3D.getStartCoordinate()));

        //Test collection of points (aka. Path)
        Path points = new Path();
        points.addPoint(point3D);
        points.addPoint(Point3D.getStartCoordinate());
        points.addPoint(new Point3D(3, 3, 3));
        for (var item : points) {
            System.out.println(item);
        }

        //Test file reader & writer
        // PathStorage.SafePath(points);
        Path newPointsFromFile = PathStorage.loadPath("", "CollectionOfPoints.txt");

        //endregion
    }
}

package euclidean3DSpace;

import euclidean3DSpace.extensions.ExtensionPointsOf3DSpace;
import euclidean3DSpace.model.Point3D;

public class Euclidean3DSpace {
    public static void main(String[] args) {
        //region TESTS
        //Test point3D and calculation
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
        System.out.println(Point3D.getStartCoordinate());
        System.out.println(ExtensionPointsOf3DSpace.calculateDistance(point3D, Point3D.getStartCoordinate()));

        //endregion
    }
}

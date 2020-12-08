package euclidean3DSpace.extensions;

import euclidean3DSpace.models.Point3D;

public final class ExtensionPointsOf3DSpace { //In Java, static classes can be declared only as nested class! **

    private ExtensionPointsOf3DSpace(){  //NOTE: To IMITATE static class (without using nested class), top-class is declared as final + private constructor (to prevent instantiation). **
    }

    public static double calculateDistance(Point3D firstPoint, Point3D secondPoint) {
        double distance = 0d;
        distance = Math.sqrt(
                        Math.pow((firstPoint.getX() - secondPoint.getX()), 2) +  ////this is equivalent of "(firstPoint.getX() - secondPoint.getX()) * (firstPoint.getX() - secondPoint.getX())"
                        Math.pow((firstPoint.getY() - secondPoint.getY()), 2) +
                        Math.pow((firstPoint.getZ() - secondPoint.getZ()), 2)
        );
        return distance;
    }
}

// ** more about Java static classes --> https://stackoverflow.com/questions/7486012/static-classes-in-java

//TEST static class "CalculateDistance" (TEST ARE IN C# CODE)
//
//Test-1
//var point3D = new Point3D() {X = 1, Y = 1, Z = 1};
//Console.WriteLine(ExtensionPointsOf3DSpace.CalculateDistance(point3D, Point3D.StartCoordinate));
//result -> 1.73205080756888
//
//Test-2
//var point3D = new Point3D() {X = 1, Y = 2, Z = 3};
//Console.WriteLine(ExtensionPointsOf3DSpace.CalculateDistance(point3D, Point3D.StartCoordinate));
//result -> 3.74165738677394
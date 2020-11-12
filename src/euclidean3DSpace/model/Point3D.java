package euclidean3DSpace.model;

import java.text.MessageFormat;

public final class Point3D {  //Unlike C#, Java do NOT provide structures for now! It will be available in near future. More about "Java Inline Classes" --> https://www.infoq.com/articles/inline-classes-java/

    private static final Point3D startCoordinate;  //There is MO "static readonly" in Java! NOTE: "final" is like "readonly" field on C#. "static final" is like "const" field on C#.
    private double x;
    private double y;
    private double z;

    public static Point3D getStartCoordinate() {
        return startCoordinate;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getZ(){
        return this.z;
    }
    public void setZ(double z){
        this.z = z;
    }

    static {
        startCoordinate = new Point3D(0d, 0d, 0d);
    }
    public Point3D() {
    }
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        var result = "";
        result += String.format(MessageFormat
                .format("X:{0}, Y:(1), Z:{2}", getX(), getY(), getZ()));

        return result;
    }
}

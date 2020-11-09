package euclidean3DSpace.model;

public class Point3D {  //Unlike C#, Java do NOT provide structures for now! It will be available in near future. More about "Java Inline Classes" --> https://www.infoq.com/articles/inline-classes-java/

    private static final Point3D startCoordinate = null;  //"final" is like "readonly" field on C#. "static final" is like "const" field on C#. "static final someValue = null" is like "static readonly" on C#.
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

//    static {
//        startCoordinate = new Point3D(setX(0.0), setY(0), setZ(0));
//    }
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

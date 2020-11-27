package euclidean3DSpace.textFromFileReader;

import euclidean3DSpace.model.Path;

import java.io.File;
import java.util.Scanner;

public final class PathStorage {
    public static Path LoadPath(String directory, String fileName) {
        //Method can read Point3D in format "X = 1, Y = 2, Z = 3" or "X:1 Y:2 Z:3". There is no limit how many Point3D can be read as collection (Models.Path). Every Point3D need to be in NEW line!

        Path collectionOfPoints = new Path();
            try{
                File file = new File(directory + fileName);
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()){

                }


            } catch (Exception e) {
                e.getStackTrace();
            }
    }
}

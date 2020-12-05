package euclidean3DSpace.textFromFileReader;

import euclidean3DSpace.model.Path;
import euclidean3DSpace.model.Point3D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public final class PathStorage {
    public static Path LoadPath(String directory, String fileName) {
        //Method can read Point3D in format "X = 1, Y = 2, Z = 3" or "X:1 Y:2 Z:3". There is no limit how many Point3D can be read as collection (Models.Path). Every Point3D need to be in NEW line!

        Path collectionOfPoints = new Path();
        Scanner reader = null;
        try {
            reader = new Scanner(new File(directory + fileName));

            String currentLine;
            while (reader.hasNextLine()) {
                currentLine = reader.nextLine();

                currentLine = currentLine.replaceAll("[^\\x00-\\x7F]", "");  //WARNING: Java read BOM from file and assign as empty ("") string, which is not! This regex remove all not ASCII chars!
                String[] splittedText = currentLine.split("X = |,| |Y = |Z = |X:|X: |Y:|Y: |Z:|Z: ");  //Use Regular expression OR "|" , to catch many strings. Example --> "ABC|abc|ONE|two"

                //Remove empty entries from result
                var tempVal = new ArrayList<>();
                for (var item : splittedText) {
                    if (!(item.isBlank())) {   //add only if there is a value
                        tempVal.add(item);
                    }
                }
                splittedText = tempVal.toArray(String[]::new);

                Double[] XYZ_points = new Double[3];  //no more 3 elements needed
                for (int index = 0; index <= splittedText.length - 1; index++) {
                    XYZ_points[index] = Double.parseDouble(splittedText[index]);  //if more than three doubles, IndexOutOfRangeException
                }

                Point3D currentPoint = new Point3D(XYZ_points[0], XYZ_points[1], XYZ_points[2]);
                collectionOfPoints.addPoint(currentPoint);
            }

        } catch (FileNotFoundException notFoundException) {
            System.out.println("File " + (fileName) + " was not found!");
        } catch (NullPointerException nullPointerException) {
            System.out.printf("Pathname/filename is null!");
        } catch (IndexOutOfBoundsException outOfBoundsException) {
            System.out.printf("More than three numbers/points are detected!");
        } catch (IllegalArgumentException argumentException) {
            System.out.printf("Not correct numeric value!");
        } catch (Exception e) {
            System.out.println("The file can't be accessed, parsed or do not exist!" + e.getMessage());
        } finally {
            reader.close();
        }
        return collectionOfPoints;
    }

}

package genericClasses;

import genericClasses.models.GenericList;

public class Test {
    public static void main(String[] args) {

        GenericList<Integer> genericInts = new GenericList<Integer>();
        genericInts.Add(5);
        genericInts.Add(10);
        genericInts.Add(20);


        for (var genericInt : genericInts) {
            var tmpStr = genericInt != null ? genericInt.toString() : "";  //Generic array can be initialized, but can be null (have no value). This will prevent exception.
            System.out.println(String.join("", tmpStr));
        }

    }
}

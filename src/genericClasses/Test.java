package genericClasses;

import genericClasses.models.GenericList;

public class Test {
    public static void main(String[] args) {

        //Create new Generic List of Integers and add some items.
        var genericInts = new GenericList<Integer>(3);
        genericInts.Add(5);
        genericInts.Add(10);
        genericInts.Add(20);
        System.out.println(genericInts);

        //for (var genericInt : genericInts) {  //This will show null values too.
        //    System.out.println(genericInt);
        //}

        //Create new Generic List of Strings and add some items.
        var genericStrings = new GenericList<String>(4);
        genericStrings.Add("aaa");
        genericStrings.Add("bbb");
        genericStrings.Add("ccc");
        System.out.println(genericStrings);

        //Test Remove method.
        genericInts.Remove(2);
        System.out.println(genericInts);
    }
}

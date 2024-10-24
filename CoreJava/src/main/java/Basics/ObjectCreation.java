package Basics;

public class ObjectCreation implements Cloneable{
    String name1 = "Object1";
    String name2 = "Object2";
    String name3 = "Object3";

    public static void main(String[] args) throws CloneNotSupportedException {

        //Create Object using new keyword
        ObjectCreation oc1 = new ObjectCreation();
        System.out.println(oc1.name1);

        //Create object using assignment operator(Deep cloning)
        ObjectCreation oc2 = oc1;
        System.out.println(oc1+"    "+oc2);

        //Create Object using Clone method (Shallow Cloning)
        ObjectCreation oc3 = (ObjectCreation) oc1.clone();
        System.out.println(oc1+"    "+oc3);

    }
}

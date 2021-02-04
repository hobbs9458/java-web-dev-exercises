package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {
        Cat myCat = new HouseCat("Garfield", 13);
        HouseCat myOtherCat = new HouseCat("Other Cat", 15);


        System.out.println(((HouseCat) myCat).purr());




    }
}

package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String name) {
        this.name = name;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if (isSatisfied()) {
            return "Hello my name is " + this.name + "!";
        } else {
            return super.noise();
        }
    }

    public String purr() {
        return "I'm a HouseCat";
    }

//    @Override
//    public String toString() {
//        return "HouseCat{" +
//                "name='" + name + '\'' +
//                ", species='" + species + '\'' +
//                '}';
//    }
}



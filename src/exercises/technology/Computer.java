package exercises.technology;

public class Computer extends AbstractEntity {
    private boolean isOn;
    private String operatingSystem;
    private boolean hasVirus = false;
    private int numOfViruses;

    public Computer(boolean isOn, String operatingSystem) {
        setId();
        this.isOn = isOn;
        this.operatingSystem = operatingSystem;
    }

    public Computer() {
        setId();
        this.isOn = false;
        this.operatingSystem = "OS unknown. Add using setter.";
        this.hasVirus = false;
        this.numOfViruses = 0;
    }

    //getters

    public int getId() {
        return this.id;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public boolean isHasVirus() {
        return hasVirus;
    }

    //setters

    public void setOn() {
        isOn = true;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setNumOfViruses(int numOfViruses) {
        this.numOfViruses = numOfViruses;
        if(this.numOfViruses > 0) {
            this.hasVirus = true;
        }
    }

    //methods

    //method should scan for viruses; have separate method for removing


    public String printMsg(String message) {
        return message;
    }

    public String virusScan() {
        if(this.hasVirus) {
            return "We found " + this.numOfViruses + " viruses on your machine.";
        }
        return "Scan complete. No viruses were found.";
    }

    public void removeViruses() {
        this.numOfViruses = 0;
        this.hasVirus = false;
    }

    public void turnOff() {
        this.isOn = false;
    }

    //toString

    @Override
    public String toString() {
        return "Computer{" +
                "isOn=" + isOn +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", hasVirus=" + hasVirus +
                ", numOfViruses=" + numOfViruses +
                '}';
    }
}

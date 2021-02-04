package exercises.technology;

public class SmartPhone extends Computer {
    private String cellSignal;

    //constructors
    public SmartPhone(boolean isOn, String operatingSystem, String cellSignal) {
        super(isOn, operatingSystem);
        this.cellSignal = cellSignal;
    }

    public SmartPhone(String cellSignal) {
        this.cellSignal = cellSignal;
    }

    public SmartPhone() {
        this.cellSignal = "Cell signal unavailable. Use setter to set signal.";
    }

    //getters
    public String getCellSignal() {
        return cellSignal;
    }

    public int getId() {
        return this.id;
    }

    //setters
    public void setCellSignal(String cellSignal) {
        if(cellSignal.toLowerCase() == "low" || cellSignal.toLowerCase() == "medium" || cellSignal.toLowerCase() == "high") {
            this.cellSignal = cellSignal;
        } else {
            System.out.println("That's not a valid signal setting. Please enter 'low' 'medium' or 'high' to set signal.");
        }
    }

    //methods
    public void sendTxtMsg(String message, String contact) {
        System.out.println("The following message was sent to " + contact + ": " + message);
    }

    //toString
    @Override
    public String toString() {
        return "SmartPhone{" +
                "cellSignal='" + cellSignal + '\'' +
                '}';
    }
}

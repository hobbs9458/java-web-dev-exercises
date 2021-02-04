package exercises.technology;

public class Laptop extends Computer {
    private boolean hasKeyboard = true;

    //constructors


    public Laptop(boolean isOn, String operatingSystem) {
        super(isOn, operatingSystem);
    }

    public Laptop() {

    }
    //getters

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    //methods
    public void email(String message, String contact) {
        System.out.println("We sent the following message to " + contact + ": " + message);
    }
}

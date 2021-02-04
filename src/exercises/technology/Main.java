package exercises.technology;

public class Main {
    public static void main(String[] args) {
        Computer myFirstPC = new Computer(true, "Windows 10");
        System.out.println(myFirstPC.getId());

        Computer mySecondPC = new Computer(true, "Windows 10");
        System.out.println(mySecondPC.getId());

        Computer myThirdPC = new Computer(true, "Windows 10");
        System.out.println(myThirdPC.getId());

        SmartPhone iphone = new SmartPhone("high");
        System.out.println(iphone.getId());

        SmartPhone iphone2 = new SmartPhone("high");
        System.out.println(iphone2.getId());

        Laptop myLaptop = new Laptop(true, "Mac OS");
        System.out.println(myLaptop.getId());

        System.out.println(myFirstPC.getId());



    }
}

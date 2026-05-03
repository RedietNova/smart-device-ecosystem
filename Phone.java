public class Phone extends Device {

    public Phone(String brand, int battery) {
        super(brand, battery);
    }

    @Override
    public void useDevice() {
        System.out.println(brand + " phone is making a call...");
        useBattery(10);
    }

    public void takePhoto() {
        System.out.println("Taking a photo.");
        useBattery(5);
    }

    public static void info() {
        System.out.println("Phones are used for communication.");
    }
}

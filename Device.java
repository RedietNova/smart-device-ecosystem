
public class Device {
    protected String brand;
    protected int battery;

    public Device(String brand, int battery) {
        this.brand = brand;
        this.battery = battery;
    }

    public void useDevice() {
        System.out.println("Using a generic device...");
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery: " + battery + "%");
    }

    public void useBattery(int amount) {
        battery -= amount;
        if (battery < 0) battery = 0;
        System.out.println("Battery now: " + battery + "%");
    }

    public final void turnOff() {
        System.out.println("Device is now OFF.");
    }

    public static void info() {
        System.out.println("Devices are electronic tools.");
    }
}
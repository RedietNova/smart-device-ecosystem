public final class SmartWatch extends Device {

    public SmartWatch(String brand, int battery) {
        super(brand, battery);
    }

    @Override
    public void useDevice() {
        System.out.println(brand + " smartwatch is tracking activity...");
        useBattery(5);
    }
}

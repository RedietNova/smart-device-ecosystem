public class GamingLaptop extends Laptop {

    public GamingLaptop(String brand, int battery) {
        super(brand, battery);
    }

    @Override
    public void useDevice() {
        super.useDevice();
        System.out.println("Running high-performance applications.");
        useBattery(20);

    }
}
    


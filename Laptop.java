public class Laptop extends Device {

    public Laptop(String brand, int battery) {
        super(brand, battery);
    }

    @Override
    public void useDevice() {
        System.out.println(brand + " laptop is running programs...");
        useBattery(15);
    }
}

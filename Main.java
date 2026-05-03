import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Phone phone = new Phone("Samsung", 80);
        Laptop laptop = new Laptop("Dell", 70);
        GamingLaptop gamingLaptop = new GamingLaptop("Asus", 90);
        SmartWatch watch = new SmartWatch("Apple", 60);

        int choice;

        do {
            System.out.println("\n=== DEVICE MENU ===");
            System.out.println("1. Phone");
            System.out.println("2. Laptop");
            System.out.println("3. Gaming Laptop");
            System.out.println("4. SmartWatch");
            System.out.println("5. Show Info");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    int phoneChoice;
                    System.out.println("\nPHONE MENU");
                    System.out.println("1. Make Call");
                    System.out.println("2. Take Photo");
                    System.out.println("3. Show Details");
                    System.out.print("Choose: ");
                    phoneChoice = input.nextInt();

                    switch (phoneChoice) {
                        case 1:
                            phone.useDevice();
                            break;
                        case 2:
                            phone.takePhoto();
                            break;
                        case 3:
                            phone.showDetails();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    laptop.useDevice();
                    break;

                case 3:
                    gamingLaptop.useDevice();
                    break;

                case 4:
                    watch.useDevice();
                    break;

                case 5:
                    Device.info();
                    Phone.info();
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        input.close();
    }
}

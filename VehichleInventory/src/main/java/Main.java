import java.util.Scanner;

public class Main {

    static Vehicle[] vehicles = new Vehicle[20];

    public static void main(String[] args) {

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What do you want to do?\n 1 - List all vehicles\n 2 - Search by make/model\n 3 - Search by price range\n 4 - Search by color\n 5 - Add a vehicle\n 6 - Quit");
        System.out.println("Enter 1-6 here: ");
        int userInput = myScanner.nextInt();

        switch (userInput) {
            case 1:
                listAllVehicles();
                break;
            case 2:
                searchByMakeModel();
                break;
            case 3:
                searchByPrice();
                break;
            case 4:
                searchByColor();
                break;
            case 5:
                addAVehicle();
                break;
            case 6:
                System.out.println("Thank you! :)");
                return;
            default:
                System.err.println("ERROR! Please input a number between 1 and 6!");
        }
    }

    //Method to list all vehicles
    static void listAllVehicles() {
        System.out.println("List all vehicles");

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                continue;
            }
            System.out.println((i + 1) + " - " + vehicles[i].getVehicleId() + " " + vehicles[i].getMakeModel() + " " + vehicles[i].getColor() + " " + vehicles[i].getOdometerReading() + " " + vehicles[i].getPrice());
        }
    }

    //Method to search vehicles by make/model
    static void searchByMakeModel() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the make and model to search for (ex: Ford Explorer): ");
        String userInput = myScanner.nextLine().toUpperCase();

        boolean ifFound = false;

        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i] != null) {
                String name = vehicles[i].getMakeModel();

                if (userInput.equals(name.toUpperCase())) {
                    ifFound = true;
                    System.out.println((i + 1) + " - " + vehicles[i].getVehicleId() + " " + vehicles[i].getMakeModel() + " " + vehicles[i].getColor() + " " + vehicles[i].getOdometerReading() + " " + vehicles[i].getPrice());
                }
            }
        }
        if (!ifFound) {
            System.out.println("There are no vehicles with that make and model.");
        }
    }

    // Method to find vehicles by price
    static void searchByPrice() {

        Scanner priceScanner = new Scanner(System.in);

        System.out.println("Enter the lower price");
        int lowerPrice = priceScanner.nextInt();

        System.out.println("Enter the higher price");
        int higherPrice = priceScanner.nextInt();

        if (higherPrice >= lowerPrice) {

            for (int i = 0; i < vehicles.length; i++) {

                if (vehicles[i] != null) {
                    float price = vehicles[i].getPrice();
                    if (price <= higherPrice && price >= lowerPrice) {
                        System.out.println((i + 1) + " - " + vehicles[i].getVehicleId() + " " + vehicles[i].getMakeModel() + " " + vehicles[i].getColor() + " " + vehicles[i].getOdometerReading() + " " + vehicles[i].getPrice());
                    }
                }
            }
        } else {
            System.err.println("ERROR! Lower price is higher than higher price!");
        }


    }

    //Method to search vehicles by color
    static void searchByColor() {
        Scanner myScanner = new Scanner(System.in);

        //get user input
        System.out.println("Enter the color of the car you want to search: ");
        String userInput = myScanner.nextLine().toUpperCase();

        //boolean to see if there is a car that matches
        boolean ifFound = false;

        //
        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i] != null) {
                String color = vehicles[i].getColor();

                if (userInput.equals(color.toUpperCase())) {
                    ifFound = true;
                    System.out.println((i + 1) + " - " + vehicles[i].getVehicleId() + " " + vehicles[i].getMakeModel() + " " + vehicles[i].getColor() + " " + vehicles[i].getOdometerReading() + " " + vehicles[i].getPrice());

                }
            }
        }
        if (!ifFound) {
            System.out.println("There are no vehicles with that color.");
        }
    }

    //Method to add a vehicle
    static void addAVehicle() {
        //collect user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the vehicle ID: ");
        long newVehicleID = Long.parseLong(myScanner.nextLine().trim());

        System.out.println("Enter the vehicle make and model: ");
        String newMakeModel = myScanner.nextLine().trim();

        System.out.println("Enter the vehicle color: ");
        String newColor = myScanner.nextLine().trim();

        System.out.println("Enter the vehicle odometer reading: ");
        int newOdometerReading = Integer.parseInt(myScanner.nextLine().trim());

        System.out.println("Enter the vehicle price: ");
        float newPrice = Float.parseFloat(myScanner.nextLine().trim());

        Vehicle newVehicle = new Vehicle(newVehicleID, newMakeModel, newColor, newOdometerReading, newPrice);

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = newVehicle;
                System.out.println("Vehicle Successfully added!");
                System.out.println((i + 1) + " - " + vehicles[i].getVehicleId() + " " + vehicles[i].getMakeModel() + " " + vehicles[i].getColor() + " " + vehicles[i].getOdometerReading() + " " + vehicles[i].getPrice());
                break;
            }

        }

    }

}

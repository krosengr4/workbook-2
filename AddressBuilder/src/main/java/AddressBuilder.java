import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your first and last name: ");
        String userName = myScanner.nextLine();
        userName = userName.trim();

        System.out.println("Please enter your billing Address: ");
        String billingAddress = myScanner.nextLine();

        System.out.println("Please enter your billing city: ");
        String billingCity = myScanner.nextLine();

        System.out.println("Please enter your billing state: ");
        String billingState = myScanner.nextLine();

        System.out.println("Please enter your billing zip: ");
        int billingZip = myScanner.nextInt();
        myScanner.nextLine();

        StringBuilder billingInfo = new StringBuilder();
        billingInfo
                .append(billingAddress)
                .append("\n")
                .append(billingCity)
                .append(", ")
                .append(billingState)
                .append(" ")
                .append(billingZip);

        System.out.println("Please enter your shipping address: ");
        String shippingAddress = myScanner.nextLine();

        System.out.println("Please enter your shipping city: ");
        String shippingCity = myScanner.nextLine();

        System.out.println("Please enter your shipping state: ");
        String shippingState = myScanner.nextLine();

        System.out.println("Please enter your shipping zip: ");
        int shippingZip = myScanner.nextInt();


        StringBuilder shippingInfo = new StringBuilder();
        shippingInfo
                .append(shippingAddress)
                .append("\n")
                .append(shippingCity)
                .append(", ")
                .append(shippingState)
                .append(" ")
                .append(shippingZip);



        System.out.println(userName);
        System.out.println("Billing Address: " + "\n" + billingInfo + "\n");
        System.out.println("Shipping Address: " + "\n" + shippingInfo);

    }

}

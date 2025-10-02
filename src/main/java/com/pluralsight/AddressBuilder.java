package com.pluralsight;
import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();

        //what does the user need to input
        //name
        //billing address
        //shipping address

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing street: ");
        String billingStreet = scanner.nextLine();
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.print("Billing Zipcode: ");
        String billingZipcode = scanner.nextLine();

        System.out.print("Shipping street: ");
        String shippingStreet = scanner.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.print("Shipping Zipcode: ");
        String shippingZipcode = scanner.nextLine();

       addressInfo.append(fullName).append("\n")
               .append("Billing Address:\n")
               .append(billingStreet).append("\n")
               .append(billingCity).append(",").append(billingState)
               .append(billingStreet).append("\n")

    }
}
package com.pluralsight;
import java.util.Scanner;
public class AddressBuilder {
    private static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();

        //what does the user need to input
        //name
        //billing address
        //shipping address

        System.out.println("Enter Full Name: ");
        String fullName = scanner.nextln();
        addressInfo.append(fullName).append("\n");

        addressInfo.append("Billing Address: \n");
        System.out.print("Billing Street: ");


    }
}

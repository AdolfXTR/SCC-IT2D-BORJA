package adolfborjaa;

import java.util.Scanner;

public class Products {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String customer;
            String productName;
            int quantity;
            double price;
            double cash;
            
            System.out.print("Enter your customer name: ");
            customer = input.nextLine();
            System.out.print("Enter your product name: ");
            productName = input.nextLine();
            System.out.print("Quantity: ");
            quantity = input.nextInt();
            
            System.out.print("Price: ");
            price = input.nextDouble();
            System.out.print("Cash: ");
            cash = input.nextDouble();
            
            double totalDue = quantity * price;
            double change = cash - totalDue;
            
       
            System.out.println("\n---------------------------------------------");
            System.out.println("Receipt");
            System.out.println("Name: " + customer);
            System.out.println("Item: " + productName);
            System.out.printf("Quantity: %d\n", quantity);
            System.out.printf("Total Due: $%.1f\n", totalDue);
            System.out.printf("Cash: $%.1f\n", cash);
            System.out.printf("Change: $%.1f\n", change);
        }
    }
}

package adolfborjaa;

import java.util.Scanner;

public class Adolf41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       
        String customer;
        String productName;
        int quantity;
        int price;
        int cash;  
        System.out.print("Enter your customer name: ");
        customer = input.nextLine();      
        System.out.print("Enter your product name: ");
        productName = input.nextLine();  
        System.out.print("Quantity: ");
        quantity = input.nextInt();
       
       
        System.out.print("Price: ");
        price = input.nextInt();
        System.out.print("Cash: ");
        cash = input.nextInt();    
        int totalDue = quantity * price;
        int change = cash - totalDue;
       
       
        System.out.println("\n---------------------------------------------");
        System.out.println("Receipt");
        System.out.println("Name: " + customer);
        System.out.println("Item: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Due: $" + totalDue);
        System.out.println("Cash: $" + cash);
        System.out.println("Change: $" + change);
       
       
        input.close();
    }
}

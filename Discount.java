package Group;

import java.util.Scanner;

public class Discount {
    static void discount() { // Function / method
       
        String msg = " ";
        double price = 0d;
        double discount = 0d;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter selling price: ");
        price = scanner.nextDouble();

        System.out.print("Enter discount(%): ");
        discount = scanner.nextDouble();

        System.out.println("The new selling price is(%): " + (price - (price * discount / 100)));

        // IF the user want to return to the main menu.
        System.out.println("Do you want to return to the main menu? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("Yes")) {
            discount();
        }
        else if (answer.equals("n") || answer.equals("No")) {
            msg = "Toda!";
        } else {
            msg = "403 Forbidden"; // Http status code
        }
        System.out.println(msg);
        scanner.close();
    }

    public static void main(String[] args) throws Exception{
        discount(); // Calling the method/function
    }
}

package Group;

import java.util.Scanner;

public class Inches {
    static void inches() { // Function / method
        // inches to foot, and inches to meter
        var message = " ";
        int inches = 0;
        double feet = 0d;
        double meter = 0d;

        Scanner converter = new Scanner(System.in);
        System.out.print("Enter inch(es): ");
        inches = converter.nextInt();

        inches = inches * 12;
        feet = inches / 12;
        meter = inches / 39.37;

        System.out.println(inches + " inches = " + feet + " feet");
        System.out.println(inches + " inches = " + meter + " meters");
        
        // IF the user want to return to the main menu.
        System.out.println("Do you want to return to the main menu? (y/n)");
        String answer = converter.next();
        if (answer.equals("y") || answer.equals("Yes")) {
            inches();
        }
        else if (answer.equals("n") || answer.equals("No")) {
            message = "Salamat!";
        } else {
            message = "405 Method Not Allowed"; // Http status code
        }
        converter.close();
        System.out.println(message);
    }

    public static void main(String[] args) throws Exception{
        inches(); // Calling the method/function
    }
}

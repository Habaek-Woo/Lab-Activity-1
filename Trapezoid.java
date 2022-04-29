package Group;

import java.util.Scanner;

public class Trapezoid {
    static void areaOfTrapezoid() { // Function / method
        // Area of trapezoid
        var notif = " ";
        double base1 = 0d;
        double base2 = 0d;
        double height = 0d;
        double area = 0d;

        Scanner areaTrap = new Scanner(System.in);
        System.out.print("Enter base 1: ");
        base1 = areaTrap.nextDouble();

        System.out.print("Enter base 2: ");
        base2 = areaTrap.nextDouble();

        System.out.print("Enter height: ");
        height = areaTrap.nextDouble();

        area = (base1 + base2) * height / 2;

        System.out.println("The base 1 is: " + base1 + " base 2 is: " + base2 + " and height is: " + height);
        System.out.println("The area of the triangle is: " + area);

        // IF the user want to return to the main menu.
        System.out.println("Do you want to return to the main menu? (y/n)");
        String answer = areaTrap.next();
        if (answer.equals("y") || answer.equals("Yes")) {
            areaOfTrapezoid();
        }
        else if (answer.equals("n") || answer.equals("No")) {
            notif = "Danke!";
        } else {
            notif = "418 I'm a teapot"; // Http status code
        }
        System.out.println(notif);
        areaTrap.close();
    }

    public static void main(String[] args) throws Exception {
        areaOfTrapezoid(); // Calling the method/function
    }
}

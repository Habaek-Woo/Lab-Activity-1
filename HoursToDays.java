package Group;

import java.util.Scanner;

public class HoursToDays {
    static void hoursToDays() { // Function / method
        
        String message = " ";
        int hours = 0;
        int days = 0;

        Scanner hrs = new Scanner(System.in);
        System.out.print("Enter hour(s): ");
        hours = hrs.nextInt();

        
        days = hours / 24;
        hours = hours % 24;


        System.out.print("The equivalent of " + hours + " hour(s) " + " in DD : HH (Days & Hours) is " + days + " day(s) and " + hours + " hour(s)\n");

        // IF the user want to return to the main menu.
        System.out.println("Do you want to return to the main menu? (y/n)");
        String answer = hrs.next();
        if (answer.equals("y") || answer.equals("Yes")) {
            hoursToDays();
        }
        else if (answer.equals("n") || answer.equals("No")) {
            message = "Arigato!";
        } else {
            message = "406 Not Acceptable"; // Http status code
        }
        System.out.println(message);
        hrs.close();
    }
    
    public static void main(String[] args) throws Exception{
        hoursToDays(); // Calling the method/function
    }
}

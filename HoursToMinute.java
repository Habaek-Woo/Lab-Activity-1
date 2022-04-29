package Group;

import java.util.Scanner;

public class HoursToMinute {
    static void hoursToMinute() { // Function / method
        String alert = " ";
        int hours = 0;
        int minutes = 0;
        double seconds = 0d;

        Scanner hrsminsec = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = hrsminsec.nextInt();

        minutes = hours * 60;
        seconds = hours * 3600;

        System.out.println(hours + " hrs" + " is equivalent to " + minutes + " minutes");
        System.out.println(hours + " hrs" + " is equivalent to" + seconds + " seconds");

         // IF the user want to return to the main menu.
         System.out.println("Do you want to return to the main menu? (y/n)");
         String answer = hrsminsec.next();
         if (answer.equals("y") || answer.equals("Yes")) {
             hoursToMinute();
         }
         else if (answer.equals("n") || answer.equals("No")) {
             alert = "Thank you!";
         } else {
             alert = "404 Not Found"; // Http status code
         }

         System.out.println(alert);
         hrsminsec.close();
        
    }

    public static void main(String[] args) throws Exception{
        hoursToMinute(); // Calling the method/function
    }
}

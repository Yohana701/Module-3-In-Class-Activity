//Step 1: Set up the main class and import all the necessary packages
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args){
        //Step 2: Declare variables for user input and conversion factors
        int minutes;
        int hours;
        double days;
        int MIN_IN_HR = 60;
        double HRS_IN_DAY = 24;
        //Step 3: Prompt the user for input
        Scanner input = new Scanner (System.in);
        System.out.print("Enter minutes: ");
        minutes = input.nextInt();
        //Step 4: Perform the conversion
        hours = minutes/ MIN_IN_HR;
        days = hours/ HRS_IN_DAY;
        //Step 5: Display the result
        System.out.println(minutes + " minutes is " + hours + " hours or " + days + " days. ");
    }
}

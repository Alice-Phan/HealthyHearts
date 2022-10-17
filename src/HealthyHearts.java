import java.util.Scanner;


public class HealthyHearts {

    public static void main(String[] args) {
        // Declared int variable for the age of a user
        int age;
        // Declare variables for heart rate, min and max heart rate zones
        double maxHR;
        double maxHRZone;
        double minHRZone;

        System.out.println("What is your age? ");
        Scanner ageInput = new Scanner(System.in);
        age = ageInput.nextInt();

        // Calculate the values of min and max heart rate zone
        maxHR = 220 - age;
        minHRZone = maxHR * 50 / 100;
        maxHRZone = maxHR * 85 / 100;

        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR zone is " + minHRZone + " - " + maxHRZone + " beats per minute.");


    }
}

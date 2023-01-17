import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("car");
        scan.close();
    }

    static void drive(String car) {

        System.out.println("Driving!");
        take(car);

        String feedback = getFeedBack(car);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixRetake(car);

            // Recursive call
            drive(car);
        } else if (feedback.equals("yes")) {
            pass(car);
        }
    }

    static void take(String car) {
        System.out.println("Learning");
    }

    static String getFeedBack(String car) {
        System.out.println("Did I pass the driving? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRetake(String car) {
        System.out.print("Retake exam:");
        System.out.println("Retaking exam. Added " );
    }

    static void pass(String car) {
        System.out.println("I passed");
    }

}

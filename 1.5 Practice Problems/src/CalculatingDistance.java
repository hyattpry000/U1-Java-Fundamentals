public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */
    public static void main(String[] args) {
        double mph = 76.0;
        double mins = 120.0;

        double miles = mins * mph / 60;


        System.out.print("You've traveled " + miles + " miles");
    }
}

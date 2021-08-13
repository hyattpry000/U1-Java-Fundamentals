public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
        double ogCost = 59.99;
        double discount = .2;
        double takenOff = ogCost * .2;

        double finalCost = ogCost - takenOff;

        System.out.println("The total after discount is $" + finalCost);
    }
}

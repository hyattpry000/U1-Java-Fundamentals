public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int seconds = 3680;

        int hours = seconds / 3600;
        seconds = seconds % 3600;

        int minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println("there are " + hours + " hours");
        System.out.println("there are " + minutes + " minutes");
        System.out.println("there are " + seconds + " seconds");
    }
}

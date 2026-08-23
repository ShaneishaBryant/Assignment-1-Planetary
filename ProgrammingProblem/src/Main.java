import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner program = new Scanner(System.in);

        System.out.println("Welcome to The Galatic Bureau of Interstellar Tourism\n" +
                "proudly guiding curious minds across the cosmos. \nEnter your name:");
        String name = program.nextLine();

        String newentry;
        do {
            System.out.println("Enter the name of the plant you wish to visit:");
            String plant = program.nextLine();


            System.out.println("Greetings," + name + " you wish to visit " + plant + ".");


            System.out.println("Let's check the plants temperature.\n" +
                    "What is the planet's average temperature in degrees Celsius?");
            int temp = program.nextInt();

            if (temp > 100 || temp < -50) {
                System.out.println("Caution: This plant is too extreme for human life.");
            } else {
                System.out.println("This planet's temperature is safe to visit.");
            }


            System.out.println("On a scale of 1 (Standard) to 5 (Premium Luxury),\n" +
                    "what is your travel preference?");

            int rating = program.nextInt();

            switch (rating) {
                case 5:
                    System.out.println("Absolute Paradise!");
                    break;
                case 4, 3:
                    System.out.println("Quite Comfortable");
                    break;
                case 2, 1:
                    System.out.println("Roughing it in the cosmos.");
                    break;
                default:
                    System.out.println("Invalid entry.");
                    break;
            }

            program.nextLine();

            System.out.println("Would you like to check out another planet before your voyage? " +
                    "(Yes/No): ");

            newentry = program.nextLine();

        }while (newentry.equalsIgnoreCase("Yes"));

        System.out.println("Safe voyage may the odds be ever in your favor!");
    }
}
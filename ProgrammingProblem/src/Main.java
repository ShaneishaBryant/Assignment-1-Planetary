import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner program = new Scanner(System.in);

        System.out.println("Welcome to The Galatic Bureau of Interstellar Tourism\n" +
                "proudly guiding curious minds across the cosmos. \nEnter your name:");
        String name = program.nextLine();

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
    }
}
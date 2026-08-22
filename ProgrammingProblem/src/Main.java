import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner greeting = new Scanner(System.in);

        System.out.println("Welcome to The Galatic Bureau of Interstellar Tourism\n" +
                "proudly guiding curious minds across the cosmos. \nEnter your name:");
        String name = greeting.nextLine();

        System.out.println("Enter the name of the plant you wish to visit:");
        String plant = greeting.nextLine();


        System.out.println("Greetings," + name + " you wish to visit " + plant + ".");

    }
}
import java.util.Scanner;

public class Lab3 {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int secInt = 37;

        boolean correct = false;
        while (!correct) {
            int guess = getIntInput("Guess the secret number between 1-100: "); //AI assistance was used here to tell me to put the input statement in the while loop. Before hand it was outside.
            if (guess == secInt) {
                System.out.println("You got it correct!");
                correct = true;
            } else if (guess > secInt && guess <= 100 && guess >= 1) {
                System.out.println("Too high!");
            } else if (guess < secInt && guess <= 100 && guess >= 1) {
                System.out.println("Too low!");
            } else {
                System.out.println("Is this even between 1-100?");

            }
        }

        // Use getInput("Enter something: ") for strings
        // Use getIntInput("Enter a number: ") for integers

        // Example usage:
        // String name = getInput("What's your name? ");
        // int age = getIntInput("What's your age? ");
        // System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
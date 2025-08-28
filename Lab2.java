import java.util.Scanner;

public class Lab2 {
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
        int firstInt = getIntInput("Enter first test score: ");
        int secInt = getIntInput("Enter second test score: ");
        int thirdInt = getIntInput("Enter third test score: ");
        float testAvg = (firstInt + secInt + thirdInt)/3;
        System.out.println("Your Average is: " + testAvg);
        if (testAvg >= 90 && testAvg <= 100) {
            System.out.println("Your letter grade is: A");
        }
        if (testAvg >= 80 && testAvg <= 89) {
            System.out.println("Your letter grade is: B");
        }
        if (testAvg >= 70 && testAvg <= 79) {
            System.out.println("Your letter grade is: C");
        }
        if (testAvg >= 60 && testAvg <= 69) {
            System.out.println("Your letter grade is: D");
        }
        if (testAvg < 60) {
            System.out.println("Your letter grade is: F");
        }
        // Use getInput("Enter something: ") for strings
        // Use getIntInput("Enter a number: ") for integers

        // Example usage:
        // String name = getInput("What's your name? ");
        // int age = getIntInput("What's your age? ");
        // System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read from System.in

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text (the name)

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer (the age)

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close(); // Close the scanner to release resources
    }
}
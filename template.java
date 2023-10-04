import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        while (repeat == true) {
            do {
                System.out.println("Select your operator (*/+): ");
                String operator = scanner.next();
            } while (operator != "*" || operator != "+");
            
            System.out.println("Enter your first number: ");
            int num1 = scanner.nextInt();
            
            System.out.println("Enter your second number: ");
            int num2 = scanner.nextInt();
    
            if (operator == "*") {
                System.out.println("Your result is: " + Integer.toString(add(num1, num2)));
            }
    
            else {
                System.out.println("Your result is: " + Integer.toString(multiply(num1, num2)));
            }

            do {
                System.out.println("Do you wish to continue (y/n): ");
                String value = scanner.next();
            } while (repeat != "y" || operator != "n");

            if (value == "n") {
                repeat = false;
            }

        }

        scanner.close();
    }

    public static void add(int num1, int num2) {

    }

    public static void multiply(int num1, int num2) {

    }
}

// select your operator : 
// enter your first number: 
// enter your second number: 

// Computing... 
// Your result: 

// Do you wish to continue (y/n)
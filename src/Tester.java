import java.util.Scanner;

public class Tester {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String input;
        int binary;

        while (true) {
            System.out.print("Enter an odd number of integers: ");
            input = scanner.nextLine();

            try {
                binary = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                binary = -1;
            }

            if (binary != -1) {
                break;
            }

            System.out.println("Invalid input error.");
        }

        scanner.close();

        // Onion onion = new Onion(input);
        System.out.println(input);
    }
}
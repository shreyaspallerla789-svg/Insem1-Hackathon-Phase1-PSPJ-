import java.util.Scanner;

public class WasteStatusChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the waste collected in kilograms from the user
        System.out.print("Enter the amount of waste collected in kilograms: ");
        double wasteCollected = scanner.nextDouble();

        // Checking the status using an if-else statement
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        
        scanner.close();
    }
}
    


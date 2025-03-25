import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
       // String name = scanner.nextLine();
       // System.out.println("Hello, " + name);

        System.out.println("Enter a grade (A, B, C, D, F):");
        char grade = scanner.next().toUpperCase().charAt(0); // Reads a word from input, converts it to uppercase, and takes the first character
        switch (grade) {
            case 'A':
                System.out.println("🎉 Excellent!");
                break;
            case 'B':
                System.out.println("👍 Well done!");
                break;
            case 'C':
                System.out.println("🙂 Good effort!");
                break;
            case 'D':
                System.out.println("⚠️ Needs improvement.");
                break;
            case 'F':
                System.out.println("❌ Failed. Better luck next time!");
                break;
            default:
                System.out.println("❓ Invalid grade entered.");
        }
        scanner.close(); // Closes the scanner and releases the underlying input resource (e.g., System.in)

    }
}

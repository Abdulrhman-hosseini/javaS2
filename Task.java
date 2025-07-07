import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        System.out.print("Enter your nationality: ");

        int age = scanner.nextInt();



        String nationality = scanner.next();

        if (age >= 18 && nationality.equalsIgnoreCase("Egyptian")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }
    }
}

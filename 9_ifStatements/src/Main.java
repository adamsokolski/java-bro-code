import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        if (age >= 75) {
            System.out.println("FeelsOldMan");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are teenager!");
        } else {
            System.out.println("You are NOT an adult!");
        }

    }
}

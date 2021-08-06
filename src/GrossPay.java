import java.util.Scanner;

public class GrossPay {

    public static void main(String[] args) {
        // get hours
        System.out.println("Enter number of working hours:");

        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter work rate:");
        double rate = scanner.nextDouble();

        scanner.close();

        double wage = hours * rate;

        System.out.println("$ " + wage);
    }

}

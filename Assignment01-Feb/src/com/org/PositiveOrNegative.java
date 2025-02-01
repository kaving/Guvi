import java.util.Scanner;

/**
 *
 * @author kavinkumarganesan
 */
public class PositiveOrNegative {
    public static void main(String[] args) {
        int number;
        try (Scanner obj = new Scanner(System.in)) {
            number = obj.nextInt();
            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
}

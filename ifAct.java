import java.util.Scanner;
public class ifAct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        double score = scanner.nextDouble();
        if (score > 60) {
            System.out.println("You are pass.");
        } else {
            System.out.println("You are not pass.");
        }
        scanner.close();
    }
}

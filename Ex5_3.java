import java.util.Scanner;
public class Ex5_3 {
 
    public static int findMaximum(int a, int b) {
     
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int maximum = findMaximum(num1, num2);
        System.out.println("The maximum value is: " + maximum);
        scanner.close();
    }
}
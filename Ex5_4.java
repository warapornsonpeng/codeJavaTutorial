import java.util.Scanner;
public class Ex5_4 {
    public static String checkEvenOrOdd(int number) {
        // ใช้การตรวจสอบหารด้วย 2
        if (number % 2 == 0) {
            return "Even";  // ถ้าหารด้วย 2 ลงตัว หมายถึงเลขคู่
        } else {
            return "Odd";   // ถ้าไม่ลงตัว หมายถึงเลขคี่
        }
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = checkEvenOrOdd(num);
        System.out.println("The number " + num + " is " + result + ".");
        scanner.close();
    }
}

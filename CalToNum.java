import java.util.Scanner;
public class CalToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //แสดงเมนู
        System.out.println("Select an option: ");
        System.out.println("1. Addition ");
        System.out.println("2. Multiplication ");
        System.out.println("3. Division ");
        System.out.println("4. Subtraction ");

        // รับการเลือกของผู้ใช้
        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        // ตรวจสอบการเลือก
        if (choice < 1 || choice > 4) {
        System.out.println("Invalid choice. Please select a number between 1 and 4.");
        scanner.close();
         return;
}

        // รับตัวเลขจากผู้ใช้
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // คำนวณและแสดงผลลัพธ์ตามการเลือก
        switch (choice) {
        case 1:
        System.out.println("Result: " + (num1 + num2));
        break;
        case 2:
        System.out.println("Result: " + (num1 * num2));
        break;
        case 3:
        if (num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        break;
        case 4:
        System.out.println("Result: " + (num1 - num2));
        break;
        default:
        System.out.println("Invalid choice.");
        break;
}

// ปิด scanner
scanner.close();
    }
}
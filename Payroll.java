 import java.util.Scanner;
public class Payroll {

    public static void main(String[] args) {
    /*
    1.nextByte()
    2.nextDouble()
    3.nextFloat()
    4.nextInt()
    5.nextLine()
    6.nextLong()
    7.nextShort()
     */
    String name;
    int hours;
    double payRate;
    double grossPay;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your name? : ");
    name = keyboard.nextLine();
    System.out.print("How many hours did you work this week? : ");
    hours = keyboard.nextInt();
    System.out.print("What is your hourly pay rate? : ");
    payRate = keyboard.nextDouble();
    grossPay = hours * payRate;
    System.out.println("Hello "+name);
    System.out.println("Your pay is "+grossPay);   
    }
}

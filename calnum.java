import java.util.Scanner; //step1 เรียกใช้คลาส Scanner
public class calnum {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in); //step2 สร้างออบเจ็กซื in สำหรับรับช้อมูล
        System.out.print("Input Number1 : ");
        x=in.nextInt(); //step3 รับตัวเลขเป็นจำนวนเต็มเก็บในตัวแปร x
        System.out.print("your number1 is" +x);
        System.out.print("Input number2 is");
        y = in.nextInt();
        System.out.println("you number2 is "+y);
        System.out.println(x + "+" +y+ " = "+(x+y));
    }
}

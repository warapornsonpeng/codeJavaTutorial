public class Ex5_2 {
    
    public static int cube(int x) {
       return x * x * x;
   }

   public static void main(String[] args) {
       
       for (int x = 1; x <= 10; x++) {
           int result = cube(x);
           System.out.println("The cube of " + x + " is: " + result);
       }
   }
}
public class ExNo2 {
    public static void main(String[] args) {
       int upperLimit = 100;
       System.out.println("Numbers that are divisible by 3 and 5 (Not more than " + upperLimit + "):");
       for (int i = 1; i <= upperLimit; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println(i);
           }
       }  
    }
}
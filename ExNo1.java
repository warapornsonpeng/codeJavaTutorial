public class ExNo1 {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
       
        System.out.println("An even integer between " + start + " - " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {  // ตรวจสอบว่าเลข `i` เป็นเลขคู่
                System.out.println(i);
            }
        }
    }
}
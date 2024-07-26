public class StringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        /*
         เมดธอดพื้นฐาน
         1. toUperCase() ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่
         2. toLowerCase() ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
         3. length() เก็บความยาวของสตริง
         4. charAt(2) บอกให้เก็บตัวอักษรตามตำแหน่งที่ระบุ
         */
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char length = message.charAt(3);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(length);
        
    }
}

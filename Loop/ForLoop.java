public class ForLoop {
    public static void main(String[] args) {
        /**
            ใช้ทำซํ้าในกรณีที่รอบชัดเจน
            3 ส่วน
            ส่วนตัวแปร => ตัวนับรอบ
            เงื่อนไข
            การเพิ่มค่ / ลดค่า
         */
        for(int count = 100; count >= 1; count--){ //count-- => count-=1
            System.out.println("รอบที่ = " + count + " Hello World");
        }
    }
}

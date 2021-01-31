public class MethodInputData {
    public static void main(String[] args) {
        //การเรียกใช้งาน
        fullName("Puttipob","Noracharoen");
        plus(10,20,30);
        subTract(10, 20, 30);
    }
    // การสร้างเมธอด
    static void display(String message) { // message คือ parameter
        // กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("แสดงคำว่า = "+message);
    }

    static void fullName(String firstname , String lastname){
        System.out.println("ชื่อ = "+firstname+" นามสกุล = "+lastname);
    }

    static void plus(int x , int y, int z){
        int ans = x + y + z;
        System.out.println("ผลบวกตัวเลข = "+ans);
    }

    static void subTract(int x, int y, int z) {
        int ans = x - y - z;
        System.out.println("ผลลบตัวเลข = " + ans);
    }
}

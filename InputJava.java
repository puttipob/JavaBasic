import java.util.Scanner;

public class InputJava {
    public static void main(String[] args) {
        // รับค่าข้อมูล
        // ข้อมูลแบบไหน ? ตัวเลข integer, float, long, double, ข้อความ String
        // ข้อความทำอะไร
        // ข้อตวามแบบตัวเลข => คำนวณได้

        //ประกาศ Class | new
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ = ");
        String name = sc.nextLine(); //รับค่า String จากแป้นพิมพ์ => name

        System.out.print("ป้อน พ.ศ = ");
        double year = sc.nextDouble(); //รับค่า integer จากอป้นพิมพ์ => year

        double age = 2564 - year; //คำนวณอาขุ

        System.out.println("ชื่อของคุณ คือ = "+name); //แสดงข้อความที่พิมพ์
        System.out.println("ปีเกิด = "+year);
        System.out.println("อายุ = "+age);
    }
}

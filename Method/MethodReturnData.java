import java.util.Scanner;
public class MethodReturnData {
    public static void main(String[] args) {
        // โปรแกรมหลัก
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนเงินเดือนของคณ = ");
        double salary = kb.nextDouble();
        System.out.println("เงินเดือน = "+salary);
        double bonus = getBonus();
        salary += bonus;
        System.out.println("เงินเดือน + โบนัส = "+salary);
        System.out.println("ที่อยู่ = "+getMyAddress());
    }
    // modifier ชนิดข้อมูลที่จะส่งออกมาในโปรแกรมหลัก ชื่อเมธอด(){}
    static String getIP(){
        return "127.0.0.1";
    }

    static Double getBonus(){
        return 1000.0;
    }

    static String getMyAddress(){
        String city = "ปทุมธานี";
        return city;
    }
}
